package poo_lista07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serializacao {

	public static void salvar(List lista, String tipo) throws IOException {

		if (tipo.equals("Levantamento")) {
			String caminho = "/home/liks/JAVA/levatamentos.ser";
			FileOutputStream fileOut = new FileOutputStream(caminho);
			ObjectOutputStream outObj = new ObjectOutputStream(fileOut);
			outObj.writeObject((List<Levantamento>) lista);
			outObj.close();
		}

		else if (tipo.equals("BDLogin")) {
			String caminho = "/home/liks/JAVA/BDLogin.ser";
			FileOutputStream fileOut = new FileOutputStream(caminho);
			ObjectOutputStream outObj = new ObjectOutputStream(fileOut);
			outObj.writeObject((List<Levantamento>) lista);
			outObj.writeObject((List<BDLogin>) lista);
			outObj.close();
		}

	}

	public static List ler(String tipo) throws IOException, ClassNotFoundException {

		if (tipo.equals("Levantamento")) {
			String caminho = "/home/liks/JAVA/levatamentos.ser";
			FileInputStream fileIn = new FileInputStream(caminho);
			ObjectInputStream inObj = new ObjectInputStream(fileIn);

			return (List<Levantamento>) inObj.readObject();
		}

		else if (tipo.equals("BDLogin")) {
			String caminho = "/home/liks/JAVA/BDLogin.ser";
			FileInputStream fileIn = new FileInputStream(caminho);
			ObjectInputStream inObj = new ObjectInputStream(fileIn);
			return (List<BDLogin>) inObj.readObject();
		}
		
		else {
			return null;
		}
	}
}
