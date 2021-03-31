package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private StatusPedido status;
	
	private Cliente cliente;
	private List<ItemPedido> produtos = new ArrayList<>();

	public Pedido() {
		super();
	}

	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		super();
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getProdutos() {
		return produtos;
	}

	public void adicionarProduto(ItemPedido produto) {
		produtos.add(produto);
	}
	
	public void removerProduto(ItemPedido produto) {
		produtos.remove(produto);
	}
	
	public double total() {
		double soma = 0;
		for(ItemPedido pedido : produtos) {
			soma += pedido.subTotal();
		}
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Produtos do pedido:\n");
		for(ItemPedido prod : produtos) {
			sb.append(prod + "\n");
		}
		sb.append("Total: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
	}

}
