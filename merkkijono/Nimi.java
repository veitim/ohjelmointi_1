package merkkijono;

import java.util.Scanner;

public class Nimi {

	/*
	 * Tee ohjelma, joka pyytää käyttäjältä nimen käyttäen nextLine()-metodia.
	 * Käyttäjän antama nimi muodostuu etu- ja sukunimestä, joiden välissä on yksi
	 * välilyönti. Ohjelma erottaa nimestä etu- ja sukunimen omiin muuttujiinsa ja
	 * näyttää nimet siten, että etunimi alkaa suurella alkukirjaimella ja muut
	 * merkit ovat pienellä ja sukunimi on kokonaan suurella.
	 */

	public static void main(String[] args) {
		String kokonimi, etunimi, sukunimi;
		int valilyonninPaikka;

		Scanner input = new Scanner(System.in);

		System.out.print("Kirjoita etu- ja sukunimesi: ");
		kokonimi = input.nextLine();

		// alusta ja lopusta tyhjät pois
		kokonimi = kokonimi.trim();

		// etsi välilyönti
		valilyonninPaikka = kokonimi.indexOf(" ");
		
		// erota substringillä merkkijono osamerkkinoiksi
		etunimi = kokonimi.substring(0, valilyonninPaikka);
		etunimi = etunimi.trim();
		sukunimi = kokonimi.substring(valilyonninPaikka + 1);
		sukunimi = sukunimi.trim();

		// muuta ekat kirjaimet suuriksi, muut pieniksi
		String ekaKirjain = etunimi.substring(0, 1).toUpperCase();
		String loppuNimi = etunimi.substring(1).toLowerCase();
		etunimi = ekaKirjain + loppuNimi;

		// muuta kaikki kirjaimet suuriksi
		sukunimi = sukunimi.toUpperCase();
	}

}
