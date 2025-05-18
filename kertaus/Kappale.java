package kertaus;

public class Kappale {
	String nimi;
	int kesto;
	int julkaisuvuosi;
	
	public Kappale() {
		nimi = "";
		kesto = 0;
		julkaisuvuosi = 0;
	}
	
	public Kappale(String nimi, int kesto, int julkaisuvuosi) {
		this.nimi = nimi;
		this.kesto = kesto;
		this.julkaisuvuosi = julkaisuvuosi;
	}

	public String getNimi() {
		return nimi;
	}
	
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	public int getKesto() {
		return kesto;
	}
	
	public void setKesto(int kesto) {
		this.kesto = kesto;
	}
	
	public int getJulkaisuvuosi() {
		return julkaisuvuosi;
	}
	
	public void setJulkaisuvuosi(int julkaisuvuosi) {
		this.julkaisuvuosi = julkaisuvuosi;
	}
	
	@Override
	public String toString() {
		return "Kappale [nimi=" + nimi + ", kesto=" + kesto + ", julkaisuvuosi=" + julkaisuvuosi + "]";
	}

}
