package arquivos_diretorios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffers {

	public static void main(String[] args) throws IOException {

		String fileIn = "/home/liks/Documentos/PASTA/arquivoBuff.txt";
		String fileOut = "/home/liks/Documentos/PASTA/arquivoBuffNumerado.txt";

		BufferedWriter escritor = new BufferedWriter(new FileWriter((fileIn)));
		escritor.write("Goo Goo Dolls\nMatchbox 20\nMy chemical Romance\nDaft Punk");
		escritor.close();

		BufferedReader leitor = new BufferedReader(new FileReader((fileIn)));

		int count = 0;
		String linha;
		String out = "";

		/* Criar outro arquivo com com as linhas numeradas */
		escritor = new BufferedWriter(new FileWriter((fileOut)));
		
		while ((linha = leitor.readLine()) != null) {	/* le a linha X, se linha já tiver o conteúdo da linha X, le a linha X+1
															até "null", que é o final do arquivo */	
			
			out = count + " " + linha + "\n";	// cria uma string, adicionando a linha o numero da linha no momento
			escritor.write(out);				// escreve o conteudo de "out" no arquivo de saida "fileOut"
			count++;
		}
		
		/* Adicionando linhas ao final do aqruivo */
		escritor.append("Append no final do aquivo");
		
		/* Fecha o arquivo para escrita ("fileIn") */
		escritor.close();

	}

}