package ex06;

public class Output {

	public String descobreMes(int mes) {

		switch (mes) {
		case 1:
			return "Janeiro";

		case 2:
			return "Fevereiro";

		case 3:
			return "Marco";

		case 4:
			return "Abril";

		case 5:
			return "Junho";

		case 6:
			return "Julho";

		case 7:
			return "Janeiro";

		case 8:
			return "Agosto";

		case 9:
			return "Setembro";

		case 10:
			return "Outubro";

		case 11:
			return "Novembro";

		case 12:
			return "Dezembro";

		}
		return null;
	}

	public void imprimirOpcoes() {
		System.out.println("\nEscolha uma das Opcoes:\n");
		System.out.println("1 - Listar Contatos:");
		System.out.println("2 - Incluir contatos:");
		System.out.println("3 - Excluir Contatos:");
		System.out.println("4 - Inserir gastos anual");
		System.out.println("5 - Corrigir ou inserir gasto referente a um mes");
		System.out.println("6 - Consultar gastos referente ao um mes: ");
		System.out.println("7 - Consultar gastos referente ao ano inteiro: ");
		System.out.println("8 - Consultar maior gasto anual");
		System.out.println("9 - Sair: \n");
		System.out.print("Digite a opcao desejada: ");
	}
}
