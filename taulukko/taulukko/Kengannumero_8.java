package taulukko;

import java.util.Scanner;

public class Kengannumero_8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Anna kengännumerosi: ");
 
		// Käyttäjän syöte ei välttämättä ole numero
		try {
			int numero = input.nextInt();
			System.out.println("Kengännumero on luku");
		} catch (Exception e) {
			System.out.println("Kengännumero ei ole luku");
		}

	}

}
