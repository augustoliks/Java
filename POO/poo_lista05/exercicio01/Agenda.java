package exercicio01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<Pessoa> pessoas = new ArrayList<>();

	public void cadastrarAluno() {
		String nome = new Inputs().pegaNome();
		if (GerPessoas.descobreIndex(pessoas, nome) >= 0) {
			System.out.println("Cadastro ja existent!!!e\n");
			GerPessoas.atualizarCadastro(pessoas, nome);
			return;
		}
		Pessoa p = new Aluno(nome, new Inputs().pegaTelefone(), new Inputs().pegaEmail(), new Inputs().pegaRegistro());
		pessoas.add(p);

	}

	public void cadastrarProfessor() {
		String nome = new Inputs().pegaNome();
		if (GerPessoas.descobreIndex(pessoas, nome) >= 0) {
			System.out.println("Cadastro j� existent!!!e\n");
			GerPessoas.atualizarCadastro(pessoas, nome);
			return;
		}
		Pessoa p = new Professor(new Inputs().pegaNome(), new Inputs().pegaTelefone(), new Inputs().pegaEmail(), new Inputs().pegaRegistro(),
				new Inputs().pegaQuantidadeHoraAula());
		pessoas.add(p);

	}

	public void excluir() {
		String nome = new Inputs().pegaNome();
		if (GerPessoas.descobreIndex(pessoas, nome) == -1) {
			System.out.println("Cadastros nao existente");
			return;
		} else {
			pessoas.remove(GerPessoas.descobreIndex(pessoas, nome));
		}
	}

	public void editar() {

		String nome = new Inputs().pegaNome();

		if (GerPessoas.descobreIndex(pessoas, nome) == -1) {
			System.out.println("Aluno nao existente");
			return;
		}

		GerPessoas.atualizarCadastro(pessoas, nome);

	}

	public void lerRegistos() {
		new Outputs().listarNumeroRegistro(pessoas);
	}

	public void lerTodoscadastros() {
		new Outputs().listarTodos(pessoas);
	}

	public void lerHoraAula() {
		new Outputs().listaHoraAula(pessoas);
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public void salvarEmDisco() throws IOException {
		Serializacao.salvar(this.pessoas, new Inputs().pegaCaminho());
	}

	public void lerDisco() throws IOException, ClassNotFoundException {
		pessoas = Serializacao.ler(new Inputs().pegaCaminho());
	}

}