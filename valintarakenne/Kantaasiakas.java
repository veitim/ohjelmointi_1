package valintarakenne;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Tee ohjelma Kantaasiakas, joka laskee ostoksen loppusumman kanta-asiakkaan alennuksen jälkeen. Ohjelma kysyy ostosten loppusumman ja onko asiakas kanta-asiakas (kyllä tai ei). Jos käyttäjä on kanta-asiakas, hän saa alennusta ostoksesta 0.5%. Jos ostoksen loppusumma on yli 1000 eroa, kanta-asiakkaan alennus on 1.0%.
 */
public class Kantaasiakas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Anna ostosten summa: ");
		double summa = input.nextDouble();

		System.out.print("Oletko kanta-asiakas (1=kyllä): ");
		int kanta = input.nextInt();

		// Alennusrajat
		final double ALENNUS1 = 0.005, ALENNUS2 = 0.01;
		double loppusumma;

		// Jos on kanta-asiakas
		if (kanta == 1) {
			// Jos ostosten summa on yli 1000
			if (summa > 1000) {
				loppusumma = summa * (1 - ALENNUS2);
			} else {
				loppusumma = summa * (1 - ALENNUS1);
			}
		} else {
			loppusumma = summa;
		}

		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Ostosten loppusumma on " + desimaalit.format(loppusumma));
	}

}
