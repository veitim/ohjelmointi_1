package yhteyssuhde;

import java.util.Scanner;

public class TuoteOhjelmaMetodeilla {

	// Tuotetta ei ole aluksi
	private Tuote tuote = null;

	// Toimittajaa ei ole aluksi
	private Toimittaja toimittaja = null;

	private void lisaaTuote() {
		Scanner input = new Scanner(System.in);

		System.out.print("Anna numero: ");
		int numero = input.nextInt();
		input.nextLine();

		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();

		System.out.print("Anna hinta: ");
		double hinta = input.nextDouble();

		// Luodaan tuote Tuote-luokan parametrillisella konstruktorilla
		tuote = new Tuote(numero, nimi, hinta);

	}

	private void muutaTuote() {
		Scanner input = new Scanner(System.in);

		// Jos tuote on luotu
		if (tuote != null) {
			//System.out.print("Anna numero: ");
			//int numero = input.nextInt();
			//input.nextLine();
			// Muutetaan tietoja set-metodeilla
			//tuote.setNumero(numero);

			System.out.print("Anna nimi: ");
			String nimi = input.nextLine();
			tuote.setNimi(nimi);

			System.out.print("Anna hinta: ");
			double hinta = input.nextDouble();
			tuote.setHinta(hinta);
		} else {
			System.out.println("Tuotetta ei ole");
		}

	}

	private void naytaTuote() {
		// Jos tuote on luotu
		if (tuote != null) {
			System.out.println("Numero: " + tuote.getNumero());
			System.out.println("Nimi: " + tuote.getNimi());
			System.out.println("Hinta: " + tuote.getHinta());
			// Onko tuotteella toimittajaa
			if (tuote.getToimittaja() != null) {
				// tuote.getToimittaja() palauttaa Toimittaja-luokan olion
				// getNimi() metodi kutsuu Toimittaja-luokan metodia
				System.out.println("Toimittajan nimi: " + tuote.getToimittaja().getNimi());
				System.out.println("Toimittajan osoite: " + tuote.getToimittaja().getOsoite());
			} else {
				System.out.println("Toimittajan tietoja ei ole");
			}
		} else {
			System.out.println("Tuotetta ei ole");
		}
	}

	private void lisaaToimittaja() {
		Scanner input = new Scanner(System.in);

		// Jos tuote on luotu
		if (tuote != null) {

			// Jos toimittajaa ei ole tehd‰‰n se
			//if (toimittaja == null) {
			toimittaja = new Toimittaja();
			//}
			System.out.print("Anna toimittajan nimi: ");
			String nimi = input.nextLine();
			toimittaja.setNimi(nimi);

			System.out.print("anna toimittajan osoite: ");
			String osoite = input.nextLine();
			toimittaja.setOsoite(osoite);

			tuote.setToimittaja(toimittaja);
		} else {
			System.out.println("Tuotetta ei ole");
		}
	}

	public static void main(String[] args) {
		// Luodaan TuoteSovellus-luokan olio (sovellus), jotta yll‰ olevia
		// metodeja voidaan kutsua
		TuoteOhjelmaMetodeilla sovellus = new TuoteOhjelmaMetodeilla();

		int valinta = -1;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\n1. Anna tuote");
			System.out.println("2. Muuta tuote");
			System.out.println("3. N‰yt‰ tuote");
			System.out.println("4. Lis‰‰ tuotteelle toimittaja");
			System.out.println("0. Lopeta");

			System.out.print("Anna valintasi (0-4): ");
			valinta = input.nextInt();

			switch (valinta) {
			case 1:
				sovellus.lisaaTuote();
				break;

			case 2:
				sovellus.muutaTuote();
				break;

			case 3:
				sovellus.naytaTuote();
				break;

			case 4:
				sovellus.lisaaToimittaja();
				break;

			case 0:
				break;

			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);

	}

}
