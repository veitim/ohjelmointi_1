package kertaus;

import java.util.Scanner;

public class KappaleOhjelma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();
		
		System.out.print("Anna kesto: ");
		int kesto = input.nextInt();
		
		System.out.print("Anna julkaisivuosi: ");
		int vuosi = input.nextInt();
		
		Kappale kappale = new Kappale(nimi, kesto, vuosi);
		
		System.out.println("Kappale on " + kappale.getNimi());

	}

}
