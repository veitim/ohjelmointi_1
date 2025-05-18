package merkkijono;

import java.util.Scanner;

public class Sananlasku {

	public static void main(String[] args) {
		String sananlasku;
		int lkm = 0, kirjaimia = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Anna sananlasku: ");
		sananlasku = input.nextLine();

		// while (sananlasku.equals("LOPPU") != true) {
		// Toisteena niin kauan kuin sananlasku ei ole LOPPU
		while (! sananlasku.equals("LOPPU")) {
			// Lisätään sananlaskujen määrää
			lkm = lkm + 1;
			
			// Lisätään sananlaskuissa olevaa merkkien määrää
			kirjaimia = kirjaimia + sananlasku.length();

			System.out.print("Anna sananlasku: ");
			sananlasku = input.nextLine();
		}

		System.out.println("Sananlaskuja oli " + lkm + " kappaletta.");
		System.out.println("Sananlaskuissa oli merkkejä yhteensä " + kirjaimia);
	}

}
