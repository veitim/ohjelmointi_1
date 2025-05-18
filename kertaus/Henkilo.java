package kertaus;

public class Henkilo {
	private String nimi;
	private String osoite;
	private Auto auto;

	public Henkilo() {
		nimi = "";
		osoite = "";
		auto = null;
	}

	public Henkilo(String nimi, String osoite) {
		this.nimi = nimi;
		this.osoite = osoite;
		auto = null;
	}

	public Henkilo(String nimi, String osoite, Auto auto) {
		this.nimi = nimi;
		this.osoite = osoite;
		this.auto = auto;
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

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + ", auto=" + auto + "]";
	}

}
