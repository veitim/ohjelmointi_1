package kertaus;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Erapaiva {
/*
Tee ohjelma, joka kysyy laskun er�p�iv�n. Ohjelma kertoo sen j�lkeen, 
olisiko lasku pit�nyt jo maksaa, pit��k� lasku maksaa t�n��n vai voiko 
laskun maksaa my�hemmin. K�yt� p�iv�m��rien vertailuun compareTo-metodia.
 * 
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Date erapaiva, tanaan;
		String erapaivaStr, tanaanStr;

		System.out.print("Anna laskun er�p�iv� muodossa (vvvv-kk-pp): ");
		erapaivaStr = input.nextLine();
		SimpleDateFormat fdate = new SimpleDateFormat("yyyy-MM-dd");

		try {
			tanaanStr = fdate.format(new Date());
			tanaan = fdate.parse(tanaanStr);

			erapaiva = fdate.parse(erapaivaStr);

			int maksaminen = erapaiva.compareTo(tanaan);
			if (maksaminen == 0) {
				System.out.println("Lasku pit�� maksaa t�n��n.");
			} else if (maksaminen > 0) {
				System.out.println("Laskua ei viel� tarvitse maksaa.");
			} else {
				System.out.println("Lasku olisi jo pit�nyt maksaa.");
			}

		} catch (ParseException e) {
			System.out.println("Muuntaminen ei onnistunut");
		}
	}

}
