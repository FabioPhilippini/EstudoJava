package application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
	    System.out.print("Quantos valores?: ");
	    int n = sc.nextInt();
	    
	    for(int i =0;i<n;i++) {
	    	int valor = sc.nextInt();
	    	ps.addValor(valor);
	    }
	    ps.imprimir();
	    System.out.println("1º valor: " + ps.primeiro());
		
		
		sc.close();

	}

}
