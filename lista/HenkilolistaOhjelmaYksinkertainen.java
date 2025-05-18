package lista;

import java.util.ArrayList;

public class HenkilolistaOhjelmaYksinkertainen {
	
	private ArrayList<Henkilo> henkiloLista = new ArrayList<Henkilo>();
	
	private void lisaaHenkilot() {
		Henkilo henkilo = new Henkilo("Matti", "Vantaa", 1993);
		henkiloLista.add(henkilo);
		henkilo = new Henkilo("Liisa", "Espoo", 1976);
		henkiloLista.add(henkilo);
		henkilo = new Henkilo("Maija", "Helsinki", 2001);
		henkiloLista.add(henkilo);
		System.out.println("Kolme henkil�� lis�ttiin");
	}
	
	private void poistaHenkio() {
		if (henkiloLista.size() >= 1) {
			henkiloLista.remove(0);
			System.out.println("Ensimm�inen poistettiin");
		} else {
			System.out.println("Lista on tyhj�");
		}
	}

	
	private void muutaSyntyma() {
		if (henkiloLista.size() >= 1) {
			henkiloLista.get(henkiloLista.size()-1).setSyntymavuosi(2000);
			System.out.println("Syntym�vuosi muutettiin");
		} else {
			System.out.println("Lista on tyhj�");
		}
		
	}
	

	private void listaaHenkilot() {
		for (int i = 0; i < henkiloLista.size(); i++) {
			Henkilo henkilo = henkiloLista.get(i);
			System.out.println("\nNimi: " + henkilo.getNimi());
			System.out.println("Osoite: " + henkilo.getOsoite());
			System.out.println("Syntym�vuosi: " + henkilo.getSyntymavuosi());
		}
	}

	public static void main(String[] args) {
		HenkilolistaOhjelmaYksinkertainen ohjelma = new HenkilolistaOhjelmaYksinkertainen();
		ohjelma.lisaaHenkilot();
		ohjelma.poistaHenkio();
		ohjelma.muutaSyntyma();
		ohjelma.listaaHenkilot();
	}

}
