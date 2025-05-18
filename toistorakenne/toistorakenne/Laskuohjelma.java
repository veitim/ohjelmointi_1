package toistorakenne;

import java.util.Scanner;

public class Laskuohjelma {
	/*
	 * Tee ohjelma, jolla ala-asteen opettaja voi testata oppilaiden
	 * kertolaskutaitoja. Ohjelma kysyy oppilaalta 10 kertolaskua. Jokaisen laskun
	 * kohdalla ohjelma kertoo, oliko oppilaan vastaus oikein vai v‰‰rin. Lis‰ksi
	 * ohjelman kertoo lopuksi, montako laskua oppilaalla oli oikein. Luvut voit
	 * arpoa luku1 = (int) (Math.random() * 9) + 1; luku2 = (int) (Math.random() *
	 * 9) + 1;
	 */

	public static void main(String[] args) {
		int luku1, luku2, tulo, vastaus;
		int oikeita = 0;
		Scanner input = new Scanner(System.in);

		// Annetaan 10 laskutoimitusta
		for (int i = 1; i <= 10; i++) {
			// Arvotaan kerrottavat
			luku1 = (int) (Math.random() * 9) + 1;
			luku2 = (int) (Math.random() * 9) + 1;

			// Lasketaan oikea vastaus
			tulo = luku1 * luku2;

			System.out.print(luku1 + "*" + luku2 + "=");
			vastaus = input.nextInt();

			// Jos vastaus oli oikein
			if (vastaus == tulo) {
				System.out.println("Oikein");
				// Lis‰t‰‰n yksi oikeisiin vastauksiin
				oikeita++;
			} else {
				System.out.println("V‰‰rin. Oikea vastaus oli " + tulo);
			}

		}

		System.out.println("Oikeita vastauksia oli " + oikeita);
	}

}
