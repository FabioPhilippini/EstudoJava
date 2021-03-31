package entities;

public final class FuncionarioTerceirizado extends Funcionario {
	private Double taxaBonus;

	public FuncionarioTerceirizado() {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorHora, Double taxaBonus) {
		super(nome, horas, valorHora);
		this.taxaBonus = taxaBonus;
	}

	public Double getTaxaBonus() {
		return taxaBonus;
	}

	public void setTaxaBonus(Double taxaBonus) {
		this.taxaBonus = taxaBonus;
	}

	
	@Override
	public Double pagamento() {
		return super.pagamento() + taxaBonus * 1.1;
		
	}
}
