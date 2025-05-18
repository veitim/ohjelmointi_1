package taulukko;

import java.util.Scanner;

public class Tikkakisa_6 {

	/**
	 * Tee ohjelma, jolla voidaan kysy‰ ja n‰ytt‰‰ tikkakisan tulokset. Aluksi
	 * kysyt‰‰n osallistujien lukum‰‰r‰. Sen j‰lkeen kysyt‰‰n kunkin osallistujan
	 * heitt‰m‰t tikat (5 kpl). Lopuksi n‰ytet‰‰n tulokset.
	 */

	public static void main(String[] args) {
		int lukumaara, heitto, summa;

		Scanner input = new Scanner(System.in);

		System.out.print("Montako osallistuu tikkakisaan: ");
		lukumaara = input.nextInt();

		// Luodaan taulukko tulosten tallettamista varten
		int[] tulokset = new int[lukumaara];

		// Kysyt‰‰n kunkin osallistujat tikkaheitot
		for (int i = 0; i < tulokset.length; i++) {
			System.out.print("Anna heitt‰j‰n " + (i + 1) + " tikat (5): ");
			summa = 0;
			// Kyst‰‰n osallistujan tikkalukemat
			for (int j = 0; j < 5; j++) {
				heitto = input.nextInt();
				summa = summa + heitto;
			}
			// Laitetaan tikkojen summa taulukkoon
			tulokset[i] = summa;
		}

		System.out.println("Tulokset");
		// N‰ytet‰‰n tulokset
		for (int i = 0; i < tulokset.length; i++) {
			System.out.println("Heitt‰j‰n " + (i + 1) + " tulos: " + tulokset[i]);
		}

	}

}
