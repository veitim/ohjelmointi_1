package kertaus;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class LampotilaOhjelma {

	ArrayList<Lampotila> lampoLista = new ArrayList<Lampotila>();

	private void lisaa() {
		Scanner input = new Scanner(System.in);

		System.out.print("Anna p‰iv‰m‰‰r‰: ");
		String paiva = input.nextLine();

		System.out.print("Anna paikkakunta: ");
		String paikka = input.nextLine();

		System.out.print("Anna mittaus: ");
		double mittaus = input.nextDouble();
		Lampotila lampo = new Lampotila(paiva, paikka, mittaus);

		lampoLista.add(lampo);
	}

	private void naytaKaikkiLampotilat() {
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		for (int i = 0; i < lampoLista.size(); i++) {
			Lampotila lampo = lampoLista.get(i);

			System.out.println("\nP‰iv‰: " + lampo.getPaivamaara());
			System.out.println("Paikka: " + lampo.getPaikkakunta());
			System.out.println("Mittaustulos: " + desimaalit.format(lampo.getMittaus()));

		}
	}

	public static void main(String[] args) {
		LampotilaOhjelma ohjelma = new LampotilaOhjelma();
		Scanner input = new Scanner(System.in);
		int valinta = -1;
		do {
			System.out.println("\n1 = Lis‰‰ uusi l‰mpˆtila");
			System.out.println("2 = N‰yt‰ kaikki l‰mpˆtilat");
			System.out.println("0 = Lopeta");
			System.out.print("Anna valintasi (0-2): ");
			valinta = input.nextInt();

			switch (valinta) {
			case 1:
				ohjelma.lisaa();
				break;

			case 2:
				ohjelma.naytaKaikkiLampotilat();
				break;

			}

		} while (valinta != 0);

	}

}
