package pacote;
//teste123
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Principal {
	public static void main(String[] args) throws Exception {

		File f = new File("G:\\clienteSocket.txt");

		FileInputStream in = new FileInputStream(f);
		Socket socket = new Socket("172.16.11.34", 567);

		OutputStream out = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(out);

		BufferedWriter writer = new BufferedWriter(osw);

		writer.write(f.getName() + "\n");
		writer.flush();

		int c;

		while ((c = in.read()) != -1) {
			System.out.println(c);
			out.write(c);
		}
	socket.close();
	}

}
