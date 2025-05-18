package merkkijono;

import java.util.Scanner;

public class Ean {
	/*
	 * EAN-13 on kuluttajapakkauksissa k�ytetty 13 numeroinen koodi. Jos koodin
	 * alussa on 64, kyseess� on suomalainen koodi. Sen j�lkeen on viisinumeroinen
	 * yritystunniste.
	 */

	public static void main(String[] args) {
		String koodi, tunniste, maa;
		Scanner input = new Scanner(System.in);

		System.out.print("Anna EAN koodi: ");
		koodi = input.nextLine();
		
		if (koodi.length() != 13) {
			System.out.println("Koodin pit�isi olla 13 merkki�");
		} else {
			// Otetaan merkkijonosta paikasta 0 l�htien eli paikat 0-1
			maa = koodi.substring(0, 2);

			// Jos maatunnus on "64", kyseess� on Suomi
			if (maa.equals("64") == true) {
				System.out.println("Suomalainen koodi");
				// Otetaan merkist� kaksi l�htien viisi merkki� eli paikat 2-6
				tunniste = koodi.substring(2, 7);
				System.out.println("Yritystunniste on " + tunniste);
			} else {
				System.out.println("Ei ole suomalainen koodi");
			}
		}
	}

}
