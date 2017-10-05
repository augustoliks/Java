package pontoxy;

public class Principal {

	public static void main(String[] args) {

		Ponto pontoA;
		Ponto pontoB;
		
		pontoA = new Ponto(10,20);
		pontoB = new Ponto(5,10);
	
		pontoA.imprimir();
		pontoA.imprimir(pontoB);
			
	}
}