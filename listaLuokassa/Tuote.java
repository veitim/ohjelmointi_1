package listaLuokassa;

import java.util.ArrayList;

public class Tuote {

	private int numero;
	private String nimi;
	private double hinta;
	private ArrayList<Arvostelu> arvostelut = null;

	public Tuote() {
		numero = 0;
		nimi = "";
		hinta = 0.0;

		arvostelut = new ArrayList<Arvostelu>();
	}

	public Tuote(int numero, String nimi, double hinta) {
		this.numero = numero;
		this.nimi = nimi;
		this.hinta = hinta;

		arvostelut = new ArrayList<Arvostelu>();
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

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}


	public ArrayList<Arvostelu> getArvostelut() {
		return arvostelut;
	}

	@Override
	public String toString() {
		return "Tuote [numero=" + numero + ", nimi=" + nimi + ", hinta=" + hinta + ", arvostelut=" + arvostelut + "]";
	}

}
