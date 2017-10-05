package exercicio01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serializacao {

	public static void salvar(List<Produto> produtos, String caminho) throws IOException {
	
		FileOutputStream fileOut = new FileOutputStream(caminho);
		ObjectOutputStream outObj = new ObjectOutputStream(fileOut);
		outObj.writeObject( produtos );
		outObj.close();
		
	}

	public static List ler(String caminho) throws IOException, ClassNotFoundException{
	
		FileInputStream fileIn= new FileInputStream(caminho);
		ObjectInputStream inObj = new ObjectInputStream(fileIn);		

		return (List<Produto>) inObj.readObject() ;
		
	}
}
