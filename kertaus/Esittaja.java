package kertaus;

import java.util.ArrayList;

public class Esittaja {
	private String nimi;
	private int syntymavuosi;
	private ArrayList<Kappale> kappaleLista = new ArrayList<Kappale>();

	public Esittaja() {
		nimi = "";
		syntymavuosi = 0;
	}

	public Esittaja(String nimi, int syntymavuosi) {
		this.nimi = nimi;
		this.syntymavuosi = syntymavuosi;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public int getSyntymavuosi() {
		return syntymavuosi;
	}

	public void setSyntymavuosi(int syntymavuosi) {
		this.syntymavuosi = syntymavuosi;
	}

	public ArrayList<Kappale> getKappaleLista() {
		return kappaleLista;
	}

	@Override
	public String toString() {
		return "Esittaja [nimi=" + nimi + ", syntymavuosi=" + syntymavuosi + ", kappaleLista=" + kappaleLista + "]";
	}


}
