package poo_lista07;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Engine extends GerLevantamento{

	BDLogin bd = new BDLogin();
	
	List<Levantamento> levantamentos = new ArrayList<>();

	public String login(String id, String pass) throws IOException, ClassNotFoundException {
		return bd.validaFuncionario(id, pass);

	}
	
	public void levantamentos() {

		String data = new Inputs().pegaData();
		if (descobreIndex(levantamentos, data) >= 0) {
			System.out.println("Ja existe um levantamento nesta data");
			atualizaLancamento(levantamentos, data);
		} else {
			levantamentos.add(new Levantamento(data, new Inputs().pegaEntrada(), new Inputs().pegaSaida()));
			System.out.println("Levantamento feito com sucesso");
		}
	}

	public void balancos() {
		
		for (int k = 0; k < levantamentos.size(); k++) {
			double ak = 0;
			ak += levantamentos.get(k).getEntrada();
			ak -= levantamentos.get(k).getSaida();
			System.out.println("Data: " + levantamentos.get(k).getData());
			System.out.println("Entrada: R$ " + levantamentos.get(k).getEntrada());
			System.out.println("Saida: R$ " + levantamentos.get(k).getSaida() + "\n");
			System.out.println("BALAN�O FINAL: R$" + ak + "\n");
		}
	}

	public void balancoFinal() {
		double ak = 0;

		for (int k = 0; k < levantamentos.size(); k++) {
			ak += levantamentos.get(k).getEntrada();
			ak -= levantamentos.get(k).getSaida();
		}

		System.out.println("BALAN�O FINAL: R$" + ak);

	}

	public void salvarEmDisco() throws IOException {
		Serializacao.salvar(this.levantamentos, "Levantamento");
	}

	public void lerDisco() throws IOException, ClassNotFoundException {
		
		try {
		levantamentos = Serializacao.ler("Levantamento");
		}
		catch (Exception notFound) {
			System.out.println("Dados Nao enccontrados");
		}
	}

}