package br.edu.fatec;

public class Exercicio05 {

	public static void main(String[] args) {

		int vetor[] = new int[1000];
		int j, k, ak;

		for (k = 2; k < vetor.length; k++) {
			vetor[k] = k;

			j = k;
			ak = 0;

			for (j = 1; j < k; j++) {
				if (k % j == 0) {
					ak++;
				}

			}
			if (ak <= 2) {
				System.out.println(k);
			}

		}

	}

}