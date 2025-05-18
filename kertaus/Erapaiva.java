package kertaus;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Erapaiva {
/*
Tee ohjelma, joka kysyy laskun eräpäivän. Ohjelma kertoo sen jälkeen, 
olisiko lasku pitänyt jo maksaa, pitääkö lasku maksaa tänään vai voiko 
laskun maksaa myöhemmin. Käytä päivämäärien vertailuun compareTo-metodia.
 * 
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Date erapaiva, tanaan;
		String erapaivaStr, tanaanStr;

		System.out.print("Anna laskun eräpäivä muodossa (vvvv-kk-pp): ");
		erapaivaStr = input.nextLine();
		SimpleDateFormat fdate = new SimpleDateFormat("yyyy-MM-dd");

		try {
			tanaanStr = fdate.format(new Date());
			tanaan = fdate.parse(tanaanStr);

			erapaiva = fdate.parse(erapaivaStr);

			int maksaminen = erapaiva.compareTo(tanaan);
			if (maksaminen == 0) {
				System.out.println("Lasku pitää maksaa tänään.");
			} else if (maksaminen > 0) {
				System.out.println("Laskua ei vielä tarvitse maksaa.");
			} else {
				System.out.println("Lasku olisi jo pitänyt maksaa.");
			}

		} catch (ParseException e) {
			System.out.println("Muuntaminen ei onnistunut");
		}
	}

}
