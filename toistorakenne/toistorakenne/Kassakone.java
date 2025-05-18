package toistorakenne;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Kassakone {

	public static void main(String[] args) {
		double hinta, yhteensa = 0;

		Scanner input = new Scanner(System.in);

		// Lopussa testataan, voidaanko toistaa uudelleen
		do {
			System.out.print("Anna ostoksen hinta (0 lopettaa): ");
			hinta = input.nextDouble();
			yhteensa = yhteensa + hinta;
		} while (hinta != 0); // Kun hinta ei ole nolla, toistetaan uudestaan

		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Ostosten yhteishinta on " + desimaalit.format(yhteensa));

	}

}
