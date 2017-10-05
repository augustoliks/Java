package ex01_vector;

import java.util.Scanner;

public class Aplicacao {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		AgendaTelefonica agenda = new AgendaTelefonica();

		String opcao;
		int saida = 0;
		
		do {
			agenda.imprimirOpcoes();
			opcao = scanner.next();
			
			switch (opcao) {	
				case "1": {
					agenda.imprimirPessoas();
					break;
				}
	
				case "2": {
					agenda.cadastrarPessoa();
					break;
				}
	
				case "3": {
					agenda.excluirContatos();
					break;
				}
	
				case "4": {
					saida=1;
					System.out.println("\nAte mais!\n");
					break;
				}
	
				default: {
					System.out.println("Opcao invalida!!!");
					break;
				}
			}	
		}while(saida!=1);		
	}
}
