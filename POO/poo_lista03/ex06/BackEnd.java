package ex06;

import java.util.ArrayList;

public class BackEnd {

	ArrayList<Pessoa> pessoa = new ArrayList<>();	

	public void cadastrarPessoa() {
		String nome = new Input().pegaNome() ;
		int index = new Engine().descobreIndex(pessoa, nome);
		
		if (index >=0 ) {
			System.out.println("Cliente ja existe!!!");
			new Engine().atualizarContato(pessoa, nome);
		}
		else {
			Pessoa nova = new Pessoa(new Input().pegaNome(), new Input().pegaTelefone(), new Input().pegaEmail(), new Input().pegaEndereco());
			pessoa.add(nova);
			System.out.println("\nNovo Cliente Adicionado\n");
		}
	}

	public void maiorGastoMensal() {

		String nome = new Input().pegaNome() ;
		int index = new Engine().descobreIndex(pessoa, nome);
			
		if (index >=0 ) {

			System.out.print("Digite o numero referente mes a ser consultado o maior valor gasto: ");
			System.out.print("Valor gasto nesse mes: R$ " + pessoa.get(index).getDinheiro()[new Input().pegaMes()]);

		}
			
	}
	
	public void excluirContatos() {
	
		String nome = new Input().pegaNome() ;
		int index = new Engine().descobreIndex(pessoa, nome);
			
		if ( index >= 0 ) {
			pessoa.remove(index);
		}
		else {
			System.out.println("Contato nao existente");
		}
		
	}

	public void imprimirPessoas() {

		for (int k = 0; k < pessoa.size(); k++) {
			System.out.println("\nNome: " + pessoa.get(k).getNome() + "\nTelefone: " + pessoa.get(k).getTelefone()
					+ "\nEmail: " + pessoa.get(k).getEmail() + "\nEndereco: " + pessoa.get(k).getEndereco());
		}

	}
	
	public void inserirGastoAnual() {
		String nome = new Input().pegaNome() ;
		int index = new Engine().descobreIndex(pessoa, nome);
			
		if (index >= 0) {		
			new Engine().inputGastoAnual(pessoa, nome);
		}

	}

	public void insereGastoMensal() {
		String nome = new Input().pegaNome() ;
		int index = new Engine().descobreIndex(pessoa, nome);
			
		if (index >= 0) {		
			int mes = new Input().pegaMes();
			new Engine().inputGastoMensal(pessoa, mes, nome );			
		}
	
	}
	
	public void verificaGastoAnual() {
		String nome = new Input().pegaNome() ;
		int index = new Engine().descobreIndex(pessoa, nome);
		
		if (index>=0 ) {
			new Engine().outputGastoAnual(pessoa, nome);			
		}
	}
	
	public void verificaGastoMensal() {
		String nome = new Input().pegaNome();
		int mes = new Input().pegaMes();
		int index = new Engine().descobreIndex(pessoa, nome);
		
		if (index>=0) {
			new Engine().outputGastoMensal(pessoa, nome, mes);			
		}

	}

	public void verificaOMaiorGastoAnual() {
		
		double maior=0;
		
		for (int k = 0; k < pessoa.size(); k++) {
			for (int j=1; j<13 ; j++) {
				if ( pessoa.get(k).getDinheiro()[j] > maior) {
					maior=pessoa.get(k).getDinheiro()[j];
				}
			}
		}
		
		for (int k = 0; k < pessoa.size(); k++) {
			for (int j=1; j<13 ; j++) {
				if ( pessoa.get(k).getDinheiro()[j] == maior) {
					System.out.println("Nome: "+pessoa.get(k).getNome() );
					System.out.println("Mes: "+j );
					System.out.println("Dinheiro: "+pessoa.get(k).getDinheiro()[j]+"\n");
					
				}
			}
		}
		
	}
	
}