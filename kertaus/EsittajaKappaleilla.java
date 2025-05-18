package kertaus;

import java.util.ArrayList;
import java.util.Scanner;

public class EsittajaKappaleilla {
	private Esittaja esittaja = null;

	public void teeEsittaja() {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();

		System.out.print("Anna syntymävuosi: ");
		int vuosi = input.nextInt();
		esittaja = new Esittaja(nimi, vuosi);
	}

	public void naytaEsittaja() {
		if (esittaja != null) {

			System.out.println("Nimi: " + esittaja.getNimi());
			System.out.println("Syntymävuosi: " + esittaja.getSyntymavuosi());
			naytaKappaleet();
		} else {
			System.out.println("Tee ensin esittäjä");
		}

	}

	public void lisaaKappale() {
		if (esittaja != null) {
			Scanner input = new Scanner(System.in);

			System.out.print("Anna nimi: ");
			String nimi = input.nextLine();

			System.out.print("Anna kesto: ");
			int kesto = input.nextInt();

			System.out.print("Anna julkaisivuosi: ");
			int vuosi = input.nextInt();

			Kappale kappale = new Kappale(nimi, kesto, vuosi);
			esittaja.getKappaleLista().add(kappale);
		} else {
			System.out.println("Tee ensin esittäjä");
		}
	}

	public void naytaKappaleet() {
		if (esittaja != null) {
			ArrayList<Kappale> kappaleLista = esittaja.getKappaleLista();
			for (int i = 0; i < kappaleLista.size(); i++) {
				Kappale kappale = kappaleLista.get(i);
				System.out.println("Numero: " + (i + 1));
				System.out.println("Nimi: " + kappale.getNimi());
				System.out.println("Kesto: " + kappale.getKesto());
				System.out.println("Julkaisuvuosi: " + kappale.getJulkaisuvuosi());
			}

			System.out.println(kappaleLista.size() + " kappaletta");
		} else {
			System.out.println("Tee ensin esittäjä");
		}
	}

	public static void main(String[] args) {
		EsittajaKappaleilla ohjelma = new EsittajaKappaleilla();
		Scanner input = new Scanner(System.in);

		int valinta = -1;

		do {
			System.out.println("\n1. Tee esittäjä");
			System.out.println("2. Lisää kappale");
			System.out.println("3. Näytä");
			System.out.print("Anna valintasi (0-3): ");
			valinta = input.nextInt();
			switch (valinta) {
			case 1:
				ohjelma.teeEsittaja();
				break;
			case 2:
				ohjelma.lisaaKappale();
				break;
			case 3:
				ohjelma.naytaEsittaja();
				break;
			case 0:
				break;
			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);

	}

}
