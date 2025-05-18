package valintarakenne;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Painoindeksi {
	/*
	 * Tee ohjelma, joka kysyy käyttäjän painon (kg) sekä pituuden (m), laskee ja
	 * näyttää painoindeksiluokan. painoindeksi = paino / (pituus * pituus)
	 * Painoindeksiluokat aikuisilla: Normaalia alhaisempi paino 18,4 tai alle
	 * Normaali paino 18,5 - 24,9 Ylipaino 25,0 tai yli
	 */

	public static void main(String[] args) {
		// Esittele vakiot
		final double LAIHA = 18.4, NORMAALI = 24.9;

		// Esittele muuttujat
		int paino;
		double painoindeksi, pituus;

		// Pyydä käyttäjältä paino
		System.out.print("Anna paino (kiloina): ");

		// Lue paino
		Scanner input = new Scanner(System.in);
		paino = input.nextInt();

		// Kysy pituus
		System.out.print("Anna pituus (metreinä): ");

		// Lue pituus
		pituus = input.nextDouble();

		// Laske
		// (double) muuntaa vastauksen desimaaliluvuksi, muuten vastaus olisi
		// kokonaisluku, koska int/int => int
		painoindeksi = (double) paino / (pituus * pituus);

		DecimalFormat desimaalit = new DecimalFormat("0.00");

		// Näytä vastaus
		System.out.println("Painoindeksi on " + desimaalit.format(painoindeksi));

		// Vertailu
		// jos painoindeksi <= 18.4
		if (painoindeksi <= LAIHA) {
			System.out.println("Sinulla on normaalia alhaisempi paino.");
		} else if (painoindeksi <= NORMAALI) {
			System.out.println("Sinulla on normaalipaino.");
		} else {
			System.out.println("Olet ylilipainoinen");
		}

	}

}
