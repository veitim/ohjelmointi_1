package merkkijono;

import java.util.Scanner;

public class Ylioppilas {

	/*
	 * Tee ohjelma,joka kertoo YO-arvosanan kirjaimin. L = Laudatur E = Eximia
	 * cum laude approbatur M = Magna cum laude approbatur C = Cum laude
	 * approbatur B = Lubenter approbatur A = Approbatur I = Impropatur
	 */

	public static void main(String[] args) {
		String teksti = "";

		Scanner input = new Scanner(System.in);

		System.out.print("Annan arvosana kirjaimella: ");
		// Luetaan yksi sana
		String arvosanaStr = input.next();
		
		// Otetaan sanasta ensimmäinen kirjain
		char arvosana = arvosanaStr.charAt(0);

		switch (arvosana) {
		case 'L':
			teksti = "Laudatur";
			break;
		case 'E':
			teksti = "Eximia cum laude approbatur";
			break;
		case 'M':
			teksti = "Magna cum laude approbatur";
			break;
		case 'C':
			teksti = "Cum laude approbatur";
			break;
		case 'B':
			teksti = "Lubenter approbatur";
			break;
		case 'A':
			teksti = "Approbatur";
			break;
		case 'I':
			teksti = "Impropatur";
			break;
		}

		System.out.println("Arvosana " + arvosana + " on " + teksti);

	}

}
