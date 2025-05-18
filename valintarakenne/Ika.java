package valintarakenne;

import java.util.Scanner;

public class Ika {

	/*
	 * Tee ohjelma (kalvoesimerkkinä), joka kysyy iän. Jos ikä on alle 0 tai yli
	 * 120, anna virheilmoitus. Jos ikä on alle 18, kerro, että on alaikäinen,
	 * muuten kerro, että käyttäjä on täysi-ikäinen.
	 */

	public static void main(String[] args) {
		int ika;
 
		Scanner input = new Scanner(System.in);
		System.out.print("Anna ikä: ");
		ika = input.nextInt();

		// Jos ika-muuttuja on pienempi kuin nolla tai suurempi kuin 120
		if (ika < 0 || ika > 120) {
			System.out.println("Virheellinen ikä");
		}
		// Muuten jos ika-muuttuja on pienempi kuin 18
		else if (ika < 18) {
			System.out.println("Alaikäinen");
		}
		// Kaikissa muissa tapauksissa (eli ika 18-120)
		else {
			System.out.println("Täysi-ikäinen");
		}

	}

}
