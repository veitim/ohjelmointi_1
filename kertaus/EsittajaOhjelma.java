package kertaus;

import java.util.Scanner;

public class EsittajaOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();
		
		System.out.print("Anna syntymävuosi: ");
		int vuosi = input.nextInt();
		
		Esittaja esittaja = new Esittaja(nimi, vuosi);
		
		System.out.println("Esittäjän on " + esittaja.getNimi() + " ja syntymävuosi on " + esittaja.getSyntymavuosi());

	}

}
