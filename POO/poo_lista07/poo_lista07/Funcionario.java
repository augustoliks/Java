package poo_lista07;

import java.io.Serializable;

public class Funcionario implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String pass;

	public Funcionario(String id, String pass) {
		super();
		this.id = id;
		this.pass = pass;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String senha) {
		this.pass = senha;
	}
}


