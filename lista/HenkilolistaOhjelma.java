package lista;

import java.util.ArrayList;
import java.util.Scanner;

public class HenkilolistaOhjelma {

	private ArrayList<Henkilo> henkiloLista = new ArrayList<Henkilo>();

	private void lisaaHenkilo() {
		Scanner input = new Scanner(System.in);

		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();

		System.out.print("Anna osoite: ");
		String osoite = input.nextLine();
		
		System.out.print("Anna syntym�vuosi: ");
		int syntymavuosi = input.nextInt();

		Henkilo henkilo = new Henkilo(nimi, osoite, syntymavuosi);

		henkiloLista.add(henkilo);
	}

	private void naytaHenkilot() {
		for (int i = 0; i < henkiloLista.size(); i++) {
			Henkilo henkilo = henkiloLista.get(i);
			
			System.out.println("\nNimi: " + henkilo.getNimi());
			System.out.println("Osoite: " + henkilo.getOsoite());
			System.out.println("Syntym�vuosi: " + henkilo.getSyntymavuosi());
		}
	}
	
	private void naytaHenkilotIka() {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna ik�raja: ");
		int raja = input.nextInt();

		for (int i=0; i < henkiloLista.size(); i++) {
			Henkilo henkilo = henkiloLista.get(i);
			
			if (henkilo.getIka() >= raja) {
				System.out.println("\nNimi: " + henkilo.getNimi());
				System.out.println("Osoite: " + henkilo.getOsoite());
				System.out.println("Ik�: " + henkilo.getIka());
			}
		}
		
	}

	public static void main(String[] args) {
		HenkilolistaOhjelma ohjelma = new HenkilolistaOhjelma();
		
		int valinta = -1;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\n1. Lis�� henkil�");
			System.out.println("2. Listaa henkil�t");
			System.out.println("3. Listaa henkil�t i�ll�");
			System.out.println("0. Lopetus");

			System.out.print("Anna valintasi (0-3): ");
			valinta = input.nextInt();

			switch (valinta) {
			case 1:
				ohjelma.lisaaHenkilo();
				break;
			case 2:
				ohjelma.naytaHenkilot();
				break;
			case 3:
				ohjelma.naytaHenkilotIka();
				break;
			case 0:
				break;
			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);

	}

}
