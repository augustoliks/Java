package LendoBin;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;


public class TestesLendoBinarios {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fileIn = new FileInputStream("/home/liks/Documentos/pessoa.ser");

		ObjectInputStream inObj = new ObjectInputStream(fileIn);
		List<Pessoa> pessoas = (List<Pessoa>) inObj.readObject();

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getIdade());
		}

	}

}
