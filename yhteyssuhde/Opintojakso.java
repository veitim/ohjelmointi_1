package yhteyssuhde; // Muuta tarvittaessa tätä

public class Opintojakso {
	// Olion ominaisuudet (tiedot)
	private String tunnus;
	private String nimi;
	private double laajuus;
	private Henkilo vastuuopettaja;
	
	// Parametriton konstruktori. Luo olion "tyhjillä" tiedoilla
	public Opintojakso() {
		tunnus="";
		nimi="";
		laajuus=0;
		// Opintojaksolla ei ole vastuuopettajaa
		vastuuopettaja = null;
	}

	// Parametrillinen konstruktori. Luo olion anneteuilla tiedoilla
	public Opintojakso(String tunnus, String nimi, double laajuus) {
		this.tunnus = tunnus;
		this.nimi = nimi;
		this.laajuus = laajuus;
		laajuus=0;
		// Opintojaksolla ei ole vastuuopettajaa
		vastuuopettaja = null;
	}
	
	// Parametrillinen konstruktori. Luo olion anneteuilla tiedoilla
	public Opintojakso(String tunnus, String nimi, double laajuus, Henkilo vastuuopettaja) {
		this.tunnus = tunnus;
		this.nimi = nimi;
		this.laajuus = laajuus;
		laajuus=0;
		// Opintojaksolle asetetaan vastuuopettaja
		this.vastuuopettaja = vastuuopettaja;
	}

	// getterit ja setterit
	// gettereillä kysytään ominaisuuden arvoa
	// setterillä muutetaan ominaisuuden arvoa
	public String getTunnus() {
		return tunnus;
	}


	public void setTunnus(String tunnus) {
		this.tunnus = tunnus;
	}


	public String getNimi() {
		return nimi;
	}


	public void setNimi(String nimi) {
		this.nimi = nimi;
	}


	public double getLaajuus() {
		return laajuus;
	}


	public void setLaajuus(double laajuus) {
		this.laajuus = laajuus;
	}

	public Henkilo getVastuuopettaja() {
		return vastuuopettaja;
	}

	public void setVastuuopettaja(Henkilo vastuuopettaja) {
		this.vastuuopettaja = vastuuopettaja;
	}

	@Override
	public String toString() {
		return "Opintojakso [tunnus=" + tunnus + ", nimi=" + nimi + ", laajuus=" + laajuus + ", vastuuopettaja="
				+ vastuuopettaja + "]";
	}


}
