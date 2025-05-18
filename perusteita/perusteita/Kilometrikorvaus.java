package perusteita;

import java.util.Scanner;  // Näppäimistöltä lukemista varten
import java.text.DecimalFormat; // Desimaalilukjen muotoiluun

public class Kilometrikorvaus {

	/*
	 * Tee ohjelma, joka kysyy ajetut kilometrit, laskee ja näyttää korvauksen
	 * määrän. Kilometrikorvaus on 0,43 euroa/kilometri. Näytä vastaus kahdella
	 * desimaalilla.
	 */

	public static void main(String[] args) {
		// Vakioiden esittely
		final double KILOMETRIKORVAUS = 0.43;

		// Muuttujien esittely
		int ajettu;
		double korvaus;

		// Tiedon kysyminen käyttäjältä konsoliin
		System.out.print("Anna ajetut kilometrit: ");

		// Käyttäjän syötteen lukeminen, luetaan yksi kokonaisluku
		Scanner input = new Scanner(System.in);
		ajettu = input.nextInt();

		// Laskeminen
		korvaus = ajettu * KILOMETRIKORVAUS;

		// Vastauksen näyttäminen kahdella desimaalilla
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		// Merkkijono (vakioteksti) ja muuttuja yhdistellään +:lla
		System.out.println("Korvauksen määrä " + ajettu + " kilometrille on " + desimaalit.format(korvaus) + " euroa");
	}

}
