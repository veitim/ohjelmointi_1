package yhteyssuhde;

public class Asiakas {
	private String hetu;
	private String nimi;

	public Asiakas() {
		hetu = "";
		nimi = "";
	}

	public Asiakas(String hetu, String nimi) {
		this.hetu = hetu;
		this.nimi = nimi;
	}

	public String getHetu() {
		return hetu;
	}

	public void setHetu(String hetu) {
		this.hetu = hetu;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	@Override
	public String toString() {
		return "Asiakas [hetu=" + hetu + ", nimi=" + nimi + "]";
	}

}
