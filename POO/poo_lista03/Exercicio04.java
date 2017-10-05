package br.edu.fatec;

import java.util.Scanner;

public class Exercicio04 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int a,b;
		
		while (true) {

			System.out.print("Indique valor A: ");
			a = scan.nextInt();

			System.out.print("Indique valor B: ");
			b = scan.nextInt();

			System.out.println(multiplo(a, b));
		}
	}

	static boolean multiplo(int a, int b) {

		if (a % b == 0) {
			return true;
		} else {
			return false;
		}

	}

}
