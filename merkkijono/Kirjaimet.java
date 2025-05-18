package merkkijono;

import java.util.Scanner;

public class Kirjaimet {

	public static void main(String[] args) {
		String teksti;
		char kirjain;
		Scanner input = new Scanner(System.in);

		System.out.print("Anna teksti: ");
		teksti = input.nextLine();

		// K‰yd‰‰n merkkojono l‰pi
		// teksti.length() kertoo merkkijonon pituuden
		for (int i = 0; i < teksti.length(); i++) {
			
			// Otetaan merkkijonosta kukin merkki vuorollaan
			// charAt ottaa merkkijonosta yhden merkin
			kirjain = teksti.charAt(i);
			System.out.println((i + 1) + ". kirjain on " + kirjain);
		}

	}

}
