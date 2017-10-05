package exercicio01;

import java.util.List;


public class Outputs extends Agenda {

	public static void listarTodos(List<Pessoa> pessoas) {

		System.out.println("Lista de Contatos de alunos");

		for (Pessoa i : pessoas) {
			if (i instanceof Aluno) {
				System.out.println("\t" + ((Aluno) i).dadosFormatados());
			}
		}

		System.out.println("Lista de contatos de Professores: ");
		for (Pessoa i : pessoas) {
			if (i instanceof Professor) {
				System.out.println("\t" + ((Professor) i).dadosFormatados());
			}
		}
	}

	public static void listarNumeroRegistro(List<Pessoa> pessoas) {

		System.out.println("ALUNOS - RA: ");
		for (Pessoa i : pessoas) {
			if (i instanceof Aluno) {
				System.out.println("\t" + ((Aluno) i).getNome() + " - " + ((Aluno) i).getNumeroMatricula());
			}
		}

		System.out.println("PROFESSOR- REGISTRO: ");
		for (Pessoa i : pessoas) {
			if (i instanceof Professor) {
				System.out.println("\t" + ((Professor) i).getNome() + " - " + ((Professor) i).getNumeroRegistro());
			}
		}

	}

	public static void listaHoraAula(List<Pessoa> pessoas) {

		System.out.println("PROFESSORES: ");
		for (Pessoa i : pessoas) {
			if (i instanceof Professor) {
				System.out.println("\t" + ((Professor) i).getNome() + " - " + ((Professor) i).getQuantidadeHoraAula());
			}
		}

	}

	public static void imprimiOpcoes() {
		System.out.println("\nEscolha uma das Opcoes:\n");
		System.out.println("1 - Adiconar Alunos: ");
		System.out.println("2 - Adiconar Professor: ");
		System.out.println("3 - Editar Cadastro: ");
		System.out.println("4 - Excluir Cadastro: ");
		System.out.println("5 - Listar Registros ");
		System.out.println("6 - Ver Hora/Aula dos Professore:: ");
		System.out.println("7 - Listar Todos cadastros do sistema");
		System.out.println("8 - Carregar em Disco");
		System.out.println("9 - Salvar em Disco");
		System.out.println("10 - Sair: \n");
		System.out.print("Digite a opcao desejada: ");
	}
}