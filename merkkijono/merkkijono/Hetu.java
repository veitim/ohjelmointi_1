package merkkijono;

import java.util.Scanner;

public class Hetu {
	/*
	 * Tee ohjelma, mikä kysyy hetun, tarkastaa sen oikeellisuuden muodoltaan sekä
	 * kertoo syntymävuoden. Hetun välimerkki kertoo syntymävuosisadan: A = 2000 - =
	 * 1900 + = 1800
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//String hetu;

		System.out.print("Anna hetu: ");  // 123456-1234
		String hetu = input.nextLine();

		// Tutkitaan, onko hetu haluttua muotoa
		if (! hetu.matches("\\d{6}[A+-]\\d{3}[A-Z0-9]")) {  // \d{6}[A+-]\d{3}[A-Z0-9]
			System.out.println("Hetu ei ole kelvollinen");
		} else {
			//123456-1234
			// Otetaan hetusta se osa, joka kertoo syntymävuoden
			String vuosiStr = hetu.substring(4, 6);  // "56" merkkijonona
			
			// Muunnetaan merkkijono luvuksi laskemista varten
			int vuosi = Integer.parseInt(vuosiStr);  // 56 kokonaislukuna

			// Otetaan hetussa oleva välimerkki
			String valimerkki = hetu.substring(6, 7); // -

			// Tukitaan, mikä välimerkki on ja sen mukaan otetaan vuosista
			if (valimerkki.equals("A")) {
				vuosi = vuosi + 2000;
			} else if (valimerkki.equals("-")) {
				vuosi = vuosi + 1900;
			} else if (valimerkki.equals("+")) {
				vuosi = vuosi + 1800;
			}

			System.out.println("Vuosi on " + vuosi);
		}
	}

}
