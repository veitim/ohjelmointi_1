package yhteyssuhde;

import java.util.Scanner;

public class TiliOhjelma {

	public static void main(String[] args) {
		Tili tili = new Tili();

		Scanner input = new Scanner(System.in);

		System.out.print("Anna tilin omistajan hetu: ");
		String hetu = input.nextLine();
		System.out.print("Anna tilin omistajan nimi: ");
		String nimi = input.nextLine();

		// Luodaan omistaja
		Asiakas omistaja = new Asiakas(hetu, nimi);
		// Laitetaan tiliin viite omistajaan käyttäen Tili-luokan metodia
		tili.setOmistaja(omistaja);

		System.out.print("Anna tilinnumero: ");
		String numero = input.nextLine();
		System.out.print("Anna alkusaldo: ");
		double saldo = input.nextDouble();

		tili.setNumero(numero);
		tili.setSaldo(saldo);

		// System.out.println("Tilin tiedot:\n" + tili.toString());

		System.out.println("\nTilinumero: " + tili.getNumero());
		System.out.println("Saldo: " + tili.getSaldo());
		System.out.println("Omistajan hetu: " + tili.getOmistaja().getHetu());
		System.out.println("Omistajan nimi: " + tili.getOmistaja().getNimi());

	}
}
