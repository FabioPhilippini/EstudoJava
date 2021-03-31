package application;

import java.util.Locale;
import java.util.Scanner;

import entitie.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Número da conta: ");
		int numConta = sc.nextInt();
		
		System.out.print("Titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("Vai haver depósito inicial (Y/N)?: ");
		char resp = sc.next().charAt(0);
		
		if(resp == 'Y' || resp =='y') {
			System.out.print("Valor do depósito: ");
			double depositoInicial = sc.nextDouble();
			 conta = new Conta(numConta,titular,depositoInicial);
		}
		else {
			conta = new Conta(numConta,titular);
		}
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com um valor de depósito: ");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);
		
		System.out.println();
		System.out.println("Dados atualizados:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com um valor de saque: ");
		double saque = sc.nextDouble();
		conta.sacar(saque);
		
		System.out.println();
		System.out.println("Dados atualizados:");
		System.out.println(conta);
		
		
       sc.close();
	}

}
