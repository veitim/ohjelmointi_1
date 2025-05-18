package merkkijono;

import java.util.Scanner;

public class PienellaSuurella {

	/*
	 * Tee ohjelma, jolla voidaan valita, näytetäänkö annettu teksti suurilla vai
	 * pienillä kirjaimilla.
	 */

	public static void main(String[] args) {
		String teksti, nayttaminen;

		Scanner input = new Scanner(System.in);

		System.out.print("Kirjoita teksti: ");
		teksti = input.nextLine();

		System.out.print("Näytetäänkä suurella vai pienellä: ");
		nayttaminen = input.nextLine();

		// Onko käyttäjän antaman merkkijonon sisältönä "pienellä"
		// Voidaan laittaa myös
		// if (nayttaminen.equals("pienellä")) {
		if (nayttaminen.equals("pienellä") == true) {
			teksti = teksti.toLowerCase();
		} else if (nayttaminen.equals("suurella") == true) {
			teksti = teksti.toUpperCase();
		}

		System.out.println("Teksti on " + nayttaminen + " " + teksti);
	}

}
