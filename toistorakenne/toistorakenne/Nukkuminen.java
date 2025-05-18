package toistorakenne;

import java.util.Scanner;

public class Nukkuminen {
	/*
	 * Tee ohjelma, joka kysyy k‰ytt‰j‰lt‰ h‰nen keskim‰‰r‰isenunentarpeensa
	 * vuorokaudessa sek‰ nukuttujen tuntien m‰‰r‰n. Nukuttujen tuntien m‰‰r‰n
	 * kysyminen lopetetaan, kun k‰ytt‰j‰ antaa 0. Ohjelma laskee ja n‰ytt‰‰
	 * unisaldon sek‰ unentarpeen.
	 */

	public static void main(String[] args) {
		int unentarve, nukkuminen, yhteensa = 0, lkm = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Anna keskim‰‰r‰inen unentarpeesi vuorokaudessa: ");
		unentarve = input.nextInt();

		// Luetaan ensimm‰iset nukutut tunnit
		System.out.print("Anna nukutut tunnit vuorokaudessa (0 lopettaa): ");
		nukkuminen = input.nextInt();

		// Toistetaan niin kauan kuin ei ole annettu nollaa
		while (nukkuminen != 0) { // T‰‰ll‰ ei saa olla puolipistett‰, koska se p‰‰tt‰‰ toiston t‰ss‰ kohtaa
			// Kasvatetaan annettujen tietojen lukum‰‰r‰‰ yhdell‰
			lkm++;
			// Summataan annettua tieto aiemmin annettuihin tietoihin
			yhteensa = yhteensa + nukkuminen;
			System.out.print("Anna nukutut tunnit vuorokaudessa (0 lopettaa): ");
			nukkuminen = input.nextInt();
		}

		System.out.println("Olet nukkunut " + yhteensa + " tuntia");
		System.out.println("Unentarpeesi on " + (unentarve * lkm) + " tuntia");
	}

}
