package datashow;

/* Esta classe tem como OBRIGACAO implementar a interface "Informador", pois sua sua superclasse  
	tem consigo a respectiva Interface implementada em sua composição
*/
public class Professor extends Pessoa {

	public Professor(String nome) {
		super(nome);
	}
	
	// comportamento do metodo "informar" da interface "Informador" para este objeto
	@Override
	public void informar() {
		System.out.println("Nome do professor: " + getNome());
	}

}