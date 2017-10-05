package poo_lista07;

import java.io.Serializable;

public class Levantamento implements Serializable{

	String data;
	private Double entrada;
	private Double saida;

	public Levantamento(String data, Double entrada, Double saida) {
		super();
		this.data = data;
		this.entrada = entrada;
		this.saida = saida;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Double getEntrada() {
		return entrada;
	}

	public void setEntrada(Double entrada) {
		this.entrada = entrada;
	}

	public Double getSaida() {
		return saida;
	}

	public void setSaida(Double saida) {
		this.saida = saida;
	}
}
