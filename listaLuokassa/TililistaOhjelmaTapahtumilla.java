package listaLuokassa;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TililistaOhjelmaTapahtumilla {

	// Luodaan lista
	private ArrayList<Tili> tiliLista = new ArrayList<Tili>();

	private void teeTili() {
		Scanner input = new Scanner(System.in);

		System.out.print("Anna tilinnumero: ");
		String numero = input.nextLine();
		System.out.print("Anna alkusaldo: ");
		double saldo = input.nextDouble();

		// Luodaan olio
		Tili tili = new Tili(numero, saldo);

		// Lis�t��n listalle tili ArrayList-luokan add-metodilla
		tiliLista.add(tili);
	}

	private void teeOtto() {
		Scanner input = new Scanner(System.in);

		String numero = kysyTilinumero();
		// Etsit��n tili� annetulla numerolla
		// etsiTili metodi palauttaa null, jos etsitty� ei ole
		// etsiTili-metodi palauttaa viitteen etsittyyn olioon, jos etsitty on
		// listalla
		Tili tili = etsiTili(numero);

		// Jos etsitty oli listalla
		if (tili != null) {
			System.out.print("Oton m��r�: ");
			double maara = input.nextDouble();

			if (tili.otto(maara)) {
				DecimalFormat desimaalit = new DecimalFormat("0.00");
				System.out.println("Tilin saldo oton j�lkeen " + desimaalit.format(tili.getSaldo()));
			} else {
				System.out.println("Tilill� ei ole katetta");
			}
		} else {
			System.out.println("Tili� ei ole numerolla " + numero);
		}
	}

	private void teePano() {
		Scanner input = new Scanner(System.in);
		String numero = kysyTilinumero();
		Tili tili = etsiTili(numero);

		if (tili != null) {
			System.out.print("Panon m��r�: ");
			double maara = input.nextDouble();

			tili.pano(maara);
			DecimalFormat desimaalit = new DecimalFormat("0.00");
			System.out.println("Tilin saldo panon j�lkeen " + desimaalit.format(tili.getSaldo()));
		} else {
			System.out.println("Tili� ei ole numerolla " + numero);
		}
	}

	private void naytaTili() {
		String numero = kysyTilinumero();
		Tili tili = etsiTili(numero);
		if (tili != null) {
			System.out.println("Tilinumero: " + tili.getNumero());
			DecimalFormat desimaalit = new DecimalFormat("0.00");
			System.out.println("Saldo: " + desimaalit.format(tili.getSaldo()));
		} else {
			System.out.println("Tili� ei ole numerolla " + numero);
		}
	}

	private String kysyTilinumero() {
		Scanner input = new Scanner(System.in);

		System.out.print("Anna tilinumero: ");
		String numero = input.nextLine();

		return numero;
	}

	// Metodi paluttaa null, jos tili� ei ole parametrina tuleella numerolla,
	// muuten metodi paluttaa viitteen listalta etsittyyn olioon
	private Tili etsiTili(String numero) {
		int i = 0;
		// Viite on null, koska etsitty� ei viel� ole l�ytynyt
		Tili tili = null;
		// kertoo, onko etsitty l�ytynyt
		boolean loytynyt = false;

		// Silmukkaa suoritetaan niin kauan kuin etsitty� ei ole k�ytynyt ja
		// listalla on olioita
		while (!loytynyt && i < tiliLista.size()) {
			// Haetaan listasta olio List-luokan get-metodilla
			tili = tiliLista.get(i);
			// Vertaillaan listalta haetun olion tilinumeroa parametrina
			// tulleeseen tilinumeroon
			if (tili.getNumero().equals(numero)) {
				loytynyt = true;
			} else {
				i++;
			}
		}

		// Jos etsitty tili l�ytyi
		if (loytynyt) {
			return tili;
		} else {
			return null;
		}
	}

	private void listaaTilit() {
		Tili tili;
		/*
		 * for (int i = 0; i < tiliLista.size(); i++) { // Haetaan tili listalta
		 * List-luokan get-metodilla tili = tiliLista.get(i); // N�ytet��n tiedot
		 * Tili-luokan metodeilla System.out.println("Tilinumero: " + tili.getNumero());
		 * System.out.println("Saldo: " + tili.getSaldo()); }
		 */
		Iterator tilit = tiliLista.iterator();
		while (tilit.hasNext()) {
			// Haetaan tili listalta List-luokan get-metodilla
			tili = (Tili) tilit.next();
			// N�ytet��n tiedot Tili-luokan metodeilla
			System.out.println("Tilinumero: " + tili.getNumero());
			DecimalFormat desimaalit = new DecimalFormat("0.00");
			System.out.println("Saldo: " + desimaalit.format(tili.getSaldo()));
		}
	}

	private void poistaTili() {
		String numero = kysyTilinumero();
		Tili tili = etsiTili(numero);

		if (tili != null) {
			// Poistetaan tili listalta Lis-luokan remove-metodilla
			tiliLista.remove(tili);
			System.out.println("Tili poistettiin numerolla " + numero);
		} else {
			System.out.println("Tili� ei ole numerolla " + numero);
		}

	}
	
	private void naytaTilitapahtumat() {
		String numero = kysyTilinumero();
		Tili tili = etsiTili(numero);

		if (tili != null) {
			System.out.println("Tilinumero: " + tili.getNumero());
			DecimalFormat desimaalit = new DecimalFormat("0.00");
			System.out.println("Saldo: " + desimaalit.format(tili.getSaldo()));
			System.out.println("Tapahtumat:");
			for (Tilitapahtuma tapahtuma: tili.getTilitapahtumat() ) {
				System.out.println(tapahtuma.getTapahtumapaiva() + " " + desimaalit.format(tapahtuma.getMaara()));
			}
		} else {
			System.out.println("Tili� ei ole numerolla " + numero);
		}	
		
	}

	public static void main(String[] args) {
		TililistaOhjelmaTapahtumilla ohjelma = new TililistaOhjelmaTapahtumilla();

		int valinta = -1;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\n1. Tee tili");
			System.out.println("2. Otto");
			System.out.println("3. Pano");
			System.out.println("4. N�yt� tili");
			System.out.println("5. N�yt� kaikki tilit");
			System.out.println("6. Poista tili");
			System.out.println("7. N�yt� tilitapahtumat");
			System.out.println("0. Lopetus");

			System.out.print("Anna valintasi (0-7): ");
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
			case 5:
				ohjelma.listaaTilit();
				break;
			case 6:
				ohjelma.poistaTili();
				break;
			case 7:
				ohjelma.naytaTilitapahtumat();
				break;
			case 0:
				break;
			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);

	}
}
