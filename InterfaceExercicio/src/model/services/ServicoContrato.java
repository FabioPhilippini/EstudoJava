package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Prestacoes;

public class ServicoContrato {

	private ServicoPagamentoOnline pagamentoOnline;

	public ServicoContrato(ServicoPagamentoOnline pagamentoOnline) {
		this.pagamentoOnline = pagamentoOnline;
	}
    public void processarContrato(Contrato contrato, int mes) {
    	double valorBase = contrato.getValorTotal()/mes;
    	for(int i =1; i<=mes;i++) {
    		double valorAtualizado = valorBase + pagamentoOnline.juros(valorBase, i);
    		double valorTotal = valorAtualizado + pagamentoOnline.taxaPagamento(valorAtualizado);
    		Date dataPagamento = adicionarMes(contrato.getData(),i);
    		contrato.getPrestacao().add(new Prestacoes(dataPagamento,valorTotal));
    	}
    }
	
    private Date adicionarMes(Date data, int N) {
    	Calendar calendario = Calendar.getInstance();
    	calendario.setTime(data);
    	calendario.add(Calendar.MONTH, N);
    	return calendario.getTime();
    }
	
	
	
}
