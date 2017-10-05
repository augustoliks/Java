package exercicio01;

public class Aluno extends Pessoa{
	private String numeroMatricula;
	
	@Override
	public String dadosFormatados(){
		String dadosFormatados = super.dadosFormatados();
		dadosFormatados = dadosFormatados+"\nMatricula"+this.getNumeroMatricula();
		return dadosFormatados;
	}

	@Override
	public String nomeRegistro() {
		return "Nome: "+getNome()+" / RA: "+getNumeroMatricula();
	}
	
	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public Aluno(String nome, String telefone, String email, String numeroMatricula) {
		super(nome, telefone, email);
		this.numeroMatricula = numeroMatricula;
	}

}