package exercicios;

import java.util.Scanner;

public class Exercicio02 {

	private static Scanner scanner;

	public static void main(String[] args) {

		double aux=0;
		
		scanner = new Scanner(System.in);
		double[] vetor = new double[5];

		System.out.print("Digite um numero Inteiro A: ");
		double numeroA = scanner.nextDouble();

		System.out.print("Digite um numero Inteiro B: ");
		double numeroB = scanner.nextDouble();

		vetor[0] = numeroA + numeroB;
		vetor[1] = numeroA - numeroB;
		vetor[2] = numeroA / numeroB;
		vetor[3] = numeroA * numeroB;
		vetor[4] = (numeroA + numeroB) / 2;

		for (int k = 0; k < vetor.length - 1; k++) {
			for (int j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] > vetor[j+1]) { 
					aux = vetor[j];	
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}

		for (int k = 0; k < vetor.length ; k++) {
			System.out.println(vetor[k] + "\n");
		}
	}
}