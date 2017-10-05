package datashow;

public class SemanaAcademica implements Informador {
	private String informacao;
	private Calendario calendario;

	@Override
	public void informar() {
		System.out.println("Informações da semana: " + informacao);
		System.out.println("Data:");
		calendario.informar();
	}

	public SemanaAcademica(String informacao, Calendario calendario) {
		this.informacao = informacao;
		this.calendario = calendario;
	}

	//get and setters...
	public String getInformacao() {
		return informacao;
	}

	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}

	public Calendario getCalendario() {
		return calendario;
	}

	public void setCalendario(Calendario calendario) {
		this.calendario = calendario;
	}

}