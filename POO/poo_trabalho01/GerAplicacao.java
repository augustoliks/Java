package pacote;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerAplicacao {

	List<Produto> produtos = new ArrayList<>();

	public void cadastrarProduto() {

		String nome = Inputs.pegaNome();

		if (GerProdutos.descobreIndex(produtos, nome) >= 0) {
			System.out.println("Produtos ja existente");
			GerProdutos.atualizaProduto(produtos, nome);
		}

		else {
			produtos.add(new Produto(nome, Inputs.pegaDescricao(), Inputs.pegaQuantidade()));
			System.out.println("Produto Adicionado com Sucesso");
		}

	}

	public void atualizarProduto() {

		String nome = Inputs.pegaNome();

		if (GerProdutos.descobreIndex(produtos, nome) >= 0) {
			GerProdutos.atualizaProduto(produtos, nome);
		}

		else {
			System.out.println("Produto Nao existente");
		}

	}

	public void removerProduto() {

		String nome = Inputs.pegaNome();

		if (GerProdutos.descobreIndex(produtos, nome) >= 0) {
			produtos.remove(GerProdutos.descobreIndex(produtos, nome));
		}

		else {
			System.out.println("Produto Inexistente");
		}

	}

	public void adicionarQuantidade() {

		String nome = Inputs.pegaNome();

		if (GerProdutos.descobreIndex(produtos, nome) >= 0) {
			int aux = produtos.get(GerProdutos.descobreIndex(produtos, nome)).getQuantidade();
			produtos.get(GerProdutos.descobreIndex(produtos, nome)).setQuantidade(aux + Inputs.pegaQuantidade());
		} else {
			System.out.println("Produto Inexistente");
		}

	}

	public void reduzirQuantidade() {

		String nome = Inputs.pegaNome();

		if (GerProdutos.descobreIndex(produtos, nome) >= 0) {
			int auxQtdEstoque = produtos.get(GerProdutos.descobreIndex(produtos, nome)).getQuantidade();
			int auxQtdVenda = produtos.get(GerProdutos.descobreIndex(produtos, nome)).getQtdVenda();
			int aux = Inputs.pegaQuantidade();

			if (aux > auxQtdEstoque) {
				System.out.println("Nao é possivel vender mais do que tem no estoque!!!");
			} 
			else {
				produtos.get(GerProdutos.descobreIndex(produtos, nome)).setQuantidade(auxQtdEstoque - aux);
				produtos.get(GerProdutos.descobreIndex(produtos, nome)).setQtdVenda(auxQtdVenda + aux);
			}
		} 
		else {
			System.out.println("Produto Inexistente");
		}

	}

	public void dadosProdutos() {
		Collections.sort(produtos);
		for (int k = 0; k < produtos.size(); k++) {
			System.out.println(Outputs.imprimiDados(produtos, k));
		}
	}

	public void rankingProdutos() {
		Collections.sort(produtos);
		System.out.println("Posicao - Quantidade de Itens Vendidos");
		for (int k = 0; k < produtos.size(); k++) {
			System.out.println(k + 1 + " " + Outputs.ImprimiRanking(produtos, k));
		}
	}

	public void salvarEmDisco() throws IOException {
		Serializacao.salvar(this.produtos, Inputs.pegaCaminho());
	}

	public void lerDisco() throws IOException, ClassNotFoundException {
		produtos = Serializacao.ler(Inputs.pegaCaminho());
	}

}