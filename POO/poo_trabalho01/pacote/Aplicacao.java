package pacote;

import java.io.IOException;

public class Aplicacao {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		int saida = 0;
		GerAplicacao gerAplicacao = new GerAplicacao();

		do {

			new Outputs().imprimiOpcoes();

			switch (new Inputs().pegaOpcao()) {
				case "1": {
					gerAplicacao.cadastrarProduto();
					break;
				}
	
				case "2": {
					gerAplicacao.adicionarQuantidade();
					break;
				}
	
				case "3": {
					gerAplicacao.reduzirQuantidade();
					break;
				}
	
				case "4": {
					gerAplicacao.atualizarProduto();
					break;
				}
	
				case "5": {
					gerAplicacao.removerProduto();
					break;
				}
	
				case "6": {
					gerAplicacao.dadosProdutos();
					break;
				}
	
				case "7": {
					gerAplicacao.rankingProdutos();
					break;
				}
	
				
				case "8": {
					gerAplicacao.lerDisco();
					break;
				}
	
				case "9": {
					gerAplicacao.salvarEmDisco();
					break;
				}
	
				case "10": {
					saida = 1;
					break;
				}
	
				default: {
					System.out.println("Opcao invalida!!!");
					new Outputs().imprimiOpcoes();
					break;
				}
			}
		} while (saida != 1);
	}

}
