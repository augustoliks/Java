package br.com.fatec.modelo;

import java.util.Scanner;

public class Inputs {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static String pegaOpcao() {
		System.out.println("Insira uma opcao: ");
		return scanner.next();
	}	
	
	public static String pegaNome() {
		System.out.println("Insira um nome: ");
		return scanner.next();
	}	

	public static String pegaTelefone() {
		System.out.println("Insira o numero: ");
		return scanner.next();
	}
	
	public static String pegaEmail() {
		System.out.println("Insira um Email: ");
		return scanner.next();
	}
	
	public static String pegaEndereco() {
		System.out.println("Insira um Endereco: ");
		return scanner.next();
	}

	public static String pegaRegistro(){
		System.out.println("Insira Registro: ");
		return scanner.next();
	}

	public static String pegaQuantidadeHoraAula(){
		System.out.println("Horas aula: ");
		return scanner.next();
	}
	
	
}