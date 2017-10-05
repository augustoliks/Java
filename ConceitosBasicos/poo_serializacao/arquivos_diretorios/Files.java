package arquivos_diretorios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.util.List;

public class Files {
	public static void main(String[] args) throws Exception {

		File pasta = new File("/home/liks/Documentos/PASTA");
		pasta.mkdir();
		pasta.setReadable(true, false);
		pasta.setWritable(true, false);
		
		File file = new File("/home/liks/Documentos/PASTA/arquivo.txt");
		// Instanciando "file" com o tipo "File", passando o caminho como argumento de
		// constructor

		FileWriter escritor = new FileWriter(file);
		// Instanciando "escritor" com o tipo "FileWritter", passando o "file", como
		// arguemto
		// esta ação possibilitará o acesso de escrita no arquivo referenciado
		// anteriormente

		escritor.write("\tGoo Goo Dolls\nMatchbox 20\nMy chemical Romance");
		// Escreve no arquivo

		escritor.close();	
		//Fechar o arquivo


		File shellScript = new File("/home/liks/Documentos/PASTA/shellScript.docx");	
		// Exetensao nao importa... já que estamos trabalhando com ASCII, quem for capaz de entender ASCII
		//Ira exibir o conteudo
		
		escritor = new FileWriter(shellScript);		
		// Instanciando em "FileWritter" para poder escrever no arquivo
		
		escritor.write("#!/bin/bash\necho Hello world");
		// Escrevendo no arquivo

		shellScript.setExecutable(true, false);	//Deixar executavel DEPOIS DE CRIAR O FONTE
/*									|		|
									Deixa executavel?
											|
											Somente ao dono do arquivo?

*/
		escritor.close();
		//Fechar o arquivo
		
		
		//Listar aqruivos dentro de um diretorio
		
		if (pasta.isDirectory()) {		//verificando se "pasta" é um diretorio, retorna "True" se for 
			String arquivos[] = pasta.list();	
			//"pasta.list()" retorna um array do tipo String, contendo os arquivos do diretorio "pasta"
												
			for (String nome : arquivos) {
			// retorna o nome de um arquivo para variavel "nome", do tipo String (um por um ate nao ter mais elementos)
				System.out.println("Nome: "+nome);
				//exibe o nome dos arquivos
			}
				
		}
		
		
	}
}
