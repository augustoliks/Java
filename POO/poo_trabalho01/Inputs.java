package pacote;

import java.util.Scanner;

public class Inputs {

	static Scanner scanner = new Scanner(System.in);

	public static String pegaOpcao() {
		System.out.println("Insira uma opcao: ");
		return scanner.next();
	}

	public static String pegaNome() {
		System.out.println("Insira o nome do produto: ");
		return scanner.next();
	}

	public static String pegaCaminho() {
		System.out.println("Digite o caminho: ");
		return scanner.next();
	}

	public static String pegaDescricao() {
		System.out.println("Digite o Descricao sobre o produto: ");
		return scanner.next();
	}

	public static int pegaQuantidade() {
		System.out.println("Insira o a quantidade: ");
		return scanner.nextInt();
	}

}