package yhteyssuhde;

public class Toimittaja {
	private String nimi;
	private String osoite;

	public Toimittaja() {
		nimi = "";
		osoite = "";
	}

	public Toimittaja(String nimi, String osoite) {
		this.nimi = nimi;
		this.osoite = osoite;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	@Override
	public String toString() {
		return "Toimittaja [nimi=" + nimi + ", osoite=" + osoite + "]";
	}
}
