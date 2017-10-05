package exercicio05;

import java.util.Scanner;

public class Principal {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		Exercicio05 ex5 = new Exercicio05();
		
		System.out.print("Digite o limite de Credito: R$ ");
		ex5.setLimiteCredito( scan.nextFloat() );
		
		System.out.print("Digite numero da Conta: ");
		ex5.setNumeroConta( scan.next() );
		
		System.out.print("Digite o saldo no inicio do mes: R$ ");
		ex5.setSaldoInicioMes( scan.nextFloat() );
		
		System.out.print("Digite o Total de credito: ");
		ex5.setTotalCredito( scan.nextFloat() );
		
		System.out.print("Digite o total de itens cobrado no mes: ");
		ex5.setTotalIntensCobradoMes( scan.nextFloat() );
		
		ex5.calculaSaldo();
	
	}

}