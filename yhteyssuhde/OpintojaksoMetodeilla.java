package yhteyssuhde;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OpintojaksoMetodeilla {
	// On luokan olio, jota k‰ytet‰‰n metodeissa. Ei voi k‰ytt‰‰ mainissa
	private Opintojakso opintojakso1;
	private Henkilo opettaja;
	
	public void teeOpettaja() {
		Scanner input = new Scanner(System.in);

		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();
	
		opettaja = new Henkilo(nimi, "");
	}

	public void teeOpintojakso() {
		// Ei saa olla Opintojakso opintojakso1 = new Opintojakso();
		// koska silloin olioista tulee metodin paikallinen muuttuja, joka
		// katoaa, kun metodin suoritus p‰‰ttyy
		// Opintojakso opintojakso1 = new Opintojakso(); VƒƒRIN
		opintojakso1 = new Opintojakso(); 

		Scanner input = new Scanner(System.in);

		System.out.print("Anna tunnus: ");
		String tunnus = input.nextLine();
		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();
		System.out.print("Anna laajuus: ");
		double laajuus = input.nextDouble();

		// T‰ytet‰‰n olio Opintojakso luokan set metodeilla
		opintojakso1.setTunnus(tunnus);
		opintojakso1.setNimi(nimi);
		opintojakso1.setLaajuus(laajuus);
		// Tehd‰‰n yhteyssuhde opintojakson ja henkilan v‰lille
		opintojakso1.setVastuuopettaja(opettaja);
	}

	public void naytaOpintojakso() {
		DecimalFormat des = new DecimalFormat("0.0");

		// N‰ytet‰‰n tiedot Opintojakso luokan get metodeilla 
		System.out.println("Opintojakson tunnuksella " + opintojakso1.getTunnus() + " ja nimell‰ "
				+ opintojakso1.getNimi() + " laajuus on " + des.format(opintojakso1.getLaajuus()) + " op"
				+ " vastuuopettaja on " + opintojakso1.getVastuuopettaja().getNimi());
	}

	public static void main(String[] args) {
		// Jotta OpintojaksoOhjelmaMetodeilla luokkaan koodattuja metodeja
		// voidaan k‰ytt‰‰, t‰ytyy kyseisest‰ luokasta tehd‰ olio. 
		OpintojaksoMetodeilla ohjelma = new OpintojaksoMetodeilla();
		
		ohjelma.teeOpettaja();
		ohjelma.teeOpintojakso();
		ohjelma.naytaOpintojakso();
	}

}
