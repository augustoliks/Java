package pacote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	private ServerSocket socketServidor;
	public Servidor() throws IOException{
		socketServidor = new ServerSocket(789);
		System.out.println("iniciando servidor:");
	}
	
	public void iniciar() throws IOException{
		while(true){
			Socket socketEscuta = socketServidor.accept();
			InputStreamReader streamReader = new InputStreamReader(socketEscuta.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);
			String textoEnviado = reader.readLine();
			System.out.println(textoEnviado );
			reader.close();
		}
	}
}
