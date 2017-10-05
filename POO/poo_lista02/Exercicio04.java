package exercicios;

import java.util.Scanner;

public class Exercicio04 {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		
		System.out.print("Numero A: ");
		int numA = scanner.nextInt();
		
		System.out.print("Numero B: ");
		int numB = scanner.nextInt();

		if(numA%numB == 0){
			System.out.println("O Numero "+numA+" É multiplo de "+numB);
		}
		else{
			System.out.println("O Numero "+numA+" NÃO multiplo de "+numB);
		}
	}

}