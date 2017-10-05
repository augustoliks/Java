package ex06;

import java.util.Scanner;

public class Input {
	
	static Scanner scanner = new Scanner(System.in);

	public String pegaNome() {
		System.out.print("\nInsira um nome para a pessoa: ");
		return scanner.next();
	}	

	public double pegaValor() {
		System.out.print("\nInsira o valor gasto: ");
		return scanner.nextFloat();
	}	

	
	public String pegaTelefone() {
		System.out.print("\nInsira o numero do Telefone da pessoa: ");
		return scanner.next();
	}
	
	public String pegaEmail() {
		System.out.print("Insira um Email para a pessoa: ");
		return scanner.next();
	}
	
	public String pegaEndereco() {
		System.out.print("Insira um Endereco para a pessoa: ");
		return scanner.next();
	}	
	
	public int pegaMes() {
		
		int mes;
		
		do {
			System.out.print("Insira um mes: ");
			mes = scanner.nextInt();
			if (mes < 1 || mes > 12) {
				System.out.println("Mes nao valido!!!, por favor digite um mes de 1 a 12");
			}
		} while (mes < 1 || mes > 12);

		return mes;
	}

	public String pegaOpcao() {
		System.out.print("\nInsira uma opcao: ");
		return scanner.next();
	}	

	
}