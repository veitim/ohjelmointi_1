package listaLuokassa;

public class Arvostelu {
	private int arvosana;
	private String teksti;

	public Arvostelu() {
		arvosana = 0;
		teksti = "";
	}

	public Arvostelu(int arvosana, String teksti) {
		this.arvosana = arvosana;
		this.teksti = teksti;
	}

	public int getArvosana() {
		return arvosana;
	}

	public void setArvosana(int arvosana) {
		this.arvosana = arvosana;
	}

	public String getTeksti() {
		return teksti;
	}

	public void setTeksti(String teksti) {
		this.teksti = teksti;
	}

	@Override
	public String toString() {
		return "Arvostelu [arvosana=" + arvosana + ", teksti=" + teksti + "]";
	}

}
