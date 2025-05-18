package perusteita;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Matka {
	public static void main(String[] args) {
		int matka, kilometrit, metrit;

		// Kysyt‰‰n k‰ytt‰j‰lt‰ matka konsolista
		System.out.print("Anna kuljettu matka metrein‰: ");

		// Esitell‰ Scanner ja tuodaan ohjelman alkuun paketti, miss‰ Scanner on
		Scanner input = new Scanner(System.in);

		// Luetaan matka n‰pp‰imistˆlt‰
		matka = input.nextInt();  

		// Lasketaan matka kilometrein‰, kun jaettava  ja jakaja ovat kokonaislukua -> 
		// vastaus on kokonaisluku 5678/1000 -> 5
		kilometrit = matka/1000;

		// M‰‰ritell‰‰n deimaalien muotoilu
		metrit = matka - kilometrit * 1000;

		// N‰ytet‰‰n vastaus muotoiltuna + yhdist‰‰ merkkijonoja (vakioteksti‰)  ja muuttujia
		System.out.println("Matka on " + kilometrit + " km ja " + metrit + " metri‰");

	}

}
