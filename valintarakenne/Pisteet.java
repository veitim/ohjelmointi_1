package valintarakenne;

import java.util.Scanner;

public class Pisteet {
	/*
	 * Tee ohjelma, joka kysyy tentin pistemäärän ja näyttää arvosanan kirjaimin.
	 * Pisteet Arvosana 56 Kiitettävä, 44 Hyvä, 30 Välttävä, Alle 30 Hylätty
	 */

	public static void main(String[] args) {
		// Vakioiden esittely eli pisterajat
		final int KIITETTAVA = 56, HYVA = 44, VALTTAVA = 30;

		// Muuttujien esittely
		int pisteet;

		// Scannerin luonti
		Scanner input = new Scanner(System.in);

		// Syötteen pyytäminen ja lukeminen
		System.out.print("Anna tenttipisteesi: ");
		pisteet = input.nextInt();

		// Vertailu
		// Käytetään if - else if -rakennetta, koska halutaan haarautua vain yhteen
		// kohtaan
		if (pisteet >= KIITETTAVA) {
			System.out.println("Kiitettävä");
		} else if (pisteet >= HYVA) {
			System.out.println("Hyvä");
		} else if (pisteet >= VALTTAVA) {
			System.out.println("Välttävä");
		} else {
			System.out.println("Hylätty");
		}
	}

}
