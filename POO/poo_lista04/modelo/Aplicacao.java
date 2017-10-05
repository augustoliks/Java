package br.com.fatec.modelo;

import br.com.fatec.engine.Agenda;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		int saida=0;
		Agenda agenda = new Agenda();
		
		do {

			new Outputs().imprimiOpcoes();
			
			switch (new Inputs().pegaOpcao() ) {
				case "1": {
					agenda.cadastrarAluno();
					break;
				}
	
				case "2": {
					agenda.cadastrarProfessor();
					break;
				}
				case "3": {
					agenda.editar();
					break;
				}
		
				case "4": {
					agenda.excluir();
					break;
				}
		
				case "5": {
					agenda.lerRegistos();
					break;
				}
				
				case "6": {
					agenda.lerHoraAula();
					break;
				}
		
				case "7": {
					agenda.lerTodoscadastros();
					break;				
				}
				
				case "8": {
					saida=1;
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