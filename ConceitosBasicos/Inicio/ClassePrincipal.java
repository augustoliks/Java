package br.edu.fatec;

import java.util.Scanner;

public class ClassePrincipal {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero Inteiro: ");
		int intScaneado = scanner.nextInt();
		System.out.println("Digite um Numero decimal: ");
		double doubleScaneado = scanner.nextDouble();		
		System.out.println("Digite uma palavra/frase: ");
		String stringScaneado = scanner.nextLine(); 
		
		System.out.println("SCANNER:\n\tNúmero Inteiro: "+intScaneado+"\n\tFrase: "+stringScaneado+"\n\tNumero Decimal: "+doubleScaneado);
		
		int numeroINT = 1010;
		double numeroDOUBLE = 10;
		
		Integer objetoINT = new Integer (numeroINT);		/* WRAPPING: cria-se um objeto a partir de um tipo primitivo, 
															obtendo atributos referentes ao seu valor ... */
		
		Double objetoDOUBLE = numeroDOUBLE;					/* Forma mais simples de se fazer o WRAPPING (empacotamento) 
		 										   			a partir do java1.5 */
		
		// ALGUMAS APLICAÇÕES DO WRAPPING \\
		
		System.out.println("numeroINT em BYTE: "+objetoINT.BYTES ); 
		// atributo BYTES de um objeto INT, ou seja, Mostra a quantidade de BYTE de um objeto INT 
		
		System.out.println("numeroINT em BINÁRIO: "+objetoINT.toBinaryString(objetoINT) ); 
		System.out.println("Número 10 em BINÁRIO: "+objetoINT.toBinaryString(10) );	
		/* Aki nada mais é de que um constructor do objeto Interger "objetoINT", do qual por obrigação necessita como 
		parametro um numero inteiro, onde seu retorno é o seu respectivo valor em binário */
			
		System.out.println( "numeroDOUBLE em HEXADECIMAL: "+objetoDOUBLE.toHexString(objetoDOUBLE));
		System.out.println("numeroDOUBLE em BYTE: "+objetoDOUBLE.BYTES );
		
		Pessoa apenasReferenciada;
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
/*		|		|	 |	   |   |
 	Cria Uma Referencia para a Variavel p2, ou seja, aloca memória para p2, com a respectiva estrutura de p2
 				|	 |	   |   |
 			Variável de referência, não eh objeto...
 					 |	   |   |
 				Palavra reservada para criar um novo OBJETO
 						   |   |
 						 Objeto/classe
							   |
			Constructor, ou seja, eh a assinatura do método, os parametros do constructor são OBRIGATÓRIOS, 
			e o restante declarado em seu bloco são opcionais
			Posso ter dois metodos ou classes com os nomes iguais, desde q suas assinaturas sejam distintas
*/	
		p1.idade = 20;				//Atribui valor ao atributo "idade" pertecente ao objeto "Pessoa"
		p1.nome = "BruceWayne";		//Atribui valor ao atributo "nome" pertecente ao objeto "Pessoa"

		p2.idade = 100;
		p2.nome = "Batman";

		System.out.println("Pessoa 1:\nNome: " +p1.nome+"\nIdade: "+p1.idade);
		System.out.println("\nPessoa 2:\nNome " +p2.nome+"\nIdade: "+p2.idade);

		System.out.println("Endereco de memoria de p1: "+p1);		//Mostra o endereço que a variável "p1" referencia em Hexadecimal
		System.out.println("Endereco de memoria de p2: "+p2);		//Mostra o endereço que a variável "p2" referencia em Hexadecimal
		
		int auxiliar = p1.idade;	// Aki foi feito uma passagem por VALOR...
		
		apenasReferenciada = p1;	/* Variável com referência de estrutura "Pessoa", só variavel... nao objeto, porem 
										quando referenciado para um objeto, ela se torna um objeto pois está rfeferenciando
										mesmo endereço, assim, assumindo todos os atributos do objeto	*/
		
		p1 = p2; 					/* Aki foi feito uma passagem por REFERÊNCIA, ou seja, o endereço de memória 
									   de p1 eh o mesmo de p2, eles apontam para mesma posição de memória
									   Então... "p1" e "p2" NÃO SÃO IGUAIS, "p1" e "p2" SÃO OS MESMOS!!! */
		
		p2.nome = "Ator";	// Se eu alterar "p2", vou alterar "p1", pq eles referenciam a mesma posição de memória
		p2.idade = 0;		// Alterando valores de "p2", na verdade vou alterar valores da posicao referenciada por "p2"

		System.out.println("variavel Auxiliar: "+auxiliar);		/* "auxiliar" permanece intacta pois ela possui seu pro
																	endereço de memória, e ela obteve seu valor por uma 
																	passagem de valor 	*/
		
		System.out.println("\n.....Pessoa 1:\n\tNome: " +p1.nome+"\n\tIdade: "+p1.idade);

		System.out.println("\n.....Referenciado:\n\tNome: " +apenasReferenciada.nome+"\n\tIdade: "+apenasReferenciada.idade);

		System.out.println("Endereco de memoria de p1: "+p1);		
		System.out.println("Endereco de memoria de p2: "+p2);		/* Feito a passagem de valor de referência de "p2" para "p1",
									   mostrará então o mesmo endereço em Hexadecimal	*/
		
		System.out.println( "Aki redireciona para o metodo com assinatura INT, seu número é: "+metodoX(10) );
		System.out.println( metodoX("Carlos") );
		System.out.println( metodoX("Carlos", 30) );
	}
	
// Varios Métodos com o mesmo Nome, porém com assinaturas diferentes...
	public static int metodoX(int varInternaINT) {
		return varInternaINT*2;
	}		
	
	public static String metodoX(String varInterna){
		return "Olá --"+varInterna+"--, Este é o método com assinatura String";
	}

	public static String metodoX(String varInterna, int varInternaINT){
		return "Olá --"+varInterna+"--, Este é o método com assinatura String, Int / Seu numero eh "+varInternaINT;
	}
}