package lista; // Muuta tarvittaessa tätä

public class Opintojakso {
	// Olion ominaisuudet (tiedot)
	private String tunnus;
	private String nimi;
	private double laajuus;
	
	// Parametriton konstruktori. Luo olion "tyhjillä" tiedoilla
	public Opintojakso() {
		tunnus="";
		nimi="";
		laajuus=0;
	}

	// Parametrillinen konstruktori. Luo olion anneteuilla tiedoilla
	public Opintojakso(String tunnus, String nimi, double laajuus) {
		this.tunnus = tunnus;
		this.nimi = nimi;
		this.laajuus = laajuus;
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


	// Palauttaa olion tiedot merkkijonona
	// Voidaan käyttää, kun halutaan tarkastaa, mitä olion sisältönä on
	@Override
	public String toString() {
		return "Opintojakso [tunnus=" + tunnus + ", nimi=" + nimi + ", laajuus=" + laajuus + "]";
	}
}
