package lista;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OpintojaksoListalla {
	// Lista, johon lis‰t‰‰n opintojaksoja
	private ArrayList<Opintojakso> opintojaksoLista = new ArrayList<Opintojakso>();

	public void lisaaOpintojakso() {
		// Luodaan olio listalle laittoa varten
		Opintojakso opintojakso = new Opintojakso();

		Scanner input = new Scanner(System.in);

		System.out.print("Anna tunnus: ");
		String tunnus = input.nextLine();
		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();
		System.out.print("Anna laajuus: ");
		double laajuus = input.nextDouble();

		// T‰ytet‰‰n olio Opintojakso luokan set metodeilla
		opintojakso.setTunnus(tunnus);
		opintojakso.setNimi(nimi);
		opintojakso.setLaajuus(laajuus);

		// Lis‰‰ olio listalle
		opintojaksoLista.add(opintojakso);
	}

	// Listaa opintojaksot
	public void listaaOpintojaksot() {
		Iterator opintojaksot = opintojaksoLista.iterator();
		DecimalFormat des = new DecimalFormat("0.0");
		while (opintojaksot.hasNext()) {
			Opintojakso opintojakso = (Opintojakso) opintojaksot.next();
			System.out.println("Opintojakson tunnuksella " + opintojakso.getTunnus() + " ja nimell‰ "
					+ opintojakso.getNimi() + " laajuus on " + des.format(opintojakso.getLaajuus()) + " op");
		}
	}

	public static void main(String[] args) {

		OpintojaksoListalla ohjelma = new OpintojaksoListalla();

		int valinta = -1;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\n1. Lis‰‰ opintojakso");
			System.out.println("2. Listaa opintojaksot");
			System.out.println("0. Lopetus");

			System.out.print("Anna valintasi (0-2): ");
			valinta = input.nextInt();

			switch (valinta) {
			case 1:
				ohjelma.lisaaOpintojakso();
				break;
	
			case 2:
				ohjelma.listaaOpintojaksot();
				break;

			case 0:
				break;

			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);
	}

}
