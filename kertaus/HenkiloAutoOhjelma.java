package kertaus;

import java.util.Scanner;

public class HenkiloAutoOhjelma {

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

		String nimi, osoite;

		Henkilo henkilo = new Henkilo();

		System.out.print("Anna nimi: ");
		input.nextLine();
		nimi = input.nextLine();
		henkilo.setNimi(nimi);

		System.out.print("Anna osoite: ");
		osoite = input.nextLine();
		henkilo.setOsoite(osoite);

		henkilo.setAuto(auto);

		System.out.println("\nNimi: " + henkilo.getNimi());
		System.out.println("Osoite: " + henkilo.getOsoite());
		System.out.println("Auto: " + henkilo.getAuto().getMerkki() + " "
				+ henkilo.getAuto().getMalli() + " vuosimalli " + henkilo.getAuto().getVuosimalli());
	}

}
