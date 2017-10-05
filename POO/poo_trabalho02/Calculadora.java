package br.edu.fatec;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		String op;

		do {
			op = leitor.next();
			switch (op) {
			case "1":
				ex01();
				break;
			case "2":
				ex02();
				break;
			case "3":
				ex03();
				break;
			case "4":
				ex04();
				break;
			case "5":
				ex05();
				break;
			case "6":
				ex06();
				break;
			case "7":
				ex07();
				break;
			case "8":
				ex08();
				break;
			case "9":
				ex09();
				break;
			case "10":
				ex10();
				break;
			default:
				break;
			}

		} while (true);
	}

	public static void ex01() {
		char c = 69;

		System.out.println("C:" + c);
		switch (c) {

		case 1:
			System.out.print("1 ");
		default:
			System.out.print("default ");
		case 2:
			System.out.print("2 ");
		case 3:
			System.out.print("3 ");
		case 4:
			System.out.print("4 ");
		}

	}

	public static void ex02() {

		String s1 = "a";
		String s2 = "a";

		s1 += "bc";

		System.out.println(s1);
		System.out.println(s2);
	}

	public static void ex03() {

		boolean b = false;

		if (b = false) {

			System.out.println("B verdadeiro");

		} else {

			System.out.println("B falso");
		}

	}

	public static void ex04() {
		String s = "String";
		int b = 3;
		int c = 7;
		System.out.println(s + (b + c));
		System.out.println(s + b + c + s);
		System.out.println((s + b) + b + c);
	}

	public static void ex05() {
		byte x = 3;
		switch (x) {
		case 1:
			System.out.println("x is equal to 1");
		case 128: // byte vai ate -128 ate 127
			System.out.println("x eh 128");

		}
	}

	public static void ex06() {
		System.out.println(1 + 2 + "" + 2 + 1);
	}

	public static void ex07() {

		for (int i = 0; i < 3; i++) {

			switch (i) {

			case 0:
				break;

			case 1:
				System.out.print("one ");

			case 2:
				System.out.print("two ");

			case 3:
				System.out.print("three ");
			}
		}
		System.out.println("done");
	}

	public static void ex08() {
		System.out.println(1 > 2);
	}

	public static void ex09() {
		int i, soma = 0;

		for (i = 1; i <= 5; i++) {

			if (i == 4)

				continue;

			soma += i;

		}
		System.out.println(soma);
	}

	public static void ex10() {
		int i, soma = 0;
		for (i = 1; i <= 5; i++) {
			if (i == 4)
				break;
			soma += i;
		}
		System.out.println(soma);
	}

}