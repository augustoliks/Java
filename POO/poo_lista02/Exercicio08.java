package exercicios;

public class Exercicio08 {

	public static void main(String[] args) {

		int vetor[] = new int[4];
		int digitos = 1234;
		
		criptografar(digitos, vetor);
		imprimir(vetor);
		System.out.println();
		descriptografar(digitos, vetor);
		imprimir(vetor);
		
	}

	public static void criptografar(int digitos, int vetor[]) {

		int x = 1000, k = 0, j, aux;

		while (digitos / x == 0) {
			vetor[k] = 0;
			k++;
			x /= 10;
			if (digitos <= 0) {
				break;
			}
		}

		for (j = 3; j >= k; j--) {
			vetor[j] = digitos % 10;
			digitos /= 10;
		}

		for (k = 0; k < 4; k++) {
			vetor[k] += 7;			
			vetor[k] %= 10;
		}

		aux = vetor[0];
		vetor[0] = vetor[2];
		vetor[2] = aux;

		aux = vetor[1];
		vetor[1] = vetor[3];
		vetor[3] = aux;

	}

	public static void descriptografar(int digitos, int vetor[]) {

		int k,a,b,c,d;

		for (k = 0; k < 4; k++) {
			vetor[k] += 10;
			vetor[k] -= 7;
			vetor[k] %= 10;
		}
		
		c=vetor[0];
		d=vetor[1];
		a=vetor[2];
		b=vetor[3];
		
		vetor[0]=a;
		vetor[1]=b;
		vetor[2]=c;
		vetor[3]=d;
		
	}	
	
	public static void imprimir(int v[]) {
		for (int k = 0; k < 4; k++) {
			System.out.print(v[k] + "\t");
		}
	}
}