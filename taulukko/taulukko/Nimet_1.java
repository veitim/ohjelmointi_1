package taulukko;

import java.util.Arrays;
import java.util.Scanner;

public class Nimet_1 {

	/*
	 * Tee ohjelma (kalvoesimerkkin‰), joka kysyy perheenj‰senten etunimet (max.
	 * 20). K‰ytt‰j‰ voi antaa nimi‰, kunnes nimeksi annetaan tyhj‰ merkkijono tai
	 * kun nimi‰ on annettu 20. Lopuksi ohjelma n‰ytt‰‰ nimet aakkosj‰rjestyksess‰.
	 */

	public static void main(String[] args) {

		// M‰‰ritell‰‰n taulukon koko
		final int MAX = 20;

		// Esitell‰‰n ja luodaan taulukko
		String[] nimet = new String[MAX];
		String nimi;
		int lkm = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Anna nimi: ");
		nimi = input.nextLine();
		nimi = nimi.trim();

		// Silmukkaa suoritetaan niin kauan kuin taulukkoon mahtuu merkkijonoja
		// (lkm < MAX)
		// ja annettu merkkijono ei ole tyhj‰ merkkijono (nimi.lenght() != 0)
		while (lkm < MAX && nimi.length() != 0) {
			// Laitetaan annettu nimi taulukkoon
			nimet[lkm] = nimi;
			// Kasvatetaan annettujen merkkijonojen lukum‰‰r‰‰ yhdell‰
			lkm++;

			// Jos taulukkoon mahtuu viel‰ merkkijonoja (nimi‰), kysyt‰‰n uusi
			// merkkijono
			if (lkm < MAX) {
				System.out.print("Anna nimi: ");
				nimi = input.nextLine();
				nimi = nimi.trim();
			} else {
				System.out.println("Nimi‰ on jo maksimi " + MAX + " kappaletta.");
			}
		}

		// Lajitellaan annetut merkkijonot nousevaan j‰rjestykseen
		Arrays.sort(nimet, 0, lkm);

		System.out.println("Nimet ovat aakkosj‰rjestyksess‰");
		// for-silmukalla n‰ytet‰‰n taulukossa olevat merkkijonot
		for (int i = 0; i < lkm; i++) {
			System.out.println(nimet[i] + " ");
		}

	}

}
