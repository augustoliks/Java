package ex06;

import java.util.List;

public class Engine {


	public int descobreIndex(List<Pessoa> pessoa, String nome) {
		
		for (int k=0 ; k<pessoa.size() ; k++) {
			if(pessoa.get(k).getNome().equals(nome)) {
				return k;
			}
		}
		return -1;
	}
	
	public void somatoriaGastos(double vetor[]) {
		vetor[0] = 0;
		for (int k = 1; k < 13; k++) {
			vetor[0] += vetor[k];
		}
	}		


	public void inputGastoMensal(List<Pessoa>pessoa, int mes, String nome) {

		pessoa.get(descobreIndex(pessoa, nome)).getDinheiro()[mes] = new Input().pegaValor();
		somatoriaGastos(pessoa.get(descobreIndex(pessoa, nome)).getDinheiro());		
	
	}

	public void outputGastoMensal(List<Pessoa>pessoa, String nome, int mes) {
		
		System.out.println("R$: "+pessoa.get(descobreIndex(pessoa, nome)).getDinheiro()[mes]);
	}
	
	
	
	public void inputGastoAnual(List<Pessoa>pessoa, String nome) {
		
		for (int k=1; k < 13; k++) {
			System.out.println("Mes de " + new Output().descobreMes(k) + ": R$ ");
			
			double valor = new Input().pegaValor();
			pessoa.get(descobreIndex(pessoa, nome)).getDinheiro()[k] = valor;
			pessoa.get(descobreIndex(pessoa, nome)).getDinheiro()[0] += valor;
		}
		
		somatoriaGastos(pessoa.get(descobreIndex(pessoa, nome)).getDinheiro());
		
	}
	
	public void outputGastoAnual(List<Pessoa>pessoa, String nome) {

		System.out.println("Quantidade gasto nos meses: ");
		
		for (int k = 1; k < 13; k++) {
			System.out.print("\tMes " + new Output().descobreMes(k) + ": R$ " + pessoa.get(descobreIndex(pessoa, nome)).getDinheiro()[k]+"\n");
		}
		somatoriaGastos(pessoa.get(descobreIndex(pessoa, nome)).getDinheiro());
		System.out.println("Total: R$ "+pessoa.get(descobreIndex(pessoa, nome)).getDinheiro()[0]);
	}
		
	public void atualizarContato(List<Pessoa> pessoa, String nome) {

		int index = descobreIndex(pessoa, nome);
		int saida=0;
		String op;
		
		do {

			System.out.println("Digite 1: Corrigir o nome do contato\n"
					+ "Digite 2: Atualizar numero de telefone do contato\n" + "Digite 3: Atualizar e-mail do contato\n"
					+ "Digite 4: Atualizar o Endereco\n" + "Digite 5: Atualizar gasto em algum mes\n"
					+ "Digite 6: Confirmar e Sair\n");
			op = new Input().pegaOpcao();

			switch (op) {
				case "1": {
					System.out.print("Digite um novo Nome para " + pessoa.get(index).getNome() + ": ");
					pessoa.get(index).setNome( new Input().pegaNome() );
					System.out.println("Contato modificado com sucesso!!!");
					break;
				}
				case "2": {
					System.out.print("Digite um novo Telefone para " + pessoa.get(index).getNome() + ": ");
					pessoa.get(index).setTelefone(new Input().pegaTelefone());
					System.out.println("Contato modificado com sucesso!!!");
					break;
				}
				case "3": {
					System.out.print("Digite o novo email para " + pessoa.get(index).getNome() + ": ");
					pessoa.get(index).setTelefone(new Input().pegaEmail());
					System.out.println("Contato modificado com sucesso!!!");
					break;
				}
	
				case "4": {
					System.out.print("Digite o novo endereco para " + pessoa.get(index).getNome() + ": ");
					pessoa.get(index).setTelefone(new Input().pegaEndereco());
					System.out.println("Contato modificado com sucesso!!!");
					break;
				}
	
				case "5": { 
					System.out.print("Digite o mes a ser corrido os gastos: ");
				}
	
				case "6": {
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
