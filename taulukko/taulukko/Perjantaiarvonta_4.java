package taulukko;

import java.util.Scanner;

public class Perjantaiarvonta_4 {

	/*
	 * Tee ohjelma, joka kysyy perjantaiarvontaan osallistuvien nimet (max. 15).
	 * Nimien antaminen lopetetaan, kun nimeksi annetaan tyhj‰ merkkijono tai nimi‰
	 * on annettu maksimim‰‰r‰. T‰m‰n j‰lkeen tehd‰‰n arvonta osallistujien kesken
	 * ja n‰ytet‰‰n, kuka voitti arvonnan.
	 */

	public static void main(String[] args) {
		final int MAX = 15; // Vakio, joka m‰‰rittelee taulukon koon

		String[] osallistujat = new String[MAX]; // Luodaan taulukko
		String osallistuja; 
		int lkm = 0; // Kertoo, montako tietoa taulukossa on

		Scanner input = new Scanner(System.in);

		System.out.print("Anna osallistujan etunimi: ");
		osallistuja = input.nextLine();

		// Toistetaan niin kauan kuin taulukko ei ole t‰ynn‰ eik‰ annettu nimi ole tyhj‰
		while (lkm < MAX && osallistuja.length() != 0) {
			// Laitetaan annettu nimi taulukkoon
			osallistujat[lkm] = osallistuja;
			lkm++;

			// Jos taulukko ei ole t‰ynn‰
			if (lkm < MAX) {
				System.out.print("Anna osallistujan etunimi: ");
				osallistuja = input.nextLine();
			} else {
				System.out.println("Arvontaan voi osallistua vain " + MAX + " henkilˆ‰.");
			}
		}

		// Arvotaan voittajan indeksi taulukossa
		int voittaja = (int) (Math.random() * lkm);

		// Otetaan taulukosta tieto annetulta paikalta (voittaja)
		System.out.println("Voittaja on " + osallistujat[voittaja]);
	}

}
