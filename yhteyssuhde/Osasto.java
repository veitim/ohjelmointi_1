package yhteyssuhde;

public class Osasto {

	private int numero;
	private String nimi;

	public Osasto() {
		numero = 0;
		nimi = "";
	}

	public Osasto(int numero, String nimi) {
		this.numero = numero;
		this.nimi = nimi;
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

	@Override
	public String toString() {
		return "Osasto [numero=" + numero + ", nimi=" + nimi + "]";
	}

}
