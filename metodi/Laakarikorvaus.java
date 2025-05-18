package metodi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Laakarikorvaus {
	/*
	 * Tee ohjelma Laakarikorvaus, joka kertoo kelakorvauksen m‰‰r‰n yleisl‰‰k‰rin
	 * k‰ynnist‰. Ohjelma kysyy k‰ynnin keston ja kertoo kelakorvauksen m‰‰r‰n.
	 * Taksat m‰‰r‰ytyv‰t alla olevan taulukon mukaan: Vastaanottok‰ynti, enint‰‰n
	 * 10 min 8,00 Vastaanottok‰ynti, enint‰‰n 20 min 11,00 Vastaanottok‰ynti,
	 * enint‰‰n 30 min 13,50
	 * 
	 * double laskeKorvaus(int kesto) metodi laskee ja palauttaa kelakorvauksen
	 * suuruuden parametrina on kesto, mik‰ kertoo k‰ynnin keston (tieto tulee
	 * parametrina, sit‰ ei kysyt‰ metodissa)
	 */

	// Metodi laskee korvauksen ja palauttaa sen return lauseella
	public double laskeKorvaus(int kesto) {
		double korvaus = 0;

		if (kesto <= 10) {
			korvaus = 8.0;
		} else if (kesto <= 20) {
			korvaus = 11;
		} else if (kesto <= 30) {
			korvaus = 13.50;
		}

		return korvaus;
	}

	public static void main(String[] args) {
		// On luotava luokan olio, jotta luokan metodia voidaan kutsua
		Laakarikorvaus ohjelma = new Laakarikorvaus();

		int kesto;
		double korvaus;
		Scanner input = new Scanner(System.in);

		System.out.print("Anna k‰ynnin kesto: ");
		kesto = input.nextInt();

		korvaus = ohjelma.laskeKorvaus(kesto);

		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Kestoltaan " + kesto + " minuutin yleisl‰‰k‰rik‰ynnist‰ kelakorvaus on "
				+ desimaalit.format(korvaus) + " euroa");

	}

}
