package serializando_objetos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.List;

public class PriEscrita{

	public static void main(String[] args) throws Exception {
		List<Pessoa> pessoas = new ArrayList<>();
		
		Aluno a1 = new Aluno("alunoYYY", 13, 10);
		Pessoa a2 = new Aluno("alunoXXX", 13, 10);
		Professor p1 = new Professor("4578", 13, 13);
		
		pessoas.add( (Pessoa) a1 ) ;
		pessoas.add( a2 ) ;
		pessoas.add( (Pessoa) p1 );
		pessoas.add( (Pessoa) p1 );
		
		for (Pessoa pessoa : pessoas) {
			System.out.println("nome: "+pessoa.getNome());
		}
		
		FileOutputStream fileOut = new FileOutputStream("/home/liks/Documentos/pessoa.ser");
		ObjectOutputStream outObj = new ObjectOutputStream(fileOut);
		outObj.writeObject(pessoas);
		outObj.close();
		
		
		
	}
}