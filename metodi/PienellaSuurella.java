package metodi;

import java.util.Scanner;

public class PienellaSuurella {

	// Metodi kysyy ja palauttaa merkkijonon
	// Parametrina kehote on merkkijono, joka n‰ytet‰‰n k‰ytt‰j‰lle
	// Metodi palauttaa Stringin eli merkkijonon
	public String kysyTeksti(String kehote) {
		Scanner input = new Scanner(System.in);

		System.out.print(kehote);
		String teksti = input.nextLine();

		// metodin palauttama merkkijono
		return teksti;

	}

	// Metodi n‰ytt‰‰ parametrina annetut merkkijonot
	// ensimm‰inen parametri teksi on, joka n‰ytet‰‰n
	// toinen parametri nayttaminen kertoo suurella vai piennell‰
	// metdo on void eli ei palauta mit‰‰n return lauseella
	public void naytaTeksti(String teksti, String nayttaminen) {
		if (nayttaminen.equals("pienell‰")) {
			teksti = teksti.toLowerCase();
		} else if (nayttaminen.equals("suurella")) {
			teksti = teksti.toUpperCase();
		}

		System.out.println("Teksti on " + nayttaminen + " " + teksti);
	}

	public static void main(String[] args) {
		// Jotta luokan metodeja voidaan k‰ytt‰‰, on luotava luokan olio, jolla niit‰
		// k‰ytet‰‰n
		PienellaSuurella ohjelma = new PienellaSuurella();

		String teksti, nayttaminen;

		// Kutsutaan metodia, joka pyyt‰‰ ja n‰ytt‰‰ merkkijonon
		teksti = ohjelma.kysyTeksti("Kirjoita teksti: ");
		nayttaminen = ohjelma.kysyTeksti("N‰ytet‰‰nk‰ suurella vai pienell‰: ");

		// Kutsutaan metodia, joka n‰ytt‰‰ annetun tekstin suurella/peinell‰
		ohjelma.naytaTeksti(teksti, nayttaminen);
	}

}
