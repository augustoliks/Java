package exercicio05;

public class Exercicio05 {

	private String numeroConta;
	private float saldoInicioMes;
	private float totalIntensCobradoMes;
	private float totalCredito;
	private float limiteCredito;

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldoInicioMes() {
		return saldoInicioMes;
	}

	public void setSaldoInicioMes(float saldoInicioMes) {
		this.saldoInicioMes = saldoInicioMes;
	}

	public float getTotalIntensCobradoMes() {
		return totalIntensCobradoMes;
	}

	public void setTotalIntensCobradoMes(float totalIntensCobradoMes) {
		this.totalIntensCobradoMes = totalIntensCobradoMes;
	}

	public float getTotalCredito() {
		return totalCredito;
	}

	public void setTotalCredito(float totalCredito) {
		this.totalCredito = totalCredito;
	}

	public float getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public void calculaSaldo() {
		float aux = saldoInicioMes + totalIntensCobradoMes - (totalIntensCobradoMes + totalCredito);
		System.out.println("novo saldo: " + aux);

		if (aux > limiteCredito)
			System.out.println("possui" + (aux - limiteCredito) + " reais de credito");
		else
			System.out.println("não possui crédito");

	}
}
