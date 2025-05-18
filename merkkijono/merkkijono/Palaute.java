package merkkijono;

import java.util.Scanner;

public class Palaute {

	/*
	 * Tee ohjelma, joka kysyy käyttäjältä palautteen. Tämän jälkeen ohjelma kertoo
	 * palautteen pituuden. Jos palautteessa on ?-merkki, ohjelma kertoo, että
	 * kysymykseen vastataan mahdollisimman pian. Muuten ohjelma kertoo, että
	 * palaute on otettu vastaan.
	 */

	public static void main(String[] args) {
		String palaute;

		Scanner input = new Scanner(System.in);

		System.out.print("Kirjoita palautteesi: ");
		palaute = input.nextLine();

		System.out.println("Palautteesi pituus oli " + palaute.length() + " merkkiä.");

		// Tutkitaan, onko merkkijonossa ? merkkiä
		// indexOf palauttaa osamerkkijonon (?) paikan merkkojonossa tai -1, jos sitä ei ole
		if (palaute.indexOf("?") != -1) {
			System.out.println("Kysymykseesi vastataan mahdollisimman pian.");
		} else {
			System.out.println("Palautteesi on otettu vastaan.");
		}
	}

}
