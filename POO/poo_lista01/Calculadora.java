package br.edu.fatec;
//
import java.util.Scanner;

public class Calculadora {

	private static Scanner leitor;

	public static void main(String[] args) {

		leitor = new Scanner(System.in);
	
		boolean executar = true;
		int opcao;
		double n1, n2;

		System.out.println("Calculadora para Operacoes aritmeticas simples, \npara fazer as operacoes com apenas dois numeros");

		do {
			System.out.print("\nDigite a op��o que voc� deseja: "
									+"\n\t1-SOMA"
									+"\n\t2-SUBTRACAO"
									+"\n\t3-MULTIPLICACAO"
									+"\n\t4-DIVISAO"
									+"\n\t5-SAIR"
									+"\n\nDigite a op��o: " );
				
			opcao = leitor.nextInt();

			System.out.print("\tDigite N1: ");
			n1 = leitor.nextDouble();
			
			System.out.print("\tDigite N2: ");
			n2 = leitor.nextDouble();


			System.out.print("\tResposta: ");

			switch (opcao) {
			case 1:
				System.out.printf("%.2f + %.2f = %.2f\n", n1, n2, n1 + n2);
				break;

			case 2:
				System.out.printf("%.2f - %.2f = %.2f\n", n1, n2, n1 - n2);
				break;

			case 3:
				System.out.printf("%.2f * %.2f = %.2f\n", n1, n2, n1 * n2);
				break;

			case 4:
				System.out.printf("%.2f / %.2f = %.2f\n", n1, n2, (n1 / n2));
				break;

			case 5:
				System.out.printf("Ate mais 0/");
				executar = false;
				break;

			default:
				System.out.println("\nOp��o N�O V�LIDA!!!, por favor insira um numero de 1 a 5\n");
				break;
			}

		} while (executar);
	}

}