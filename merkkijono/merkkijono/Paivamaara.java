package merkkijono;

import java.util.Scanner;

public class Paivamaara {

	/*
	 * Tee ohjelma, joka kysyy k‰ytt‰j‰lt‰ p‰iv‰m‰‰r‰n muodossa kk-pp-vvvv. Jos
	 * p‰iv‰m‰‰r‰ on oikeaa muotoa, muunna se muotoon pp.kk.vvvv.
	 */

	public static void main(String[] args) {
		String paivamaara;

		Scanner input = new Scanner(System.in);
		System.out.print(("Anna p‰iv‰m‰‰r‰ muodossa kk-pp-vvvv: "));
		paivamaara = input.nextLine();

		// Tutkitaan, onko annettu p‰iv‰m‰‰r‰ haluttua muotoa
		if (paivamaara.matches("\\d{2}-\\d{2}-\\d{4}")) {
			
			// Otetaan merkkijonosta osamerkkijonot
			String kk = paivamaara.substring(0, 2);
			String pp = paivamaara.substring(3, 5);
			String vv = paivamaara.substring(6);

			System.out.println("P‰iv‰m‰‰r‰ on suomalaisessa muodossa "
					 + pp + "." + kk + "." + vv);
		} else {
			System.out.println("P‰iv‰m‰‰r‰ ei ole muotoa kk-pp-vvvv");
		}
	}

}
