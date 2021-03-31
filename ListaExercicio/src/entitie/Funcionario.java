package entitie;

public class Funcionario {
     private Integer id;
     private String nome;
     private Double salario;
	    
     public Funcionario() {
		super();
	}

	public Funcionario(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void aumentarSalario(double porcento) {
		this.salario += this.salario*(porcento/100);
	}

	
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
	
	
	
	
	
	
	
}
