package br.com.fatec.engine;

import java.util.ArrayList;
import java.util.List;

import br.com.fatec.modelo.Aluno;
import br.com.fatec.modelo.GerPessoas;
import br.com.fatec.modelo.Inputs;
import br.com.fatec.modelo.Outputs;
import br.com.fatec.modelo.Pessoa;
import br.com.fatec.modelo.Professor;

public class Agenda {

	private List<Pessoa> pessoas = new ArrayList<>();

	public void cadastrarAluno() {
		String nome = Inputs.pegaNome();
		if (GerPessoas.descobreIndex(pessoas, nome) >= 0) {
			System.out.println("Cadastro já existent!!!e\n");
			GerPessoas.atualizarCadastro(pessoas, nome);
			return;
		}
		Pessoa p = new Aluno(nome, Inputs.pegaTelefone(), Inputs.pegaEmail(), Inputs.pegaRegistro());
		pessoas.add(p);

	}

	public void cadastrarProfessor() {
		String nome = Inputs.pegaNome();
		if (GerPessoas.descobreIndex(pessoas, nome) >= 0) {
			System.out.println("Cadastro já existent!!!e\n");
			GerPessoas.atualizarCadastro(pessoas, nome);
			return;
		}
		Pessoa p = new Professor(Inputs.pegaNome(), Inputs.pegaTelefone(), Inputs.pegaEmail(), Inputs.pegaRegistro(),
				Inputs.pegaQuantidadeHoraAula());
		pessoas.add(p);

	}

	public void excluir() {
		String nome = Inputs.pegaNome();
		if (GerPessoas.descobreIndex(pessoas, nome) == -1) {
			System.out.println("Cadastros nao existente");
			return;
		} else {
			pessoas.remove(GerPessoas.descobreIndex(pessoas, nome));
		}
	}

	public void editar() {

		String nome = Inputs.pegaNome();

		if (GerPessoas.descobreIndex(pessoas, nome) == -1) {
			System.out.println("Aluno nao existente");
			return;
		}

		GerPessoas.atualizarCadastro(pessoas, nome);

	}

	public void lerRegistos() {
		Outputs.listarNumeroRegistro(pessoas);
	}

	public void lerTodoscadastros() {
		Outputs.listarTodos(pessoas);
	}

	public void lerHoraAula() {
		Outputs.listaHoraAula(pessoas);
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}
}