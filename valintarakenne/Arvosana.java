package valintarakenne;

import java.util.Scanner;

public class Arvosana {
	/*
	 * Tee ohjelma, joka kysyy arvosanan ja kertoo sen kirjaimin.
	 * 
	 * Arvosana Arvosana 5 Kiitett‰v‰ 4 Hyv‰ 3 Hyv‰ 2 Tyydytt‰v‰ 1 V‰ltt‰v‰ 0
	 * Hyl‰tty
	 */

	public static void main(String[] args) {
		int arvosana;
		Scanner input = new Scanner(System.in);

		System.out.print("Anna arvosana (0-5): ");
		arvosana = input.nextInt();

		// Vertaillaan arvosana muuttujaa case-haaroihin
		// Suoritetaan se case-haara, miss‰ on sama arvo kuin arvosana-muuttujan
		// arvo
		switch (arvosana) {
		case 5:
			System.out.println("Kiitett‰v‰");
			break;
		// Kun arvosana on 4 tai 3
		case 4:
		case 3:
			System.out.println("Hyv‰");
			break;
		case 2:
			System.out.println("Tyydytt‰v‰");
			break;
		case 1:
			System.out.println("Heikko");
			break;
		// Jos ei ollut mik‰‰n edellisist‰
		default:
			System.out.println("Ei kelpaa arvosanaksi");
		}
	}

}
