package br.edu.fatec;

import java.util.Scanner;

public class Exercicio03 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		String horaMinuto[] = new String[2];
		String intervalo;
		double minuto;
		double preco;

		scan = new Scanner(System.in);
		
		while (true) {

			preco = 2;

			System.out.print("Digite um Intervalo de Tempo: ");
			intervalo = scan.nextLine();
			
			horaMinuto = intervalo.split(":");
			
			minuto = (Double.valueOf(horaMinuto[0])*60 + Double.valueOf(horaMinuto[1]));
			
			if (minuto>180.0) {
				preco+=(0.5/60.0)*(minuto-180.0);
			}

			System.out.println("Total a pagar: "+preco);
		}

	}
	
}