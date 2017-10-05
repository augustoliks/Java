package br.com.fatec.engine;

import java.util.ArrayList;
import java.util.List;

import br.com.fatec.modelo.Aluno;
import br.com.fatec.modelo.GerPessoas;
import br.com.fatec.modelo.Outputs;
import br.com.fatec.modelo.Pessoa;
import br.com.fatec.modelo.Professor;

public class Agenda extends GerPessoas {

	private List<Pessoa> pessoas = new ArrayList<>();

	public void cadastrarAluno() {
		String nome = pegaNome();
		if (descobreIndex(pessoas, nome) >= 0) {
			System.out.println("Cadastro ja existent!!!\n");
			atualizarCadastro(pessoas, nome);
			return;
		}
		Pessoa p = new Aluno(nome, pegaTelefone(), pegaEmail(), pegaRegistro());
		pessoas.add(p);

	}

	public void cadastrarProfessor() {
		String nome = pegaNome();
		if (descobreIndex(pessoas, nome) >= 0) {
			System.out.println("Cadastro ja existent!!!e\n");
			atualizarCadastro(pessoas, nome);
			return;
		}
		Pessoa p = new Professor(pegaNome(), pegaTelefone(), pegaEmail(), pegaRegistro(), pegaQuantidadeHoraAula());
		pessoas.add(p);

	}

	public void excluir() {
		String nome = pegaNome();
		if (descobreIndex(pessoas, nome) == -1) {
			System.out.println("Cadastros nao existente");
			return;
		} else {
			pessoas.remove(descobreIndex(pessoas, nome));
		}
	}

	public void editar() {

		String nome = pegaNome();

		if (descobreIndex(pessoas, nome) == -1) {
			System.out.println("Aluno nao existente");
			return;
		}

		atualizarCadastro(pessoas, nome);

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
}