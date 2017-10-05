package pacote;

import java.io.Serializable;

public class Produto implements Comparable<Produto>, Serializable {

	private static final long serialVersionUID = 1L;
	private String descricao;
	private String nome;
	private int quantidade = 0;
	private int qtdVenda = 0;

	public Produto(String nome, String descricao, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;

	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdVenda() {
		return qtdVenda;
	}

	public void setQtdVenda(int qtdVenda) {
		this.qtdVenda = qtdVenda;
	}

	public int compareTo(Produto p) {

		if (this.qtdVenda > p.quantidade) {
			return -1;
		}

		else if (this.qtdVenda < p.quantidade) {
			return 1;
		}

		else {
			return 0;
		}

	}

}