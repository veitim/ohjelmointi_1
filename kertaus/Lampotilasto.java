package kertaus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lampotilasto {

	public static void main(String[] args) {
		double lampotila, suurin=0, pienin=0, keskiarvo, summa = 0;;
		Scanner input = new Scanner(System.in);
		
		for(int i=1; i<=7; i++) {
			System.out.print("Anna " + i + ". lämpötila: ");
			lampotila = input.nextDouble();
			
			// Ensimmäinen lämpötila alustaa suurimman ja pienimmän
			if (i == 1) {
				suurin = lampotila;
				pienin = lampotila;
			} else {
				if (lampotila > suurin) {
					suurin = lampotila;
				}
				if (lampotila < pienin) {
					pienin = lampotila;
				}
			}
			summa = summa + lampotila;
		}
		DecimalFormat desimaalit = new DecimalFormat("0.0");
		
		keskiarvo = summa / 7;
		System.out.println("Pienin " + desimaalit.format(pienin));
		System.out.println("Suurin " + desimaalit.format(suurin));
		System.out.println("Keskiarvo " + desimaalit.format(keskiarvo));
	}

}
