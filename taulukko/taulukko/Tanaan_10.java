package taulukko;

import java.time.LocalDate;

public class Tanaan_10 {

	public static void main(String[] args) {
		// Otetaan nykyinen p‰iv‰m‰‰r‰
		LocalDate tanaan = LocalDate.now(); 

		// Otetaan p‰iv‰m‰‰r‰st‰ halutut tiedot
		int vuosi = tanaan.getYear();  
		int kuukausi = tanaan.getMonthValue();  
		int paiva = tanaan.getDayOfMonth();  

		System.out.println("T‰n‰‰n on " + paiva + "." + kuukausi + "." + vuosi);
	}

}
