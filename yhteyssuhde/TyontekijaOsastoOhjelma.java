package yhteyssuhde;

import java.util.Scanner;

public class TyontekijaOsastoOhjelma {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Osasto osasto = new Osasto();
		Tyontekija tyontekija = new Tyontekija();

		System.out.print("Anna osaston numero: ");
		int onumero = input.nextInt();
		osasto.setNumero(onumero);

		System.out.print("Anna osaston nimi: ");
		input.nextLine();
		String onimi = input.nextLine();
		osasto.setNimi(onimi);

		System.out.print("Anna ty�ntekij�n numero: ");
		int tnumero = input.nextInt();
		tyontekija.setNumero(tnumero);

		System.out.print("Anna ty�ntekij�n nimi: ");
		input.nextLine();
		String tnimi = input.nextLine();
		tyontekija.setNimi(tnimi);

		tyontekija.setOsasto(osasto);

		System.out
				.println("Ty�ntekij� " + tyontekija.getNimi()
						+ " ty�skentelee osastolla "
						+ tyontekija.getOsasto().getNimi());

	}

}
