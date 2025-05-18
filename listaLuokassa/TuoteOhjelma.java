package listaLuokassa;

import java.util.List;
import java.util.Scanner;

public class TuoteOhjelma {

	public static void main(String[] args) {
		Tuote tuote = new Tuote();

		Scanner input = new Scanner(System.in);
		System.out.print("Anna numero: ");
		int numero = input.nextInt();
		tuote.setNumero(numero);
		input.nextLine();

		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();
		tuote.setNimi(nimi);

		System.out.print("Anna hinta: ");
		double hinta = input.nextDouble();
		input.nextLine();
		tuote.setHinta(hinta);

		System.out.print("\nAnna arvosana (-1 lopettaa): ");
		int arvosana = input.nextInt();
		input.nextLine();
		while (arvosana != -1) {
			System.out.print("Anna arvosteluteksti: ");
			String teksti = input.nextLine();
			
			Arvostelu arvostelu = new Arvostelu(arvosana, teksti);
			tuote.getArvostelut().add(arvostelu);
			
			System.out.print("Anna arvosana (-1 lopettaa): ");
			arvosana = input.nextInt();
			input.nextLine();
		}

		System.out.println("\nNumero: " + tuote.getNumero() + "\nNimi: "
				+ tuote.getNimi() + "\nHinta: " + tuote.getHinta());

		List<Arvostelu> arvosteluluLista = tuote.getArvostelut();
		System.out.println("Arvostelut: ");
		for (int i = 0; i < arvosteluluLista.size(); i++) {
			Arvostelu arvostelu = arvosteluluLista.get(i);
			System.out.println(arvostelu.getArvosana() + " "
					+ arvostelu.getTeksti());
		}

	}
}
