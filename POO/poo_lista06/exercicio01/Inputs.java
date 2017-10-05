package exercicio01;

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

	public int pegaQuantidade() {
		System.out.println("Insira o a quantidade: ");
		return scanner.nextInt();
	}
	
	public String pegaCaminho(){
		System.out.println("Digite o caminho: ");
		return scanner.next();
	}

	
}