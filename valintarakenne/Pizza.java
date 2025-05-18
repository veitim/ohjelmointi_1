package valintarakenne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		double pizza1, pizza2, pizza3, halvin, summa, keskihinta;

		Scanner input = new Scanner(System.in);

		System.out.print("Anna pizzojen hinnat (3): ");
		// Luetaan pizzojen hinnat, kolme lukua peräkkäin samalta riviltä tai eri
		// riveiltä
		pizza1 = input.nextDouble();
		pizza2 = input.nextDouble();
		pizza3 = input.nextDouble();

		// Tutkitaan, onko pizza1 halvin
		if (pizza1 <= pizza2 && pizza1 <= pizza3) {
			halvin = pizza1;
		// Tutkitaan, onko pizza2 halvin
		} else if (pizza2 <= pizza1 && pizza2 <= pizza3) {
			halvin = pizza2;
		// Muuten pizza3 on halvin
		} else {
			halvin = pizza3;
		}

		// summataan pizzojen hinnat ja vähennetään halvimman hinta
		summa = pizza1 + pizza2 + pizza3 - halvin;

		keskihinta = summa / 3;

		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.print(
				"Maksettavaa: " + desimaalit.format(summa) + "\nYksittäisen hinta: " + desimaalit.format(keskihinta));

	}

}
