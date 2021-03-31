package application;

import java.util.Locale;
import java.util.Scanner;

import entitie.Aluguel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
		Aluguel [] quarto = new Aluguel[10];
		System.out.print("Quantos quartos serão alugados?: ");
		int qntd = sc.nextInt();
		
		
		for(int i =1;i<=qntd;i++) {
			sc.nextLine();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Número do quarto: ");
			int num = sc.nextInt();
			quarto[num] = new Aluguel(nome,email);
			System.out.println();
		}
		System.out.println();
		System.out.println("Quartos ocupados:");
		for(int i =0; i<10;i++) {
			if(quarto[i] != null) {
				System.out.println(i + " :" + quarto[i]);
			}
		}
		
		 
			
		
		
		
		sc.close();
	}

}
