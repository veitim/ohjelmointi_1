package toistorakenne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tyylipisteet {

	/*
	 * Tee ohjelma, joka laskee mäkihyppykisan tyylipisteet. Ohjelma kysyy viiden
	 * tuomarin pisteet (0-20). Tyylipisteisiin lasketaan kolmen tuomarin pisteet
	 * siten, että suurin ja pienin pistemäärä jää laskuista pois.
	 */

	public static void main(String[] args) {
		final int TUOMAREITA = 5;
		// pienin alustetaan kaikkein suurimmalla mahdollisella pisteellä
		// suurin alustetaan kaikkein pienimmällä mahdollisella pisteellä
		double tyylipiste, pienin = 20, suurin = 0, yhteensa = 0;

		Scanner input = new Scanner(System.in);

		// int i = 0 => alustetaan laskuri
		// i < TUOMAREIRA => ehto silmukan suorittamiselle
		// i++ => laskurin kasvattaminen
		for (int i = 0; i < TUOMAREITA; i++) {
			System.out.print("Anna tuomarin " + (i + 1) + ". pisteet: ");
			tyylipiste = input.nextDouble();

			// Onko annettu tyylipiste tähän mennessä suurin
			if (tyylipiste > suurin) {
				suurin = tyylipiste;
			}

			// Onko annettu tyylipiste tähän mennessä pienin
			if (tyylipiste < pienin) {
				pienin = tyylipiste;
			}

			// Summataan tyylipisteet
			yhteensa = yhteensa + tyylipiste;
		}

		// Vähennetään tyylipisteiden summasta suurin ja pienin
		yhteensa = yhteensa - suurin - pienin;

		DecimalFormat desimaalit = new DecimalFormat("0.0");
		System.out.println("Tyylipisteet ovat " + desimaalit.format(yhteensa));
	}

}
