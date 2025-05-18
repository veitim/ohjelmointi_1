package perusteita;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Painoindeksi {

	/*
	 * Tee ohjelma, joka kysyy käyttäjän painon kiloina sekä pituuden metreinä,
	 * laskee ja näyttää painoindeksin. Painoindeksi lasketaan painoindeksi = paino
	 * / (pituus * pituus) Esimerkiksi jos paino on 80 ja pituus on 1,80,
	 * painoindeksi on 24.69.
	 */

	public static void main(String[] args) {
		// Esittele vakiot

		// Esittele muuttujat
		int paino; // kokonaisluku
		double painoindeksi, pituus; // desimaalilukuja

		// Pyydä käyttäjältä paino
		System.out.print("Anna paino (kiloina): ");

		// Lue paino konsolista
		Scanner input = new Scanner(System.in);
		paino = input.nextInt();

		// Kysy pituus
		System.out.print("Anna pituus (metreinä): ");

		// Lue pituus konsolista
		pituus = input.nextDouble();

		// Laske, kun kokonaisluku jaetaan kokonaisluvulla vastaus on kokonasluku
		// (double) muuntaa vastauksen desimaaliluvuksi
		// ilman sitä vastaus olisi kokonaisluku, koska int/int => int
		painoindeksi = (double) paino / (pituus * pituus);

		// Näytä vastaus
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Painoindeksi on " + desimaalit.format(painoindeksi));

	}

}
