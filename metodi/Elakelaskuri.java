package metodi;

import java.util.Scanner;

public class Elakelaskuri {
	/*
	 * Tee ohjelma, joka kysyy syntym‰vuoden ja sen perusteella selvitt‰‰, kuinka
	 * paljon el‰keik‰ nousee uuden lain mukaan nykyiseen verrattuna. Uuden lain
	 * mukaan - jos syntym‰vuosi on pienempi kuin 1955, el‰keik‰ pysyy ennallaan eli
	 * on 63 vuotta. - jos syntym‰vuosi on suurempi kuin 1961, el‰keik‰ on 65
	 * vuotta. - jos syntym‰vuosi on 1955-1961, el‰keik‰ on 3 kuukautta jokaista
	 * vuotta kohden vuodesta 1954 l‰htien
	 */

	// Metodi pyyt‰‰ syntym‰vuoden ja palauttaa sen return lauseella
	public int kysySyntymavuosi() {
		Scanner input = new Scanner(System.in);

		System.out.print("Anna syntym‰vuotesi: ");
		int syntymavuosi = input.nextInt();

		return syntymavuosi;
	}

	// Metodi laskee, kuinka paljon el‰keik‰ nousee
	// metodi saa parametrina syntym‰vuoden
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
