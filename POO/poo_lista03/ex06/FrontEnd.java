package ex06;

public class FrontEnd {

	public static void main(String[] args) {

		BackEnd agenda = new BackEnd();

		String opcao;
		int saida = 0;

		do {
			new Output().imprimirOpcoes();
			opcao = new Input().pegaOpcao();

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
				agenda.inserirGastoAnual();
				break;
			}

			case "5": {
				agenda.insereGastoMensal();
				break;
			}

			case "6": {
				agenda.verificaGastoMensal();
				break;
			}

			case "7": {
				agenda.verificaGastoAnual();
				break;
			}

			case "8": {
				agenda.verificaOMaiorGastoAnual();
				break;
			}


			case "9": {
				saida = 1;
				System.out.println("\nAte mais!\n");
				break;
			}

			default: {
				System.out.println("Opcao invalida!!!");
				break;
			}
			}
		} while (saida != 1);
	}
}