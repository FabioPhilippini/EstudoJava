package model.services;

public class PayPal implements ServicoPagamentoOnline {

	private static final double taxaPagamento = 0.02;
	private static final double jurosMes = 0.01;
	
	@Override
	public double taxaPagamento(double quantia) {
		return quantia * taxaPagamento;
	}

	@Override
	public double juros(double quantia, int mes) {
		return quantia* mes * jurosMes;
	}
	
	
}
