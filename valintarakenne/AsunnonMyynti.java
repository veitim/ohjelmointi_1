package valintarakenne;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AsunnonMyynti {
	public static void main(String[] args) {
		
		final double PALKKIOPROSENTTI = 3.44;
		final double MINPALKKIO = 2214.00;
		
		double myyntihinta, palkkio;
		Scanner input = new Scanner(System.in);

		System.out.print("Anna myyntihinta: ");
		myyntihinta = input.nextDouble();
		palkkio = myyntihinta * (PALKKIOPROSENTTI / 100);

		// Jos laskettu palkkio on pienempi kuin minimipalkkio
		if (palkkio < MINPALKKIO) {
			// Laitetaan palkkioksi minimipalkkio
			palkkio = MINPALKKIO;
		}

		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Myyntipalkkio on " + desimaalit.format(palkkio));
	}
}
