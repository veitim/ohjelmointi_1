package taulukko;

import java.util.Scanner;

public class Koepisteet_2 {

	/**
	 * Tee ohjelma, joka kysyy (max. 100) ja n‰ytt‰‰ koepisteet. Koepisteiden
	 * kysyminen lopetetaan, kun k‰ytt‰j‰ antaa -1 tai taulukko t‰yttyy.
	 */

	public static void main(String[] args) {
		// Taulukon maksimikoko
		final int MAX = 100;

		// Luodaan taulukko
		int[] koepisteet = new int[MAX];
		int koepiste;

		// kertoo, montako koepistett‰ on annettu sek‰ seuraavan vapaan paikan
		// taulukossa
		int lkm = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Anna koepisteet (-1 lopettaa): ");
		koepiste = input.nextInt();

		// Kyst‰‰n pisteit‰ niin kauan kuin pisteet eiv‰t ole -1 eik‰ taulukko
		// ole t‰ynn‰
		while (koepiste != -1 && lkm < MAX) {
			// Laitetaan annettu koepiste taulukkoon
			koepisteet[lkm] = koepiste;
			lkm++;

			// Jos taulukko ei ole viel‰ t‰ynn‰
			if (lkm < MAX) {
				System.out.print("Anna koepisteet (-1 lopettaa): ");
				koepiste = input.nextInt();
			} else {
				System.out.println("Ei en‰‰ koepisteit‰");
			}
		}

		System.out.print("\nKoepisteet ovat ");

		// N‰ytet‰‰n taulukon sis‰ltˆ
		for (int i = 0; i < lkm; i++) {
			System.out.print(koepisteet[i] + " ");
		}

	}

}
