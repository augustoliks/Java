package exercicios;

import java.util.Scanner;

public class Exercicio03 {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		int aux;
		int[] vetor = new int[5];

		for (int k = 0; k < vetor.length; k++) {
			System.out.print("Digite um numero Inteiro na Posicao [" + k + "]: ");
			vetor[k] = scanner.nextInt();
		}

		for (int k = 0; k < vetor.length; k++) {
			for (int j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}

		System.out.println("Menor: " + vetor[0]);
		System.out.println("Maior: " + vetor[vetor.length-1]);
	}
}
