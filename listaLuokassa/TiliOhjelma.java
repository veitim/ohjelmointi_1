package listaLuokassa;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class TiliOhjelma {

	public static void main(String[] args) {
	
		Tili tili = new Tili();

		Scanner input = new Scanner(System.in);

		System.out.print("Anna tilinnumero: ");
		String numero = input.nextLine();
		System.out.print("Anna alkusaldo: ");
		double saldo = input.nextDouble();

		tili.setNumero(numero);
		tili.pano(saldo);

		System.out.print("Panon m‰‰r‰: ");
		double maara = input.nextDouble();

		tili.pano(maara);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Tilin saldo panon j‰lkeen " + desimaalit.format(tili.getSaldo()));

		System.out.print("Oton m‰‰r‰: ");
		maara = input.nextDouble();

		if (tili.otto(maara) == true) {
			System.out.println("Tilin saldo oton j‰lkeen " + desimaalit.format(tili.getSaldo()));
		} else {
			System.out.println("Tilill‰ ei ole katetta");
		}

		ArrayList<Tilitapahtuma> tapahtumaLista = tili.getTilitapahtumat();

		for (int i = 0; i < tapahtumaLista.size(); i++) {
			Tilitapahtuma tilitapahtuma = tapahtumaLista.get(i);
			System.out.println("\nP‰iv‰: " + tilitapahtuma.getTapahtumapaiva());
			System.out.println("M‰‰r‰: " + desimaalit.format(tilitapahtuma.getMaara()));
		}


	}
}
