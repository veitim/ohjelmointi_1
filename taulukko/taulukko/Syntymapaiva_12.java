package taulukko;

import java.time.LocalDate;
import java.util.Scanner;

public class Syntymapaiva_12 {
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
				// Muutetaan syntymäpäivä tämän vuoden syntymäpäiväksi
				LocalDate tanaVuonna = LocalDate.of(nytVuosi, spaiva.getMonthValue(), spaiva.getDayOfMonth());
				
				LocalDate tanaan = LocalDate.now();
				if (tanaVuonna.equals(tanaan)) {
					System.out.println("Onneksi olkoon");
				} else if (tanaVuonna.isBefore(tanaan)) {
					System.out.println("Synttärisi oli jo");
				} else {
					System.out.println("Synttärisi ovat tulossa");
				}
			}
		} catch (Exception error) {
			System.out.println("Syntymäpäivä on virheellinen");
		}

	}

}
