package kertaus;

import java.util.Scanner;

public class Vedenkulutus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int MAX = 7;
		int kulutus, lukema;
		int lukemat[] = new int[MAX];
		
		System.out.print("Anna vesimittarin alkulukema: ");
		int alkulukema = input.nextInt();
		lukemat[0] = alkulukema;

		for (int i = 1; i < lukemat.length; i++) {
			System.out.print("Anna " + i + ". vesimittarin lukema: ");
			lukema = input.nextInt();

			lukemat[i] = lukema;
		}

		System.out.println();

		for (int i = 1; i < lukemat.length; i++) {
			kulutus = lukemat[i] - lukemat[i-1];
			System.out.println("Kuukauden " + i + " kulutus oli " + kulutus);
		}

	}

}
