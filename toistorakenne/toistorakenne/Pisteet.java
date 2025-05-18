package toistorakenne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pisteet {

	/*
	 * Tee ohjelma, joka kysyy kokeiden pistem‰‰ri‰ niin kauan kuin pistem‰‰r‰ on >=
	 * 0. Lopuksi ohjelma laskee pisteiden keskiarvon.
	 */
	public static void main(String[] args) {
		// Muuttuja, johon lasketaan annettujen pisteiden summa
		// Muuttuja alustetaan nollaksi, koska alussa pisteiden summa on nolla
		int summa = 0;

		// Muuttuja, johon k‰ytt‰j‰lt‰ kysyt‰‰n kokeen pistem‰‰r‰
		int pisteet;

		// Muuttuja, mihin lasketaan, montako pistett‰ annettiin
		// Muuttuja alustetaan nollaksi, koska yht‰‰n lukua ei viel‰ ole annettu
		int lkm = 0;

		Scanner input = new Scanner(System.in);
		// Luetaan ensimm‰iset pisteet
		System.out.print("Anna koepisteet: ");
		pisteet = input.nextInt();

		// Silmukkaa toistetaan niina kaun kuin pisteet-muuttujan arvo >= 0
		while (pisteet >= 0) {  // T‰‰ll‰ ei saa olla puolipistett‰, koska se p‰‰tt‰isi toiston
			// Saadut pisteet summataan entisiin pisteisiin
			summa = summa + pisteet;
			// Lukum‰‰r‰‰ kasvatetaan yhdell‰
			lkm = lkm + 1; // tai lkm++;
			// Pyydet‰‰n uudet pisteet
			System.out.print("Anna koepisteet: ");
			pisteet = input.nextInt();
		}
		// Lasketaan keksiarvo
		// (double) jotta laskun tulos olisi desimaaliluku
		// ilman (double) laskuun tulos on kokonaisluku eli desimaalit j‰‰v‰t
		// pois
		double keskiarvo = (double) summa / lkm;

		DecimalFormat f = new DecimalFormat("0.00");
		System.out.println("Keskiarvo on " + f.format(keskiarvo));

	}

}
