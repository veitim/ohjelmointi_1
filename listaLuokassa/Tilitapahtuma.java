package listaLuokassa;

import java.time.LocalDate;

public class Tilitapahtuma {

	LocalDate tapahtumapaiva;
	private double maara;

	public Tilitapahtuma() {
		tapahtumapaiva = LocalDate.now();
		maara = 0.0;
	}

	public Tilitapahtuma(double maara) {
		tapahtumapaiva = LocalDate.now();
		this.maara = maara;
	}

	public Tilitapahtuma(LocalDate tapahtumapaiva, double maara) {
		this.tapahtumapaiva = tapahtumapaiva;
		this.maara = maara;
	}

	public LocalDate getTapahtumapaiva() {
		return tapahtumapaiva;
	}

	public void setTapahtumapaiva(LocalDate tapahtumapaiva) {
		this.tapahtumapaiva = tapahtumapaiva;
	}

	public double getMaara() {
		return maara;
	}

	public void setMaara(double maara) {
		this.maara = maara;
	}

	@Override
	public String toString() {
		return "Tilitapahtuma [tapahtumapaiva=" + tapahtumapaiva + ", maara=" + maara + "]";
	}

}
