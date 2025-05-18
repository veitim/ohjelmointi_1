package kertaus;

public class Lampotila {
	String paivamaara;
	String paikkakunta;
	double mittaus;
	
	public Lampotila() {
		paivamaara = "";
		paikkakunta = "";
		mittaus = -999;
	}
	
	public Lampotila(String paivamaara, String paikkakunta, double mittaus) {
		this.paivamaara = paivamaara;
		this.paikkakunta = paikkakunta;
		this.mittaus = mittaus;
	}

	public String getPaivamaara() {
		return paivamaara;
	}

	public void setPaivamaara(String paivamaara) {
		this.paivamaara = paivamaara;
	}

	public String getPaikkakunta() {
		return paikkakunta;
	}

	public void setPaikkakunta(String paikkakunta) {
		this.paikkakunta = paikkakunta;
	}

	public double getMittaus() {
		return mittaus;
	}

	public void setMittaus(double mittaus) {
		this.mittaus = mittaus;
	}

	@Override
	public String toString() {
		return "Lampotila [paivamaara=" + paivamaara + ", paikkakunta=" + paikkakunta + ", mittaus=" + mittaus + "]";
	}

}
