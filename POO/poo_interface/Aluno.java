package datashow;

public class Aluno extends Pessoa {
	
	//Constructor do aluno
	public Aluno(String n) {
		//passa o valor da variavel local "n" para o constructor da superclasse
		//toda classe tem uma superclasse, e se ele tiver um constructor e OBRIGATORIO PASSAR uma valor a ela
		super(n); 
	}
	
// comportamento do metodo "informar" da interface "Informador" para este objeto
	@Override
	public void informar() {
		System.out.println("Nome do aluno: " + getNome());
	}
	
}

/* 
	O método "informar" da interface "Informador" serve pra cada CLASSE  DIZER COMO VAI SE COMPORTAR
utilizando um mesmo método... isso é POLIFORMIA, as classes se comportada de maneira distintas utilizando 
o mesmo metodo

*/
