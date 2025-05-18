package taulukko;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto_3 {

	/*
	 * Tee ohjelma (kalvoesimerkkin‰), joka kysyy k‰ytt‰j‰n lottorivin. Aluksi
	 * ohjelma kysyy, montako numeroa lottoriviss‰ on. Lottoriviss‰ voi olla
	 * numeroita 7-10. Sen j‰lkeen ohjelmaa pyyt‰‰ k‰ytt‰j‰lt‰ h‰nen lottonumeronsa.
	 * Lopuksi ohjelma n‰ytt‰‰ k‰ytt‰j‰n antamat lottonumerot nousevassa
	 * j‰rjestyksess‰.
	 */

	public static void main(String[] args) {

		// Esitell‰‰n taulukko
		int[] numerot;

		int numero, lkm;
 
		Scanner input = new Scanner(System.in);
		System.out.print("Montako numeroa annat (7-10): ");
		lkm = input.nextInt();

		// Luodaan taulukko, kun nyt tiedet‰‰n sen koko
		numerot = new int[lkm];

		for (int i = 0; i < numerot.length; i++) {
			System.out.print("Anna " + (i + 1) + " lottonumerosi: ");
			numero = input.nextInt();

			// Laitetaan k‰ytt‰j‰n antama numero taulukkoon i:nelle paikalle
			numerot[i] = numero;
		}

		// Lajitellaan annetut lottonumerot nousevaan j‰rjestykseen
		Arrays.sort(numerot, 0, lkm);

		System.out.print("Rivisi oli ");
		// K‰yd‰‰n for-silmukalla taulukko l‰pi
		// ja n‰ytet‰‰n taulukosta vuorollaan kukin annettu lottonumero
		for (int i = 0; i < numerot.length; i++) {
			System.out.print(numerot[i] + " ");
		}

	}
}
