package exercicio01;

import java.io.IOException;

public class Aplicacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		int saida=0;
		Agenda agenda = new Agenda();

		do {

			new Outputs().imprimiOpcoes();
			
			switch (new Inputs().pegaOpcao()) {
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
					agenda.lerDisco();
					break;
				}
				
				case "9": {
					agenda.salvarEmDisco();
					break;
				}
				case "10": {
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