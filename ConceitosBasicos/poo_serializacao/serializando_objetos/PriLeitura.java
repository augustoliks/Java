package serializando_objetos;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class PriLeitura {
	public static void main(String[] args) throws Exception {

		FileInputStream fileIn= new FileInputStream("/home/liks/Documentos/pessoa.ser");

		ObjectInputStream inObj = new ObjectInputStream(fileIn);
		List<Pessoa> pessoas = (List<Pessoa>) inObj.readObject();

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome());
		}

	}

}