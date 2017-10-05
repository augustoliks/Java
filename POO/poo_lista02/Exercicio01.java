package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero Inteiro A: ");
		double numeroA = scanner.nextInt();
		
		System.out.print("Digite um numero Inteiro B: ");
		double numeroB = scanner.nextInt();
		
		System.out.println("Operacoes matematicas basicas entre o Valor A="+numeroA+" Valor B="+numeroB);
		System.out.println("\n\tSoma: "+(numeroA+numeroB)+"\n\tSubtracao: "+(numeroA-numeroB)+"\n\tDivisao: "+(numeroA/numeroB)+"\n\tMultiplicacao: "+(numeroA*numeroB) );

	}

}
