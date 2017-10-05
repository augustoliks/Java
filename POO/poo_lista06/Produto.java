package exercicio01;

import java.io.Serializable;

public class Produto implements Informador, Comparable<Produto>, Serializable{

	private String nome;
	private int quantidade=0;

	public Produto(String nome, int quantidade) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
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

	@Override
	public String informacao() {
		return "Nome: "+this.nome+"\tQuantidade: "+this.quantidade ;
		
	}
	
	public int compareTo(Produto o) {
		//	Integer n = n.compareTo(o.getTel());
		return nome.compareTo(o.getNome());
	}
	
}