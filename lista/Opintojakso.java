package lista; // Muuta tarvittaessa t�t�

public class Opintojakso {
	// Olion ominaisuudet (tiedot)
	private String tunnus;
	private String nimi;
	private double laajuus;
	
	// Parametriton konstruktori. Luo olion "tyhjill�" tiedoilla
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
	// gettereill� kysyt��n ominaisuuden arvoa
	// setterill� muutetaan ominaisuuden arvoa
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
	// Voidaan k�ytt��, kun halutaan tarkastaa, mit� olion sis�lt�n� on
	@Override
	public String toString() {
		return "Opintojakso [tunnus=" + tunnus + ", nimi=" + nimi + ", laajuus=" + laajuus + "]";
	}
}
