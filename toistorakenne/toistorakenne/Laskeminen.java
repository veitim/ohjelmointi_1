package toistorakenne;

import java.util.Scanner;

public class Laskeminen {

	/*
	 * Tee ohjelma, joka kysyy k‰ytt‰j‰lt‰ kertolaskun vastausta niin kauan, kunnes
	 * vastaus on oikein.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int luku1, luku2, tulo, vastaus;
		// Kertoo, onko k‰ytt‰j‰ antanut oikeaa vastausta
		// Alkuarvona on ep‰tosi (false)
		boolean oikein = false;

		// Arvotaan luvut
		luku1 = (int) (Math.random() * 9) + 1;
		luku2 = (int) (Math.random() * 9) + 1;
		tulo = luku1 * luku2;

		// Lopussa testataan, voidaanko toisto tehd‰ uudelleen
		do {
			System.out.print(luku1 + " * " + luku2 + " = ");
			vastaus = input.nextInt();
			if (vastaus == tulo) {
				System.out.println("Oikein");
				// Vastaus oli oikein, joten laitetaan oikein-muuttajaan arvo
				// tosi (true)
				oikein = true;
			} else {
				System.out.println("V‰‰rin");
			}
		} while (oikein == false); // Silmukkaa toistetaan niin kauan kuin
									// oikein on ep‰tosi (false) eli k‰ytt‰j‰ ei
									// ole antanut oikeaa vastausta
		// do - while rakenne p‰‰ttyy puolipisteeseen

	}
}
