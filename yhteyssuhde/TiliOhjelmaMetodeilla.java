package yhteyssuhde;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TiliOhjelmaMetodeilla {

	private Tili tili = null;
	private Asiakas omistaja = null;

	private void teeTili() {
		Scanner input = new Scanner(System.in);

		System.out.print("Anna tilin omistajan hetu: ");
		String hetu = input.nextLine();
		System.out.print("Anna tilin omistajan nimi: ");
		String nimi = input.nextLine();

		// Luodaan omistaja
		omistaja = new Asiakas(hetu, nimi);

		System.out.print("Anna tilinnumero: ");
		String numero = input.nextLine();
		System.out.print("Anna alkusaldo: ");
		double saldo = input.nextDouble();

		tili = new Tili(numero, saldo);

		// Laitetaan tiliin viite omistajaan k‰ytt‰en Tili-luokan metodia
		tili.setOmistaja(omistaja);

	}

	private void teeOtto() {
		if (tili != null) {
			Scanner input = new Scanner(System.in);

			System.out.print("Oton m‰‰r‰: ");
			double maara = input.nextDouble();

			if (tili.otto(maara) == true) {
				DecimalFormat desimaalit = new DecimalFormat("0.00");
				System.out.println("Tilin saldo oton j‰lkeen " + desimaalit.format(tili.getSaldo()));
			} else {
				System.out.println("Tilill‰ ei ole katetta");
			}
		} else {
			System.out.println("Tili‰ ei ole");
		}
	}

	private void teePano() {
		if (tili != null) {
			Scanner input = new Scanner(System.in);

			System.out.print("Panon m‰‰r‰: ");
			double maara = input.nextDouble();

			tili.pano(maara);
			DecimalFormat desimaalit = new DecimalFormat("0.00");
			System.out.println("Tilin saldo panon j‰lkeen " + desimaalit.format(tili.getSaldo()));
		} else {
			System.out.println("Tili‰ ei ole");
		}
	}

	private void naytaTili() {
		if (tili != null) {
			DecimalFormat desimaalit = new DecimalFormat("0.00");
			System.out.println("Tilinumero: " + tili.getNumero());
			System.out.println("Saldo: " + desimaalit.format(tili.getSaldo()));
			if (tili.getOmistaja() != null) {
				System.out.println("Omistajan nimi: " + tili.getOmistaja().getNimi());
			}
		} else {
			System.out.println("Tili‰ ei ole");
		}
	}

	public static void main(String[] args) {
		TiliOhjelmaMetodeilla ohjelma = new TiliOhjelmaMetodeilla();

		int valinta = -1;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\n1. Tilin perustaminen");
			System.out.println("2. Otto");
			System.out.println("3. Pano");
			System.out.println("4. Tilin tiedot");
			System.out.println("0. Lopetus");

			System.out.print("Anna valintasi (0-4): ");
			valinta = input.nextInt();

			switch (valinta) {
			case 1:
				ohjelma.teeTili();
				break;
			case 2:
				ohjelma.teeOtto();
				break;
			case 3:
				ohjelma.teePano();
				break;
			case 4:
				ohjelma.naytaTili();
				break;
			case 0:
				break;
			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);

	}
}
