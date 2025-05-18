package perusteita;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Painoindeksi {

	/*
	 * Tee ohjelma, joka kysyy k�ytt�j�n painon kiloina sek� pituuden metrein�,
	 * laskee ja n�ytt�� painoindeksin. Painoindeksi lasketaan painoindeksi = paino
	 * / (pituus * pituus) Esimerkiksi jos paino on 80 ja pituus on 1,80,
	 * painoindeksi on 24.69.
	 */

	public static void main(String[] args) {
		// Esittele vakiot

		// Esittele muuttujat
		int paino; // kokonaisluku
		double painoindeksi, pituus; // desimaalilukuja

		// Pyyd� k�ytt�j�lt� paino
		System.out.print("Anna paino (kiloina): ");

		// Lue paino konsolista
		Scanner input = new Scanner(System.in);
		paino = input.nextInt();

		// Kysy pituus
		System.out.print("Anna pituus (metrein�): ");

		// Lue pituus konsolista
		pituus = input.nextDouble();

		// Laske, kun kokonaisluku jaetaan kokonaisluvulla vastaus on kokonasluku
		// (double) muuntaa vastauksen desimaaliluvuksi
		// ilman sit� vastaus olisi kokonaisluku, koska int/int => int
		painoindeksi = (double) paino / (pituus * pituus);

		// N�yt� vastaus
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Painoindeksi on " + desimaalit.format(painoindeksi));

	}

}
