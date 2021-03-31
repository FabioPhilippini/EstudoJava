package entitie;

public class Aluguel {
	private String nome;
	private String email;
	
	public Aluguel() {
		super();
	}


	public Aluguel(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return nome + ", " + email;
	}
	

}
