package taulukko;

import java.time.LocalDate;
import java.util.Scanner;

public class Syntymapaiva_11 {
	/*
	 * Tee ohjelma, joka kysyy syntymäpäiväsi merkkijonona ja muuntaa sen
	 * LocalDate-luokan olioksi. Selvitä sen jälkeen käyttäjän syntymävuosi. Kerro,
	 * jos se on tulevaisuudessa.
	 * 
	 */

	public static void main(String[] args) {
		LocalDate spaiva; // Päivämäärä muuttuja
		String paiva; // Käyttäjältä kysyttävä päivämäärä
		Scanner input = new Scanner(System.in);

		System.out.print("Anna syntymäpäiväsi (vvvv-kk-pp): ");
		paiva = input.nextLine();

		// Koska käyttäjän antama syöte ei välttämättä ole päivämääräksi kelpaava, tehdään poikkeuslohko
		try {
			// Muutetaan merkkijono päivämääräksi. 
			// Jos parse ei onnistu siirrytään catch-lohkoon
			spaiva = LocalDate.parse(paiva);
			
			// Otetaan vuosi
			int vuosi = spaiva.getYear();

			// Otetaan nykyinen vuosi
			int nytVuosi = LocalDate.now().getYear();

			// Jos syntymäpäivän vuosi on suurempi kuin nykyinen vuosi
			if (vuosi > nytVuosi) {
				System.out.println("Syntymävuosi ei voi olla tulevaisuudessa ");
			} else {
				System.out.println("Syntymävuosi on " + vuosi);
			}
		} catch (Exception error) {
			System.out.println("Syntymäpäivä on virheellinen");
		}

	}

}
