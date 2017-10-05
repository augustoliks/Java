package poo_lista07;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class BDLogin {

	private List<Funcionario> funcionarios = new ArrayList<>();

	public String validaFuncionario(String id, String pass) throws IOException, ClassNotFoundException {

		System.out.println(id + "\n" + pass);

		try {
			funcionarios = Serializacao.ler("BDLogin");
		} catch (Exception notFound) {};

		if (id.equals("root") && pass.equals("root")) {

			int saida = 0;

			do {
				System.out.print("VOCÊ É UM ADMINISTRADOR\nDigite 1: Adicionar Funcionario\n"
						+ "Digite 2: Remover  Funcionario\n" + "Digite 3: Confirmar e Sair\n");

				switch (Inputs.pegaOpcao()) {
				case "1": {
					funcionarios.add(new Funcionario(Inputs.pegaNome(), Inputs.pegaSenha()));
					System.out.println("Funcionario CADASTRADO com sucesso!!!");
					break;
				}
				case "2": {
					funcionarios.remove(GerFuncionario.descobreIndex(funcionarios, Inputs.pegaNome()));
					System.out.println("Funcionario REMOVIDO com sucesso!!!");
					break;
				}
				case "3": {
					saida = 1;
					break;
				}

				default: {
					System.out.println("Insira um valor valido!!!");
					break;
				}
				}
			} while (saida != 1);

			Serializacao.salvar(funcionarios, "BDLogin");

			return "adm";
		}

		for (int k = 0; k < funcionarios.size(); k++) {
			System.out.println("\nuser:" + funcionarios.get(k).getId() + "\nSenha: " + funcionarios.get(k).getPass());
			if (funcionarios.get(k).getId().equals(id) && funcionarios.get(k).getPass().equals(pass)) {
				return "user";
			}

		}
		return "error";
	}
}