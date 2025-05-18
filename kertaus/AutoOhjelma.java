package kertaus;

import java.util.Scanner;

public class AutoOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Auto auto = new Auto();

		System.out.print("Anna merkki: ");
		String merkki = input.nextLine();

		System.out.print("Anna malli: ");
		String malli = input.nextLine();

		System.out.print("Anna rekisterinumero: ");
		String rekisteriNro = input.nextLine();

		System.out.print("Anna vuosimalli: ");
		int vuosimalli = input.nextInt();

		auto.setMerkki(merkki);
		auto.setMalli(malli);
		auto.setRekisteriNro(rekisteriNro);
		auto.setVuosimalli(vuosimalli);

		System.out.println("Merkki ja malli: " + auto.getMerkki() + " "
				+ auto.getMalli());
		System.out.println("Rekisterinumero: " + auto.getRekisteriNro());
		System.out.println("Vuosimalli: " + auto.getVuosimalli());
		System.out.println("Auton ikä: " + auto.getIka() + " vuotta");

	}
}
