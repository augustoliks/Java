package br.edu.fatec;

import java.util.Scanner;

public class Exercicio02 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		char matriz[][] = new char[20][20];
		int x, y, n;

		n = scan.nextInt();

		for (x = 0; x < n; x++) {
			for (y = 0; y < n; y++) {
				matriz[x][y] = '*';
			}
		}

		for (x = 0; x < n; x++) {
			for (y = 0; y < n; y++) {

				if (x == 0 || y == 0 || y == n-1 || x == n-1) {

					System.out.print(matriz[x][y]);

				}
				else {
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
		}

	}

}
