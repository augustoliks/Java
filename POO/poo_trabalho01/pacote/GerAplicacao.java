package pacote;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerAplicacao extends GerProdutos{

	List<Produto> produtos = new ArrayList<>();

	public void cadastrarProduto() {

		String nome = pegaNome();

		if (descobreIndex(produtos, nome) >= 0) {
			System.out.println("Produtos ja existente");
			atualizaProduto(produtos, nome);
		}

		else {
			produtos.add(new Produto(nome, pegaDescricao(), pegaQuantidade()));
			System.out.println("Produto Adicionado com Sucesso");
		}

	}

	public void atualizarProduto() {

		String nome = pegaNome();

		if (descobreIndex(produtos, nome) >= 0) {
			atualizaProduto(produtos, nome);
		}

		else {
			System.out.println("Produto Nao existente");
		}

	}

	public void removerProduto() {

		String nome = pegaNome();

		if (descobreIndex(produtos, nome) >= 0) {
			produtos.remove(descobreIndex(produtos, nome));
		}

		else {
			System.out.println("Produto Inexistente");
		}

	}

	public void adicionarQuantidade() {

		String nome = pegaNome();

		if (descobreIndex(produtos, nome) >= 0) {
			int aux = produtos.get(descobreIndex(produtos, nome)).getQuantidade();
			produtos.get(descobreIndex(produtos, nome)).setQuantidade(aux + pegaQuantidade());
		} else {
			System.out.println("Produto Inexistente");
		}

	}

	public void reduzirQuantidade() {

		String nome = pegaNome();

		if (descobreIndex(produtos, nome) >= 0) {
			int auxQtdEstoque = produtos.get(descobreIndex(produtos, nome)).getQuantidade();
			int auxQtdVenda = produtos.get(descobreIndex(produtos, nome)).getQtdVenda();
			int aux = pegaQuantidade();

			if (aux > auxQtdEstoque) {
				System.out.println("Nao e possivel vender mais do que tem no estoque!!!");
			} 
			else {
				produtos.get(descobreIndex(produtos, nome)).setQuantidade(auxQtdEstoque - aux);
				produtos.get(descobreIndex(produtos, nome)).setQtdVenda(auxQtdVenda + aux);
			}
		} 
		else {
			System.out.println("Produto Inexistente");
		}

	}

	public void dadosProdutos() {
		Collections.sort(produtos);
		for (int k = 0; k < produtos.size(); k++) {
			System.out.println(new Outputs().imprimiDados(produtos, k));
		}
	}

	public void rankingProdutos() {
		Collections.sort(produtos);
		System.out.println("Posicao - Quantidade de Itens Vendidos");
		for (int k = 0; k < produtos.size(); k++) {
			System.out.println(k + 1 + " " + new Outputs().ImprimiRanking(produtos, k));
		}
	}

	public void salvarEmDisco() throws IOException {
		Serializacao.salvar(this.produtos, pegaCaminho());
	}

	public void lerDisco() throws IOException, ClassNotFoundException {
		produtos = Serializacao.ler(pegaCaminho());
	}

}