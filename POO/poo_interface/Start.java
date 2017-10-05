package datashow;

public class Start {
	public static void main(String[] args) {
		Professor p = new Professor("Juliana");
		Aluno a = new Aluno("Voce");
		Calendario 			c = new Calendario(30, 8, 2017);
		SemanaProva 		sp = new SemanaProva();
		Impressora 			imp = new Impressora();
		Pessoa				pes = new Pessoa("Pessoinha");
		
		Informador		 	sm = new SemanaAcademica("Primeira semana de 2017", c);
//		"sm" Consegue ter apenas os métodos dentro da "Interface", nao possui acesso aos atributos e metodos da 
//		classe "SemanaAcademica", se limita a sua classe/interface, e nao na instancia...
				
		imp.imprimir(c);
		System.out.println();
		
		imp.imprimir(sp);
		System.out.println();
		
		imp.imprimir(sm);
		System.out.println();
		
		imp.imprimir(a);
		System.out.println();
		
		imp.imprimir(p);
		System.out.println();	
		
		imp.imprimir(pes);
		System.out.println();
		
	}
}

/* 
a saida será:
	Dia: 30 Mês: 8 Ano: 2017
	
	Estamos na semana de prova
	
	Informações da semana: Primeira semana de 2017
	Data:
	Dia: 30 Mês: 8 Ano: 2017
	
	Nome do aluno: Voce
	
	Nome do professor: Juliana
	
	Nome do Pessoa: Pessoinha
	
OU SEJA, com um mesmo método, fomos capaz de executar varios comportamentos distintos
a ideia é fazer com que o objeto diga como vai se comportar...
*/