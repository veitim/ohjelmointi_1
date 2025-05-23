package metodi;

import java.util.Scanner;

public class Elakelaskuri {
	/*
	 * Tee ohjelma, joka kysyy syntymävuoden ja sen perusteella selvittää, kuinka
	 * paljon eläkeikä nousee uuden lain mukaan nykyiseen verrattuna. Uuden lain
	 * mukaan - jos syntymävuosi on pienempi kuin 1955, eläkeikä pysyy ennallaan eli
	 * on 63 vuotta. - jos syntymävuosi on suurempi kuin 1961, eläkeikä on 65
	 * vuotta. - jos syntymävuosi on 1955-1961, eläkeikä on 3 kuukautta jokaista
	 * vuotta kohden vuodesta 1954 lähtien
	 */

	// Metodi pyytää syntymävuoden ja palauttaa sen return lauseella
	public int kysySyntymavuosi() {
		Scanner input = new Scanner(System.in);

		System.out.print("Anna syntymävuotesi: ");
		int syntymavuosi = input.nextInt();

		return syntymavuosi;
	}

	// Metodi laskee, kuinka paljon eläkeikä nousee
	// metodi saa parametrina syntymävuoden
	// metodi palauttaa return lauseella nousun eli int arvon
	public int selvitaNousu(int syntymavuosi) {
		int nousu;
		if (syntymavuosi < 1955) {
			nousu = 0;
		} else if (syntymavuosi > 1961) {
			nousu = 24;
		} else {
			nousu = (syntymavuosi - 1954) * 3;
		}

		return nousu;
	}

	public static void main(String[] args) {
		// On luotava luokan olio, jotta metodia voidaan kutsua
		Elakelaskuri ohjelma = new Elakelaskuri();

		int syntymavuosi, nousee;

		syntymavuosi = ohjelma.kysySyntymavuosi();

		nousee = ohjelma.selvitaNousu(syntymavuosi);
		System.out.println("Nousu on " + nousee + " kuukautta");

	}

}
