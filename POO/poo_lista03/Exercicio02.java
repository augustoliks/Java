package br.edu.fatec;

import java.util.Scanner;

public class Exercicio02 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		double p=0.0;

		while (true) {
			System.out.println(
					"Codigo do Produto (COD - R$0,00):\n\tP1 - R$1,00 \n\tP2 - R$2,98 \n\tP3 - R$9,98 \n\tP4 - R$4,49 \n\tP5 - R$6,87");
			System.out.print("Insira o respectivo o codigo: ");
			String codProduto = scan.next();

			System.out.print("Insira a quantidade de produtos: ");
			int quantidade = scan.nextInt();

			switch (codProduto) {
			case "P1":
				p = quantidade * 1.00;
				break;

			case "P2":
				p = quantidade * 2.98;
				break;

			case "P3":
				p = quantidade * 9.98;
				break;

			case "P4":
				p = quantidade * 4.49;
				break;

			case "P5":
				p = quantidade * 6.87;

			default:
				System.out.println("\n\t***Insira um codigo VALIDO!!!***\n");
				continue;
			}
			System.out.println("\n--> Preco Final: R$"+p+"\n");
		}
	}
}
