package datashow;

public class Calendario implements Informador {
	private int dia;
	private int mes;
	private int ano;

// comportamento do metodo "informar" da interface "Informador" para este objeto
	@Override
	public void informar() {
		System.out.println("Dia: " + dia + " Mês: " + mes + " Ano: " + ano);
	}
	
	
	public Calendario(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
/////// get and setters
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
///////
}