package listaLuokassa;

import java.util.ArrayList;
import java.util.Scanner;

public class TuoteOhjelmaArvosteluilla {

	private ArrayList<Tuote> tuoteLista = new ArrayList<Tuote>();

	public void kysyTuote(Tuote tuote) {
		Scanner input = new Scanner(System.in);

		System.out.print("\nAnna numero: ");
		tuote.setNumero(input.nextInt());
		input.nextLine();
		System.out.print("Anna nimi: ");
		tuote.setNimi(input.nextLine());
		System.out.print("Anna hinta: ");
		tuote.setHinta(input.nextDouble());
	}

	public void lisaaTuoteListaan() {
		Tuote tuote = new Tuote();

		this.kysyTuote(tuote);
		tuoteLista.add(tuote);
	}

	public int etsiTuoteNumerolla(int numero) {
		int i = 0;
		final int MAX = tuoteLista.size();
		boolean loytynyt = false;

		while (i < MAX && !loytynyt) {
			if (tuoteLista.get(i).getNumero() == numero) {
				loytynyt = true;
			} else {
				i++;
			}
		}

		if (loytynyt) {
			return i;
		} else {
			return -1;
		}
	}

	public void muutaTuoteListasta() {
		Scanner input = new Scanner(System.in);

		System.out.print("\nAnna muutettavan tuotteen numero: ");
		int numero = input.nextInt();
		input.nextLine();

		int i = etsiTuoteNumerolla(numero);
		if (i != -1) {
			kysyTuote(tuoteLista.get(i));
		} else {
			System.out.println("Tuotetta numerolla " + numero + " ei ole");
		}

	}

	public void naytaTuote(Tuote tuote) {
		System.out.println(tuote.toString());
	}

	public void naytaTuoteListasta() {
		Scanner input = new Scanner(System.in);

		System.out.print("\nAnna näytettävän tuotteen numero: ");
		int numero = input.nextInt();
		input.nextLine();

		int i = etsiTuoteNumerolla(numero);
		if (i != -1) {
			naytaTuote(tuoteLista.get(i));
		} else {
			System.out.println("Tuotetta numerolla " + numero + " ei ole");
		}
	}

	public void poistaTuoteListasta() {
		Scanner input = new Scanner(System.in);

		System.out.print("\nAnna poistettava tuotteen numero: ");
		int numero = input.nextInt();
		input.nextLine();

		int i = etsiTuoteNumerolla(numero);
		if (i != -1) {
			tuoteLista.remove(i);
			System.out.println("Tuote numerolla " + numero + " poistettiin");
		} else {
			System.out.println("Tuotetta numerolla " + numero + " ei ole");
		}
	}

	public void naytaTuotteetListasta() {
		int i;

		for (i = 0; i < tuoteLista.size(); i++) {
			naytaTuote(tuoteLista.get(i));
		}
	}

	public void lisaaArvostelu() {
		Scanner input = new Scanner(System.in);

		System.out.print("\nAnna tuotteen numero, johon arvostelu liitetään: ");
		int numero = input.nextInt();
		input.nextLine();

		int i = etsiTuoteNumerolla(numero);
		if (i != -1) {
			System.out.print("Anna arvosana: ");
			int arvosana = input.nextInt();
			input.nextLine();
			System.out.print("Anna arvosteluteksti: ");
			String teksti = input.nextLine();
			Arvostelu arvostelu = new Arvostelu(arvosana, teksti);
			
			Tuote tuote = tuoteLista.get(i);
			tuote.getArvostelut().add(arvostelu);
		} else {
			System.out.println("Tuotetta numerolla " + numero + " ei ole");
		}
	}

	public static void main(String[] args) {
		TuoteOhjelmaArvosteluilla sovellus = new TuoteOhjelmaArvosteluilla();
		int toiminto;

		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\n1 = Lisää tuote");
			System.out.println("2 = Muuta tuote");
			System.out.println("3 = Näytä tuote");
			System.out.println("4 = Näytä kaikki tuotteet");
			System.out.println("6 = Poista tuote");
			System.out.println("7 = Lisää arvostelu");
			System.out.println("0 = Lopeta");
			System.out.print("Anna valintasi: ");

			toiminto = input.nextInt();

			switch (toiminto) {
			case 1:
				sovellus.lisaaTuoteListaan();
				break;
			case 2:
				sovellus.muutaTuoteListasta();
				break;
			case 3:
				sovellus.naytaTuoteListasta();
				break;
			case 4:
				sovellus.naytaTuotteetListasta();
				break;
			case 6:
				sovellus.poistaTuoteListasta();
				break;
			case 7:
				sovellus.lisaaArvostelu();
				break;
			}
		} while (toiminto != 0);
	}
}
