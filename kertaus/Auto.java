package kertaus;

import java.time.LocalDate;

public class Auto {
	private String merkki;
	private String malli;
	private String rekisteriNro;
	private int vuosimalli;

	public Auto() {
		merkki = "";
		malli = "";
		rekisteriNro = "";
		vuosimalli = 0;
	}

	public Auto(String merkki, String malli, String rekisteriNro, int vuosimalli) {
		this.merkki = merkki;
		this.malli = malli;
		this.rekisteriNro = rekisteriNro;
		this.vuosimalli = vuosimalli;
	}

	public String getMerkki() {
		return merkki;
	}

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public String getMalli() {
		return malli;
	}

	public void setMalli(String malli) {
		this.malli = malli;
	}

	public String getRekisteriNro() {
		return rekisteriNro;
	}

	public void setRekisteriNro(String rekisteriNro) {
		this.rekisteriNro = rekisteriNro;
	}

	public int getVuosimalli() {
		return vuosimalli;
	}

	public void setVuosimalli(int vuosimalli) {
		this.vuosimalli = vuosimalli;
	}

	public int getIka() {
		int tamaVuosi = LocalDate.now().getYear(); 

		int ika = tamaVuosi - vuosimalli;

		return ika;
	}

	public String toString() {
		return "merkki=" + merkki + ", malli=" + malli + ", rekisteriNro="
				+ rekisteriNro + ", vuosimalli=" + vuosimalli;
	}

}