package perusteita;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Kimppakyyti {

	/*
	 * Tee ohjelma, jolla kimppakyytiläiset voivat laskea polttoainekustannukset.
	 * Ohjelma kysyy ajetut kilometrit, auton kulutuksen per 100 km, bensan
	 * litrahinnan sekä kimppakyytiläisten lukumäärän. Ohjelma laskee edellä
	 * kerrotuista tiedoista, kuinka paljon jokainen maksaa bensoista. Muotoile
	 * vastaus kahdella desimaalilla.
	 * 
	 * Esimerkiksi ajetut kilometri on 500, kulutus on 7 litraa/100km, polttoaine
	 * maksaa 1,690 euroa/litra ja kimppakyytiläisiä on kolme, jokainen maksaa
	 * 19.716666666666665 (500 * 7 / 100.0 * 1.690 /3).
	 */

	public static void main(String[] args) {

		// Muuttujien esittely
		int lkm;
		double ajettu, litrahinta, kulutus, kustannus;

		// Tiedon kysyminen käyttäjältä
		System.out.print("Anna ajetut kilometrit: ");

		// Käyttäjän syötteen lukeminen
		Scanner input = new Scanner(System.in);
		// Luetaan desimaaliluku, käyttäja antaa esim. 23,50 eli pilkulla
		ajettu = input.nextDouble();

		System.out.print("Anna kulutus per 1oo km: ");
		kulutus = input.nextDouble();

		System.out.print("Anna polttoaineen litrahinta: ");
		litrahinta = input.nextDouble();

		System.out.print("Anna kimppakyytiläisten lukumäärä: ");
		lkm = input.nextInt();

		// Laskeminen
		kustannus = (kulutus / 100.0 * litrahinta) * ajettu / lkm;

		// Vastauksen näyttäminen, muotoillaan desimaalit
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Bensakustannus per henkilö on " + desimaalit.format(kustannus) + " euroa");
	}

}
