package listaLuokassa;

import java.util.ArrayList;

public class Tili {

	private String numero;
	private double saldo;
	private Asiakas omistaja; 
	private ArrayList<Tilitapahtuma> tilitapahtumat = null;

	public Tili() {
		numero = "0";
		saldo = 0.0;
		omistaja = null; 
		
		tilitapahtumat = new ArrayList<Tilitapahtuma>();
	}

	public Tili(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
		this.omistaja = null; 
	
		tilitapahtumat = new ArrayList<Tilitapahtuma>();
		
		Tilitapahtuma tapahtuma = new Tilitapahtuma(saldo);
		tilitapahtumat.add(tapahtuma);
	}

	public Tili(String numero, double saldo, Asiakas omistaja) {
		this.numero = numero;
		this.saldo = saldo;
		this.omistaja = omistaja; 

		tilitapahtumat = new ArrayList<Tilitapahtuma>();
		
		Tilitapahtuma tapahtuma = new Tilitapahtuma(saldo);
		tilitapahtumat.add(tapahtuma);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void pano(double maara) {
		Tilitapahtuma tapahtuma = new Tilitapahtuma(maara);
		tilitapahtumat.add(tapahtuma);
		
		saldo = saldo + maara;
	}

	public boolean otto(double maara) {
		if (saldo >= maara) {
			saldo = saldo - maara;
			
			Tilitapahtuma tapahtuma = new Tilitapahtuma(-maara);
			tilitapahtumat.add(tapahtuma);
			return true;
		} else {
			return false;
		}
	}

	public Asiakas getOmistaja() {
		return omistaja;
	}

	public void setOmistaja(Asiakas omistaja) {
		this.omistaja = omistaja;
	}

	// Palauttaa tilitapahtumat listan
	public ArrayList<Tilitapahtuma> getTilitapahtumat() {
		return tilitapahtumat;
	}

	@Override
	public String toString() {
		return "Tili [numero=" + numero + ", saldo=" + saldo + ", omistaja=" + omistaja + ", tilitapahtumat="
				+ tilitapahtumat + "]";
	}

}
