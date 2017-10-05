package ex01_vector;

import java.util.Scanner;
import java.util.Vector;

public class AgendaTelefonica {

	private Scanner scanner = new Scanner(System.in);

	Vector<Pessoa> pessoa = new Vector<>();

	public void cadastrarPessoa() {

		System.out.print("\nInsira um nome para a pessoa: ");
		String nome = scanner.next();
		boolean flag = false;

		for (int k = 0; k < pessoa.size(); k++) {

			if (pessoa.get(k).getNome().equals(nome)) {
				flag = true;
				String op;
				int saida = 0;

				System.out.println("Nome de Contato Já existente!!!\n");

				do {

					System.out.print("Digite 1: Corrigir o nome do contato\n"
							+ "Digite 2: Atualizar numero de telefone do contato\n"
							+ "Digite 3: Atualizar e-mail do contato\n" + "Digite 4: Confirmar e Sair\n"
							+ "Digite a operacao desejada: ");
					op = scanner.next();

					switch (op) {
					case "1": {
						System.out.print("Digite um novo Nome para " + pessoa.get(k).getNome() + ": ");
						String newNome = scanner.next();

						pessoa.get(k).setNome(newNome);
						System.out.println("Contato modificado com sucesso!!!");
						break;
					}
					case "2": {
						System.out.print("Digite um novo Telefone para " + pessoa.get(k).getNome() + ": ");
						String newNum = scanner.next();

						pessoa.get(k).setTelefone(newNum);
						System.out.println("Contato modificado com sucesso!!!");
						break;
					}
					case "3": {
						System.out.print("Digite o novo email para " + pessoa.get(k).getNome() + ": ");
						String newEmail = scanner.next();

						pessoa.get(k).setTelefone(newEmail);
						System.out.println("Contato modificado com sucesso!!!");
						break;
					}
					case "4": {
						saida = 1;
						break;
					}
					default: {
						System.out.println("Insira um valor valido!!!");
						break;

					}
					}
				} while (saida != 1);

			}
		}

		if (flag == false) {

			System.out.print("Insira um telefone para a pessoa: ");
			String telefone = scanner.next();

			System.out.print("Insira um Email para pessoa: ");
			String email = scanner.next();

			Pessoa nova = new Pessoa(nome, telefone, email);
			pessoa.add(nova);
			System.out.println("\nNovo Contato Adicionado\n");

		}
	}

	public void excluirContatos() {

		if ( imprimirPessoas() ) {

			System.out.print("\nlnsira um nome da pessoa a ser excluida: ");
			String nome = scanner.next();

			for (int k = 0; k < pessoa.size(); k++) {

				if (pessoa.get(k).getNome().equals(nome)) {
					pessoa.remove(k);
					System.out.println("Contato Excluido com sucesso!!");
				}
			}

		}
	}

	public boolean imprimirPessoas() {
		int k;
		for (k = 0; k < pessoa.size(); k++) {
			System.out.println("\nNome: " + pessoa.get(k).getNome() + "\nTelefone: " + pessoa.get(k).getTelefone()
					+ "\nEmail: " + pessoa.get(k).getEmail());
		}
		if (k == 0) {
			System.out.println("Voce nao possui contatos em sua agenda!!!");
			return false;
		} 
		else {
			return true;
		}
	}

	public void imprimirOpcoes() {
		System.out.println("\nEscolha uma das Opcoes:\n");
		System.out.println("1 - Listar Contatos:");
		System.out.println("2 - Incluir contatos:");
		System.out.println("3 - Excluir Contatos:");
		System.out.println("4 - Sair: \n");
		System.out.print("Digite a opcao desejada: ");
	}
}