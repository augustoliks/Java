package pacote;

import java.util.List;

public class Outputs {

	public void imprimiOpcoes() {
		System.out.println("\nEscolha uma das Opcoes:\n");
		System.out.println("1 - Cadastrar Produtos: ");
		System.out.println("2 - Adicionar quantidade de Produtos: ");
		System.out.println("3 - Vender Produto: ");
		System.out.println("4 - Editar Produto: ");
		System.out.println("5 - Excluir cadastro de Produto: ");
		System.out.println("6 - Controle de Estoque: ");
		System.out.println("7 - Recomendacao (ranking mais vendidos): ");
		System.out.println("8 - Carregar em Disco");
		System.out.println("9 - Salvar em Disco");
		System.out.println("10 - Sair: \n");
		System.out.print("Digite a opcao desejada: ");
	}

	public String imprimiDados(List<Produto> produtos, int index) {
		return "NOME: " + produtos.get(index).getNome() + "\t\tQUANTIDADE EM ESTOQUE: "
				+ produtos.get(index).getQuantidade() + "\nDESCRICAO: " + produtos.get(index).getDescricao()
				+ "\nTOTAL VENDIDO: " + produtos.get(index).getQtdVenda()+"\n\n";

	}

	public String ImprimiRanking(List<Produto> produtos, int index) {
		return "NOME: " + produtos.get(index).getNome() + "\t\tQUANTIDADE DE ITENS VENDIDOS: "
				+ produtos.get(index).getQtdVenda()+"\n";
	}

}