package yhteyssuhde;

public class Tyontekija {
	private int numero;
	private String nimi;
	private Osasto osasto;

	public Tyontekija() {
		numero = 0;
		nimi = "";
		osasto = null;
	}

	public Tyontekija(int numero, String nimi, Osasto osasto) {
		this.numero = numero;
		this.nimi = nimi;
		this.osasto = osasto;
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

	public Osasto getOsasto() {
		return osasto;
	}

	public void setOsasto(Osasto osasto) {
		this.osasto = osasto;
	}

	@Override
	public String toString() {
		return "Tyontekija [numero=" + numero + ", nimi=" + nimi + ", osasto=" + osasto + "]";
	}

}
