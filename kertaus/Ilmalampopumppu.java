package kertaus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ilmalampopumppu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double investointi, sahko, vuosi, maksettu;
		
		System.out.print("Annan ilmalämpöpumpun hinta: ");
		investointi = input.nextDouble();
		System.out.print("Anna sähkön hinta/kWh: ");
		sahko = input.nextDouble();
		vuosi = 3000 * sahko/100;
		maksettu = 0;
		int vuosia = 0;
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		while (maksettu < investointi) {
			vuosia++;
			maksettu = maksettu + vuosi;
			System.out.println(vuosia + ". säästetty " + desimaalit.format(maksettu));

		}
		System.out.println("\nMaksaminen kesti " + vuosia + " vuotta");

	}

}
