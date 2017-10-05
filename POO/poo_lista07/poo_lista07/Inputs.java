package poo_lista07;

import java.util.Scanner;

public class Inputs {

	static Scanner scanner = new Scanner(System.in);

	public String pegaOpcao() {
		System.out.println("Insira uma opcao: ");
		return scanner.next();
	}

	public String pegaNome() {
		System.out.println("Insira o nome do produto: ");
		return scanner.next();
	}

	public String pegaData() {
		System.out.println("Insira a data: ");
		return scanner.next();
	}

	public String pegaCaminho() {
		System.out.println("Digite o caminho: ");
		return scanner.next();
	}

	public String pegaLogin() {
		System.out.println("Digite o nome de usuario: ");
		return scanner.next();
	}

	public String pegaSenha() {
		System.out.println("Digite a senha: ");
		return scanner.next();
	}

	public Double pegaEntrada() {
		System.out.println("Digite o Levantamento de entrada: ");
		return scanner.nextDouble();
	}

	public Double pegaSaida() {
		System.out.println("Digite o levantamento de saida: ");
		return scanner.nextDouble();
	}

}