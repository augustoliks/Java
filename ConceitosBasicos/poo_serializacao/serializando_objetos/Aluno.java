package serializando_objetos;

public class Aluno extends Pessoa{

	private int notas;
	
	public int getNotas() {
		return notas;
	}

	public void setNotas(int notas) {
		this.notas = notas;
	}

	
	public Aluno(String nome, int idade, int notas) {
		super(nome, idade);
		this.notas = notas;
	}
	
}