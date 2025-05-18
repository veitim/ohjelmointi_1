package perusteita;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Kimppakyyti {

	/*
	 * Tee ohjelma, jolla kimppakyytil�iset voivat laskea polttoainekustannukset.
	 * Ohjelma kysyy ajetut kilometrit, auton kulutuksen per 100 km, bensan
	 * litrahinnan sek� kimppakyytil�isten lukum��r�n. Ohjelma laskee edell�
	 * kerrotuista tiedoista, kuinka paljon jokainen maksaa bensoista. Muotoile
	 * vastaus kahdella desimaalilla.
	 * 
	 * Esimerkiksi ajetut kilometri on 500, kulutus on 7 litraa/100km, polttoaine
	 * maksaa 1,690 euroa/litra ja kimppakyytil�isi� on kolme, jokainen maksaa
	 * 19.716666666666665 (500 * 7 / 100.0 * 1.690 /3).
	 */

	public static void main(String[] args) {

		// Muuttujien esittely
		int lkm;
		double ajettu, litrahinta, kulutus, kustannus;

		// Tiedon kysyminen k�ytt�j�lt�
		System.out.print("Anna ajetut kilometrit: ");

		// K�ytt�j�n sy�tteen lukeminen
		Scanner input = new Scanner(System.in);
		// Luetaan desimaaliluku, k�ytt�ja antaa esim. 23,50 eli pilkulla
		ajettu = input.nextDouble();

		System.out.print("Anna kulutus per 1oo km: ");
		kulutus = input.nextDouble();

		System.out.print("Anna polttoaineen litrahinta: ");
		litrahinta = input.nextDouble();

		System.out.print("Anna kimppakyytil�isten lukum��r�: ");
		lkm = input.nextInt();

		// Laskeminen
		kustannus = (kulutus / 100.0 * litrahinta) * ajettu / lkm;

		// Vastauksen n�ytt�minen, muotoillaan desimaalit
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Bensakustannus per henkil� on " + desimaalit.format(kustannus) + " euroa");
	}

}
