package perusteita;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lippupaketti {

	/*
	 * Tee ohjelma, joka kysyy k‰ytt‰j‰lt‰ kuuden elokuvalipun pakkauksen hinnan,
	 * laske ja n‰ytt‰‰ yksitt‰isen lipun hinnan.
	 */

	public static void main(String[] args) {
		// Vakio, ei voida muuttaa
		// Tyylin‰ on kirjoittaa vakiot suurella
		final int PAKETTIKOKO = 6;

		double pakettihinta, lippuhinta;

		System.out.print("Anna paketin hinta: ");

		Scanner input = new Scanner(System.in);
		// K‰ytt‰j‰ antaa desimaaliluvun pilkulla esim. 93,50
		pakettihinta = input.nextDouble();

		lippuhinta = pakettihinta / PAKETTIKOKO;

		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Yksitt‰isen lipun hinta on " + desimaalit.format(lippuhinta) + " euroa");
	}

}
