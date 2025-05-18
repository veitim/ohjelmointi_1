package lista;

public class Tili {

	private String numero;
	private double saldo;
	private Asiakas omistaja; 

	public Tili() {
		numero = "0";
		saldo = 0.0;
		omistaja = null; 
	}

	public Tili(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
		this.omistaja = null; 
	}

	public Tili(String numero, double saldo, Asiakas omistaja) {
		this.numero = numero;
		this.saldo = saldo;
		this.omistaja = omistaja; 
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		saldo = this.saldo;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void pano(double maara) {
		saldo = saldo + maara;
	}

	public boolean otto(double maara) {
		if (saldo >= maara) {
			saldo = saldo - maara;
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

	@Override
	public String toString() {
		return "Tili [numero=" + numero + ", saldo=" + saldo + ", omistaja=" + omistaja + "]";
	}

}
