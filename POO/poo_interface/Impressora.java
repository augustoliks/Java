package datashow;

public class Impressora {
	
	public void imprimir(Informador in) {
		in.informar();
/*		|		|
 * 		recebe o objeto, porem trabalha como fosse "Informador", entao o metodo vai se limitar apenas aos 
 * 		metodos que esta no "Informador"
 * 				|
 *				chama o metodo "informar" desse objeto
 */				
	}
}

/*
	recebe um objeto de tipo "x", porém irá trabalhar com o mesmo no formato "Informador"
*/