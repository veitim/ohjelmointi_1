package valintarakenne;

import java.util.Scanner;

public class Ika {

	/*
	 * Tee ohjelma (kalvoesimerkkin�), joka kysyy i�n. Jos ik� on alle 0 tai yli
	 * 120, anna virheilmoitus. Jos ik� on alle 18, kerro, ett� on alaik�inen,
	 * muuten kerro, ett� k�ytt�j� on t�ysi-ik�inen.
	 */

	public static void main(String[] args) {
		int ika;
 
		Scanner input = new Scanner(System.in);
		System.out.print("Anna ik�: ");
		ika = input.nextInt();

		// Jos ika-muuttuja on pienempi kuin nolla tai suurempi kuin 120
		if (ika < 0 || ika > 120) {
			System.out.println("Virheellinen ik�");
		}
		// Muuten jos ika-muuttuja on pienempi kuin 18
		else if (ika < 18) {
			System.out.println("Alaik�inen");
		}
		// Kaikissa muissa tapauksissa (eli ika 18-120)
		else {
			System.out.println("T�ysi-ik�inen");
		}

	}

}
