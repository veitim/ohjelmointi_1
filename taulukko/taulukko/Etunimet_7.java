package taulukko;

public class Etunimet_7 {
	/*
	 * Tee ohjelma, joka listaa nelj‰ suosituinta naisten ja miesten nime‰
	 * vuodelta 2020. Nimet ovat valmiina merkkijonotaulukossa
	 */

	public static void main(String[] args) {
		// Tehd‰‰n taulukko annetuilla tiedoilla
		String[] tiedot = { "Maria,1077", "Sofia,1030", "Aurora,869", "Olivia,760", "Juhani,1001", "Olavi,987",
				"Johannes,974", "Mikael,720" };

		// K‰yd‰‰n taulukko l‰pi
		for (int i = 0; i < tiedot.length; i++) {
			// Pilkotaan merkkijono , merkin perusteella
			// Pilkonta palauttaa merkkijonotaulukon
			String[] tieto = tiedot[i].split(",");
			// Paikalla 0 on nimi ja paikalla 1 m‰‰r‰
			System.out.println(tieto[0] + " " + tieto[1] + " kpl");
		}

	}

}
