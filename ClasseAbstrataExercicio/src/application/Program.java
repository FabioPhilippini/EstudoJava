package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaIndividual;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<>();
		
		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();
		
	    for(int i = 1; i<=n;i++) {
	    	System.out.println("Datas do contribuinte #" + i + ":");
	    	System.out.print("Contribuinte pessoa física ou jurídica (f/j)? : ");
	    	char resp = sc.next().charAt(0);
	    	sc.nextLine();
	    	System.out.print("Nome: ");
	    	String nome = sc.nextLine();
	    	System.out.print("Renda anual: ");
	    	double renda = sc.nextDouble();
	    	
	    	if(resp == 'f') {
	    		System.out.print("Gastos com saúde: ");
	    		double gastos = sc.nextDouble();
	    		lista.add(new PessoaIndividual(nome,renda,gastos));
	    	}
	    	else {
	    		System.out.print("Número de funcionários: ");
	    		int numeroFunc = sc.nextInt();
	    		lista.add(new PessoaJuridica(nome,renda,numeroFunc));
	    	}    	
	    }
	    System.out.println();
	    System.out.println("Taxas pagas:");
	    for(Pessoa p : lista) {
	    	System.out.println(p.getNome() + ": R$ " + String.format("%.2f", p.imposto()));
	    }
		double soma = 0;
		for(Pessoa p : lista) {
			soma += p.imposto();
		}
		System.out.println();
		System.out.println("Total das taxas: R$ " + String.format("%.2f",soma));
		
		
       sc.close();
	}

}
