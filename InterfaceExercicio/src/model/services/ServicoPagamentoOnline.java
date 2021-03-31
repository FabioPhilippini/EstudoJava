package model.services;

public interface ServicoPagamentoOnline {
      double taxaPagamento(double quantia);
      double juros(double quantia, int mes);
		    
}
