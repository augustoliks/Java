package pacote;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	static Scanner scan = new Scanner(System.in);
	private Socket socketCliente;
	
	public static void main(String[] args) throws UnknownHostException, IOException {

		while (true) {
			Cliente cliente = new Cliente();
			String txt = scan.next();
			cliente.conectarEnviar(txt);
		}
	}

	
	public Cliente() throws UnknownHostException, IOException {
		System.out.println("Fazendo conexao");
		socketCliente = new Socket("172.16.11.34", 789);
	}

	public void conectarEnviar(String txt) throws IOException {

		PrintWriter escritor = new PrintWriter(socketCliente.getOutputStream());
		System.out.println(txt);
		escritor.write(txt);
		escritor.close();
	}

}
