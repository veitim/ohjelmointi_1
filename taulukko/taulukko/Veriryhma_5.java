package taulukko;

import java.util.Scanner;

public class Veriryhma_5 {

	public static void main(String[] args) {
		// Vakio, joka m‰‰rittelee taulukon koon
		final int MAX = 1000;
		
		int lkm = 0; // Kertoo taulukossa olevien veriryhmien m‰‰r‰n
		int maara = 0; // Kertoo etsityn veriryhm‰n lukum‰‰r‰n
		
		String[] luovutukset = new String[MAX]; // Luodaan taulukko, johin voidaan laittaa veriryhm‰t
		String luovutus; // Muuttuja, johon luetaan yksitt‰inen veriryhm‰
		
		Scanner input = new Scanner(System.in);

		System.out.print("Anna veriryhm‰ (- lopettaa): ");
		luovutus = input.nextLine(); 
		
		// Jos veriryhm‰ ei ole - eik‰ taulukko ole t‰ynn‰
		while (! luovutus.equals("-") && lkm < MAX) {
			// Laitetaan veriryhm‰ taulukkoon
			luovutukset[lkm] = luovutus;
			lkm++;
			// Jos taulukko ei ole t‰ynn‰
			if (lkm < MAX) {
				System.out.print("Anna veriryhm‰  (- lopettaa): ");
				luovutus = input.nextLine();
			}
		}

		System.out.println("Luovutuksia oli yhteens‰ " + lkm);

		System.out.print("Mink‰ veriryhm‰n luovutusten m‰‰r‰n haluat tiet‰‰: ");
		luovutus = input.nextLine();
		
		// Etsit‰‰n luovutukset
		for (int i = 0; i < lkm; i++) {
			// Jos etsitt‰v‰ luovutus on sama kuin taulukossa oleva luovutus
			if (luovutus.equals(luovutukset[i])) {
				maara++;
			}
		}

		System.out.println("Veriryhm‰n " + luovutus + " luovutuksia oli " + maara);
	}

}
