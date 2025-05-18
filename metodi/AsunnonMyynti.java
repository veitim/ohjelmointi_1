package metodi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AsunnonMyynti {

	// Metodi kysyy asunnon myyntihinnan ja palauttaa sen return-lausellaa
	public double kysyMyyntihinta() {
		double myyntihinta;
		Scanner input = new Scanner(System.in);

		System.out.print("Anna asunnon myyntihinta: ");
		myyntihinta = input.nextDouble();

		return myyntihinta;
	}

	// Metodi laskee palkkion ja palauttaa sen return-lausella
	// Metodiin menee parametrina myyntihinta, mistä palkkio lasketaan
	public double laskePalkkio(double myyntihinta) {
		final double PALKKIO = 3.44;
		final double MINPALKKIO = 3000.00;

		double palkkio = myyntihinta * (PALKKIO / 100.0);
		
		if (palkkio < MINPALKKIO) {
			palkkio = MINPALKKIO;
		}

		return palkkio;
	}
	
	public void naytaPalkkio(double palkkio) {
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Myyntipalkkio on " + desimaalit.format(palkkio));
	}

	public static void main(String[] args) {
		// Luokasta tehdään olio, jolla voidaan kutsua metodeja
		AsunnonMyynti ohjelma = new AsunnonMyynti();

		double myyntihinta, palkkio;
		

		// Kutsutaan metodeja
		myyntihinta = ohjelma.kysyMyyntihinta();
		palkkio = ohjelma.laskePalkkio(myyntihinta);
		
		ohjelma.naytaPalkkio(palkkio);
	}
	
}
