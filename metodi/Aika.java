package metodi;

import java.util.Scanner;

public class Aika {
	/*
	 * Tee ohjelma, joka kysyy ajan minuutteina ja näyttää sen tunti ja minuutti
	 * muodossa.
	 */

	// Metodi pyytää ajan minuutteina
	// metodi palauttaa pyydetyn tiedon merkkijonona
	public String kysyMinuutit() {
		Scanner input = new Scanner(System.in);
		String minuutit;

		System.out.print("Anna aika minuutteina: ");
		minuutit = input.nextLine();

		return minuutit; //  "178"
	}

	// Metodi tarkastaa, onko tieto oikeaa muotoa eli numeroita
	// metodi palauttaa boolean arvon true/false
	public boolean tarkastaMinuutit(String minuutit) {
		if (minuutit.matches("\\d+")) {
			return true;
		} else {
			return false;
		}
	}

	// Metodi muuttaa minuuttiajan kellonajaksi
	// metodi saa parametrina minuutit muutettavan
	// metodi palauttaa kellonaikana merkkijon muodossa
	public String muutaAjaksi(String minuutit) {
		String aika;  // "178"  => "2:58"
		int tunti, min;

		tunti = Integer.parseInt(minuutit) / 60;  // 178 / 60 -> 2
		min = Integer.parseInt(minuutit) - (tunti * 60);  // 178 - 120 -> 58

		if (min < 10) {  
			aika = tunti + ":0" + min;
		} else {
			aika = tunti + ":" + min;
		}

		return aika;  // "2:58"

	}

	// Metodi näyttää parametrina tulleen merkkijonon
	// Metodi on void tyyppinen eli ei palauta mitään return lauseella
	public void naytaKellonaika(String kellonaika) {
		System.out.println("Tunteina ja minuutteina " + kellonaika);
	}

	public static void main(String[] args) {
		// On luotava luokan olio, jotta metodeja voidaan kutsua
		Aika ohjelma = new Aika();

		String minuutit;     // "178"
		String kellonaika;  // "2:58"

		minuutit = ohjelma.kysyMinuutit(); // "178"

		if (ohjelma.tarkastaMinuutit(minuutit)) {
			kellonaika = ohjelma.muutaAjaksi(minuutit);  // "2:58"
			ohjelma.naytaKellonaika(kellonaika);
		} else {
			System.out.println("Ei kelpaa luvuksi");
		}
	}

}
