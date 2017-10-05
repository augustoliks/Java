package ex06;

public class Pessoa {

	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	private double dinheiro[] = new double[13];
	
	public Pessoa(String nome, String telefone, String email, String endereco) {

		this.email = email;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public double[] getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double[] dinheiro) {
		this.dinheiro = dinheiro;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}