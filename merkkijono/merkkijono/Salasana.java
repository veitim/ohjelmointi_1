package merkkijono;

import java.util.Scanner;

public class Salasana {

	public static void main(String[] args) {
		String salasana1, salasana2;

		Scanner input = new Scanner(System.in);
		System.out.print("Anna salasana: ");
		salasana1 = input.nextLine();

		System.out.print("Anna salasana uudestaan: ");
		salasana2 = input.nextLine();

		// Jos salasanat ovat samat
		if (salasana1.equals(salasana2) == true) {
			System.out.println("Salasanat vastaavat toisiaan");
		} else {
			System.out.println("Salasanat eivät vastaa toisiaan");
		}

	}

}
