package exercicios;

import java.util.Scanner;

public class exercicio07 {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner (System.in);
		
		int horasTrabalhadas;
		double valorHora, salarioReajuste=0;
		
		System.out.print("Horas Trabalhadas: ");
		horasTrabalhadas = scanner.nextInt();
		
		System.out.print("Valor da hora normal: R$ ");
		valorHora = scanner.nextDouble();
				
		if(horasTrabalhadas>40){
			salarioReajuste = ( ( (horasTrabalhadas-40) * valorHora) *50) /100;
		}
		
		System.out.printf("Salario final (incluso com o reajuste): R$ %.2f ", (horasTrabalhadas*valorHora) +salarioReajuste );

	}
}