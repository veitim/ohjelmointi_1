package kertaus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kuukausipalkka {
	/*
	 * Tee ohjelma, mik� kysyy kuukausipalkan ja tarkastaa sen. Kuukausipalkka
	 * pit�� olle numero, miss� voi olla kaksi desimaalia eik� kuukausipalkka
	 * voi olla suurempi kuin 10000
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");

		String kuukausipalkkaStr;
		int kuukausipalkka;

		System.out.print("Anna kuukausipalkka: ");
		kuukausipalkkaStr = input.nextLine();
		if (! kuukausipalkkaStr.matches("\\d+")) {
			System.out.println("Kuukausipalkka pit�� olla numeerinen");
		} else {
			kuukausipalkka = Integer.parseInt(kuukausipalkkaStr);
			if (kuukausipalkka > 10000) {
				System.out.print("Palkka on liian suuri");
			} else {
				System.out.println("Kuukausipalkka on "
						+ desimaalit.format(kuukausipalkka));
			}
		}

	}

}
