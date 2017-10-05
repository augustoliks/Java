package poo_lista07;

import java.io.IOException;

public class Aplicacao {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		Engine engine = new Engine();

		String perfil;
		
		do {
			perfil = engine.login(new Inputs().pegaLogin(), new Inputs().pegaSenha());
			System.out.println(perfil);
		}while ( perfil.equals("adm") || perfil.equals("error") );
	
		
		
		int saida = 0;
		do {

			FrontEnd.imprimiOpcoes();

			switch (new Inputs().pegaOpcao()) {
			case "1": {
				engine.levantamentos();
				break;
			}

			case "2": {
				engine.balancos();
				break;
			}

			case "3": {
				engine.balancoFinal();
				break;
			}

			case "4": {
				engine.lerDisco();
				break;
			}

			case "5": {
				engine.salvarEmDisco();
				break;
			}

			case "6": {
				saida = 1;
				break;
			}

			default: {
				System.out.println("Opcao invalida!!!");
				FrontEnd.imprimiOpcoes();
				break;
			}
			}
		} while (saida != 1);
	}
}
