package toistorakenne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tyylipisteet {

	/*
	 * Tee ohjelma, joka laskee m�kihyppykisan tyylipisteet. Ohjelma kysyy viiden
	 * tuomarin pisteet (0-20). Tyylipisteisiin lasketaan kolmen tuomarin pisteet
	 * siten, ett� suurin ja pienin pistem��r� j�� laskuista pois.
	 */

	public static void main(String[] args) {
		final int TUOMAREITA = 5;
		// pienin alustetaan kaikkein suurimmalla mahdollisella pisteell�
		// suurin alustetaan kaikkein pienimm�ll� mahdollisella pisteell�
		double tyylipiste, pienin = 20, suurin = 0, yhteensa = 0;

		Scanner input = new Scanner(System.in);

		// int i = 0 => alustetaan laskuri
		// i < TUOMAREIRA => ehto silmukan suorittamiselle
		// i++ => laskurin kasvattaminen
		for (int i = 0; i < TUOMAREITA; i++) {
			System.out.print("Anna tuomarin " + (i + 1) + ". pisteet: ");
			tyylipiste = input.nextDouble();

			// Onko annettu tyylipiste t�h�n menness� suurin
			if (tyylipiste > suurin) {
				suurin = tyylipiste;
			}

			// Onko annettu tyylipiste t�h�n menness� pienin
			if (tyylipiste < pienin) {
				pienin = tyylipiste;
			}

			// Summataan tyylipisteet
			yhteensa = yhteensa + tyylipiste;
		}

		// V�hennet��n tyylipisteiden summasta suurin ja pienin
		yhteensa = yhteensa - suurin - pienin;

		DecimalFormat desimaalit = new DecimalFormat("0.0");
		System.out.println("Tyylipisteet ovat " + desimaalit.format(yhteensa));
	}

}
