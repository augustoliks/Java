package poo_lista07;

import java.util.List;

public class GerLevantamento {

	public static int descobreIndex(List<Levantamento> levantamentos, String data) {

		for (int k = 0; k < levantamentos.size(); k++) {
			if (levantamentos.get(k).getData().equals(data)) {
				return k;
			}
		}
		return -1;

	}

	public static void atualizaLancamento(List<Levantamento> levantamentos, String data) {

		int index = descobreIndex(levantamentos, data);

		int saida = 0;
		do {
			System.out.print("Digite 1: Corrigir o valor de entrada\n" + "Digite 2: Corrigir o valor de saida"
					+ "Digite 3: Confirmar e Sair\n");

			switch (Inputs.pegaOpcao()) {
			case "1": {
				System.out
						.println("Digite um novo valor de ENTRADA para a data: " + levantamentos.get(index).getData());
				levantamentos.get(index).setEntrada(Inputs.pegaEntrada());
				System.out.println("Valor de entrada modificada com sucesso!!!");
				break;
			}
			case "2": {
				System.out.println("Digite um novo valor de SAIDA para a data: " + levantamentos.get(index).getData());
				levantamentos.get(index).setEntrada(Inputs.pegaSaida());
				System.out.println("Valor de saida modificada com sucesso!!!");
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
	}

}
