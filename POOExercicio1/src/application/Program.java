package application;

import java.util.Locale;
import java.util.Scanner;

import entitie.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Entre com os dados do produto");
		
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Preço: R$ ");
		produto.preco = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		produto.qntd = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		
		System.out.print("Entre com a quantidade de produtos a serem adicionados: ");
		int quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);

		System.out.println();
		System.out.println("Dados do produto atualizados: " + produto);	
        
		System.out.println();	
		System.out.print("Entre com a quantidade de produtos a serem removidos: " );
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
        System.out.println();	
		System.out.println("Dados do produto atualizados: " + produto);
		
		
      sc.close();
	}

}
