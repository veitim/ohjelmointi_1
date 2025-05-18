package taulukko;

import java.util.Scanner;

public class Ika_9 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Anna ikäsi (0-120): ");

		// Koska annettu syöte ei välttämättä ole kokonaisluku
		try {
			// Jos ei anneta kokonaislukua, laukeaa poikkeus
			int ika = input.nextInt();
			if (ika >= 0 && ika <= 120) {
				System.out.println("Ikä on väliltä 0-120");
			} else {
				System.out.println("Ikä pitää olla väliltä 0-120");
			}
		// Jos halutaan yksilöidä kiinni otettava poikkeus
		} catch (Exception InputMismatchException) {
			System.out.println("Ikä pitää olla kokonaisluku" );
		} 	
		/* Tällä otetaan kiinni kaikki poikkeukset
		catch (Error e) {
		  System.out.println("Ikä pitää olla kokonaisluku");
		}
		*/
	}

}
