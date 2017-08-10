package pontoxy;

public class Ponto{

	int X, Y;
	
	Ponto(int X, int Y){
		this.X=X;			
		this.Y=Y;
	}
/* O constructor "Ponto" foi criado na classe "Ponto" justamente para que no ato da criação do objeto
 * que utilize esta classe como referencia, force a atribuição dos paramentros na classe main, 
 * this. serve para diferenciar o "X" da classe Ponto, com o "X" do método/constructor Ponto 
*/
			
	double distancia(Ponto p){			
		double disX = Math.pow(X - p.X, 2);
		double disY = Math.pow(Y - p.Y, 2);
		return  Math.sqrt(disX+disY);	
	}
/* Nesse método, o objetivo de ter a assinatura "Ponto p", é inserir outra coordenada
 * para o calculo de distancia
*/
	
	double distancia(){
		double disX = Math.pow(X, 2);	
		double disY = Math.pow(Y, 2);		
		return Math.sqrt(disY+disX);
	}
/* Se o parâmetro for "No arguments", o calculo será feito com apenas um ponto
*/
	
	void imprimir(){
		System.out.println( distancia() );
	}	
	
	void imprimir(Ponto p){
		System.out.println( distancia(p) );
	}
	
}