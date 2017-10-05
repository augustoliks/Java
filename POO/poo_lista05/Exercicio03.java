package br.edu.fatec;

import java.util.Scanner;

public class Exercicio03 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		double a = 0, b = 0, c = 0;
		while (true) {
			do {
				System.out.print("Indique o Cateto A: ");
				a = scan.nextDouble();

				System.out.print("Indique o Cateto B: ");
				b = scan.nextDouble();

				System.out.print("Indique o Cateto C: ");
				c = scan.nextDouble();
			} while (!triangulo(a, b, c));

			System.out.println("Triangulo Retangulo: "+trianguloRetangulo(a, b, c));
		}
	}

	static boolean triangulo(double a, double b, double c) {

		if ((a >= b + c && b >= c + a && c >= a + b) || (a > 0 || b > 0 || c > 0)) {
			return true;
		}

		else {
			return false;
		}

	}

	static boolean trianguloRetangulo(double a, double b, double c) {
		double hipotenusa = (a > b && a > c) ? a : (b > a && b > c) ? b : (c > a && c > b) ? c : a;

		if (hipotenusa == a) {
			a = 0;
		}
		
		else if (hipotenusa == b) {
			b = 0;
		}

		else if (hipotenusa == c) {
			c = 0;
		}

		if (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(hipotenusa, 2)) {
			return true;
		}

		else {
			return false;
		}

	}

}