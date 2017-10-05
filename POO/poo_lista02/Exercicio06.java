package exercicios;

import java.util.Scanner;

public class Exercicio06 {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner (System.in);
		
		double rendimento;
		double itensVendidos;

		System.out.print("Vendas brutas durante a semana: R$ ");
		itensVendidos = scanner.nextDouble();
		
		rendimento = ( (itensVendidos*9)/100 )+200 ;
		
		System.out.printf("Rendimentos do vendedor: R$ %.2f", rendimento);
		
	}
}
