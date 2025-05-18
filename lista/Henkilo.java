package lista;

import java.time.LocalDate;

public class Henkilo {
	private String nimi;
	private String osoite;
	private int syntymavuosi;

	public Henkilo() {
		nimi = "";
		osoite = "";
		syntymavuosi = 0;
	}

	public Henkilo(String nimi, String osoite) {
		this.nimi = nimi;
		this.osoite = osoite;
		syntymavuosi = 0;
	}

	public Henkilo(String nimi, String osoite, int syntymavuosi) {
		super();
		this.nimi = nimi;
		this.osoite = osoite;
		this.syntymavuosi = syntymavuosi;
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

	public int getSyntymavuosi() {
		return syntymavuosi;
	}

	public void setSyntymavuosi(int syntymavuosi) {
		this.syntymavuosi = syntymavuosi;
	}

	public int getIka() {
		int tamaVuosi = LocalDate.now().getYear();
		return (tamaVuosi - getSyntymavuosi());
	}

	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + ", syntymavuosi=" + syntymavuosi + "]";
	}

}
