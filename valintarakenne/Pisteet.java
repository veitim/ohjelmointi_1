package valintarakenne;

import java.util.Scanner;

public class Pisteet {
	/*
	 * Tee ohjelma, joka kysyy tentin pistem��r�n ja n�ytt�� arvosanan kirjaimin.
	 * Pisteet Arvosana 56 Kiitett�v�, 44 Hyv�, 30 V�ltt�v�, Alle 30 Hyl�tty
	 */

	public static void main(String[] args) {
		// Vakioiden esittely eli pisterajat
		final int KIITETTAVA = 56, HYVA = 44, VALTTAVA = 30;

		// Muuttujien esittely
		int pisteet;

		// Scannerin luonti
		Scanner input = new Scanner(System.in);

		// Sy�tteen pyyt�minen ja lukeminen
		System.out.print("Anna tenttipisteesi: ");
		pisteet = input.nextInt();

		// Vertailu
		// K�ytet��n if - else if -rakennetta, koska halutaan haarautua vain yhteen
		// kohtaan
		if (pisteet >= KIITETTAVA) {
			System.out.println("Kiitett�v�");
		} else if (pisteet >= HYVA) {
			System.out.println("Hyv�");
		} else if (pisteet >= VALTTAVA) {
			System.out.println("V�ltt�v�");
		} else {
			System.out.println("Hyl�tty");
		}
	}

}
