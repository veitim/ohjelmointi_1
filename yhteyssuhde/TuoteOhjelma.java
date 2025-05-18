package yhteyssuhde;

public class TuoteOhjelma {

	public static void main(String[] args) {
		Tuote tuote1 = new Tuote();
		Toimittaja toimittaja = new Toimittaja("Eskon verstas", "Kiminki");

		tuote1.setNumero(200);
		tuote1.setNimi("Saha");
		tuote1.setHinta(23.56);
		tuote1.setToimittaja(toimittaja);

		System.out.println("Ekan tuotteen tiedot: ");
		System.out.println("Numero: " + tuote1.getNumero() + "\nNimi: "
				+ tuote1.getNimi() + "\nHinta: " + tuote1.getHinta());
		System.out.println("Toimittajan nimi: "
				+ tuote1.getToimittaja().getNimi());
		System.out.println("Toimittajan osoite: "
				+ tuote1.getToimittaja().getOsoite());

		System.out.println("\nTokan tuotteen tiedot: ");
		Tuote tuote2 = new Tuote(300, "Vasara", 13.50, toimittaja);
		System.out.println("Numero: " + tuote2.getNumero() + "\nNimi: "
				+ tuote2.getNimi() + "\nHinta: " + tuote2.getHinta());
		System.out.println("Toimittajan nimi: "
				+ tuote1.getToimittaja().getNimi());
		System.out.println("Toimittajan osoite: "
				+ tuote1.getToimittaja().getOsoite());
	}
}
