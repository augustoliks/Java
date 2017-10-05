package poo_lista07;

import java.util.List;

public class GerFuncionario {

	public static int descobreIndex(List<Funcionario> funcionarios, String data) {

		for (int k = 0; k < funcionarios.size(); k++) {
			if (funcionarios.get(k).getId().equals(data)) {
				return k;
			}
		}
		return -1;
	}

	
}
