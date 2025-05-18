package yhteyssuhde;

public class Tuote {

	private int numero;
	private String nimi;
	private double hinta;
	private Toimittaja toimittaja;

	public Tuote() {
		numero = 0;
		nimi = "";
		hinta = 0.0;
		toimittaja = null;
	}

	public Tuote(int numero, String nimi, double hinta) {
		this.numero = numero;
		this.nimi = nimi;
		this.hinta = hinta;
		toimittaja = null;
	}

	public Tuote(int numero, String nimi, double hinta, Toimittaja toimittaja) {
		this.numero = numero;
		this.nimi = nimi;
		this.hinta = hinta;
		this.toimittaja = toimittaja;
	}
	
	//tuote.poistaToimittaja();
	public void poistaToimittaja() {
		toimittaja = null;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	public Toimittaja getToimittaja() {
		return toimittaja;
	}

	public void setToimittaja(Toimittaja toimittaja) {
		this.toimittaja = toimittaja;
	}

	@Override
	public String toString() {
		return "Tuote [numero=" + numero + ", nimi=" + nimi + ", hinta=" + hinta + ", toimittaja=" + toimittaja + "]";
	}

}
