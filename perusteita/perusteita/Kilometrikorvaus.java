package perusteita;

import java.util.Scanner;  // N�pp�imist�lt� lukemista varten
import java.text.DecimalFormat; // Desimaalilukjen muotoiluun

public class Kilometrikorvaus {

	/*
	 * Tee ohjelma, joka kysyy ajetut kilometrit, laskee ja n�ytt�� korvauksen
	 * m��r�n. Kilometrikorvaus on 0,43 euroa/kilometri. N�yt� vastaus kahdella
	 * desimaalilla.
	 */

	public static void main(String[] args) {
		// Vakioiden esittely
		final double KILOMETRIKORVAUS = 0.43;

		// Muuttujien esittely
		int ajettu;
		double korvaus;

		// Tiedon kysyminen k�ytt�j�lt� konsoliin
		System.out.print("Anna ajetut kilometrit: ");

		// K�ytt�j�n sy�tteen lukeminen, luetaan yksi kokonaisluku
		Scanner input = new Scanner(System.in);
		ajettu = input.nextInt();

		// Laskeminen
		korvaus = ajettu * KILOMETRIKORVAUS;

		// Vastauksen n�ytt�minen kahdella desimaalilla
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		// Merkkijono (vakioteksti) ja muuttuja yhdistell��n +:lla
		System.out.println("Korvauksen m��r� " + ajettu + " kilometrille on " + desimaalit.format(korvaus) + " euroa");
	}

}
