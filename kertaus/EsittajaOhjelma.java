package kertaus;

import java.util.Scanner;

public class EsittajaOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();
		
		System.out.print("Anna syntym�vuosi: ");
		int vuosi = input.nextInt();
		
		Esittaja esittaja = new Esittaja(nimi, vuosi);
		
		System.out.println("Esitt�j�n on " + esittaja.getNimi() + " ja syntym�vuosi on " + esittaja.getSyntymavuosi());

	}

}
