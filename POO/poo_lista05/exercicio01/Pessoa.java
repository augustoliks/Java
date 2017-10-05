package exercicio01;

import java.io.Serializable;

public abstract class Pessoa implements Contato, Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String telefone;
	private String email;
	
	@Override
	public String dadosFormatados() {
		String dadosFormatados;
		dadosFormatados = "\nNome: "+this.getNome();
		dadosFormatados = dadosFormatados+"\nTelefone: "+this.getTelefone();
		dadosFormatados = dadosFormatados+"\nEmail: "+this.getEmail();
		return dadosFormatados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Pessoa(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}	
	
}