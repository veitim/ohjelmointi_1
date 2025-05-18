package perusteita;  // Kansio, jossa on yhteenkuluvat koodit

// Tuodaan t‰ss‰ ohjelmassa k‰yttett‰v‰t Javan valmiit luokat
import java.text.DecimalFormat;  // Jotta desimaaliluken muotoilu onnistuu
import java.util.Scanner; // Jotta saadaan luettua n‰pp‰imistˆ‰

public class AsunnonMyynti {

	/*
	 * Tee ohjelma (kalvoesimerkkin‰), joka kysyy asunnon myyntihinnan ja laskee
	 * asunnon myynnist‰ maksettavan v‰lityspalkkion. V‰lityspalkkion on 3,44%
	 * myyntihinnasta. Esimerkiksi jos asunnon myyntihinta on 100000 euroa,
	 * v‰lityspalkkio on 3440 euroa (myyntihinta*(3.44/100.0)).
	 */

	public static void main(String[] args) {
		// Esitell‰‰n vakio eli ei voida muuttaa ohjelmassa
		final double PALKKIO = 3.44;  // Desimaaliluvussa on piste

		// Esitell‰‰n muuttujat eli tieto voidaan ohjelmassa muuttaa
		double myyntihinta, palkkio;

		// Kysyt‰‰n k‰ytt‰j‰lt‰ hintaa konsolista
		System.out.print("Anna asunnon myyntihinta: ");

		// Esitell‰ Scanner ja tuodaan ohjelman alkuun paketti, miss‰ Scanner on
		Scanner input = new Scanner(System.in);

		// Luetaan hinta n‰pp‰imistˆlt‰
		myyntihinta = input.nextDouble();  
		// Desimaaliluku annetaan n‰pp‰imistˆlt‰ esim. 123000,00 eli pilkulla

		// Lasketaan
		palkkio = myyntihinta * (PALKKIO / 100.0);

		// M‰‰ritell‰‰n deimaalien muotoilu
		DecimalFormat desimaalit = new DecimalFormat("0.00");

		// N‰ytet‰‰n vastaus muotoiltuna + yhdist‰‰ merkkijonoja (vakioteksti‰)  ja muuttujia
		System.out.println("Myyntipalkkio on " + desimaalit.format(palkkio));
	}

}
