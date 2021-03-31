package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Entre com o número de produtos:");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n;i++) {
			System.out.println("Dados do produto #" + i + ":");
			System.out.print("Comum, usado ou importado (c/u/i): ");
			char resp = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String prodNome = sc.nextLine();
			System.out.print("Preço: ");
			double prodPreco = sc.nextDouble();
			
			if(resp == 'i') {
				System.out.print("Frete: ");
				double prodFrete = sc.nextDouble();			
				lista.add(new ProdutoImportado(prodNome,prodPreco,prodFrete));
			}
			else if (resp == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				Date prodFabricacao = sdf.parse(sc.next());			
				lista.add(new ProdutoUsado(prodNome,prodPreco,prodFabricacao));
			}
			else {		
				lista.add(new Produto(prodNome,prodPreco));
			}
					
		}
		System.out.println();
		System.out.println("Etiqueta de preços:");
		for(Produto prod : lista) {
			System.out.println(prod.etiquetaPreco());
		}
		
		
		
       sc.close();
	}

}
