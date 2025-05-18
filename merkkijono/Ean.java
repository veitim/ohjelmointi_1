package merkkijono;

import java.util.Scanner;

public class Ean {
	/*
	 * EAN-13 on kuluttajapakkauksissa käytetty 13 numeroinen koodi. Jos koodin
	 * alussa on 64, kyseessä on suomalainen koodi. Sen jälkeen on viisinumeroinen
	 * yritystunniste.
	 */

	public static void main(String[] args) {
		String koodi, tunniste, maa;
		Scanner input = new Scanner(System.in);

		System.out.print("Anna EAN koodi: ");
		koodi = input.nextLine();
		
		if (koodi.length() != 13) {
			System.out.println("Koodin pitäisi olla 13 merkkiä");
		} else {
			// Otetaan merkkijonosta paikasta 0 lähtien eli paikat 0-1
			maa = koodi.substring(0, 2);

			// Jos maatunnus on "64", kyseessä on Suomi
			if (maa.equals("64") == true) {
				System.out.println("Suomalainen koodi");
				// Otetaan merkistä kaksi lähtien viisi merkkiä eli paikat 2-6
				tunniste = koodi.substring(2, 7);
				System.out.println("Yritystunniste on " + tunniste);
			} else {
				System.out.println("Ei ole suomalainen koodi");
			}
		}
	}

}
