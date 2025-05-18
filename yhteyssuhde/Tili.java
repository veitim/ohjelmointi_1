package yhteyssuhde;

public class Tili {

	private String numero;
	private double saldo;
	private Asiakas omistaja; // Yhteyssuhde eli tilillä on yhteys omistajaan

	public Tili() {
		numero = "0";
		saldo = 0.0;
		omistaja = null; // Ei ole tietoa omistajasta
	}

	public Tili(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
		this.omistaja = null; // Ei ole tietoa omistajasta
	}

	public Tili(String numero, double saldo, Asiakas omistaja) {
		this.numero = numero;
		this.saldo = saldo;
		this.omistaja = omistaja; // Talletetaan viite omistajaan
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		saldo = this.saldo;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void pano(double maara) {
		saldo = saldo + maara;
	}

	public boolean otto(double maara) {
		if (saldo >= maara) {
			saldo = saldo - maara;
			return true;
		} else {
			return false;
		}
	}

	// Palautetaan viite omistajaan
	public Asiakas getOmistaja() {
		return omistaja;
	}

	// Asetetaan viite omistajaan
	public void setOmistaja(Asiakas omistaja) {
		this.omistaja = omistaja;
	}

	@Override
	public String toString() {
		return "Tili [numero=" + numero + ", saldo=" + saldo + ", omistaja=" + omistaja + "]";
	}

}
