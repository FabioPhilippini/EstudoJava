package entities;

public final class ContaNegocio extends Conta {
	private double limiteEmprestimo;

	public ContaNegocio() {
		super();
	}

	public ContaNegocio(Integer numero, String titular, Double saldo, double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
    
	public void emprestimo(Double valor) {
		if(valor <= limiteEmprestimo) {
		saldo += valor + 10.0;
		}
	}
	
	 @Override
	    public void sacar(Double valor) {
		 super.sacar(valor);
		 saldo -= 2.0 ;
	 }
}
