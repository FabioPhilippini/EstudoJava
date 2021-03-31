package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String nomeCliente = sc.nextLine();
		
		System.out.print("Email: ");
		String emailCliente = sc.nextLine();
		
		System.out.print("Data de nascimento (DD/MM/YYYY) : ");
		Date nascimentoCliente = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nomeCliente,emailCliente,nascimentoCliente);
		
		System.out.println("Dados do pedido:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(),status,cliente);
		
		System.out.print("Quantos produtos serão adicionados? : ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n;i++) {
			System.out.println("Entre com os dados do produto #" + ":");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String prodNome = sc.nextLine();
			System.out.print("Preço: ");
			double prodPreco = sc.nextDouble();
			
			Produto produto = new Produto(prodNome,prodPreco);
			
			System.out.print("Quantidade: ");
			int prodQntd = sc.nextInt();
			
			ItemPedido itemPedido = new ItemPedido(prodQntd,prodPreco,produto);
			pedido.adicionarProduto(itemPedido);
			
		}
		System.out.println();
		System.out.println("Sumário do pedido:");
		System.out.println(pedido);
		
        sc.close();
	}

}
