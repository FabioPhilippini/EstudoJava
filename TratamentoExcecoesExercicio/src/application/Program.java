package application;

import java.util.Locale;
import java.util.Scanner;

import model.Exceptions.DomainExceptions;
import model.entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados da conta:");
		System.out.print("Numero: ");
		int contaNum = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String titularConta = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldoInicial = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limiteSaque = sc.nextDouble();
		
		Conta conta = new Conta(contaNum,titularConta,saldoInicial,limiteSaque);
		
		System.out.println();
		System.out.print("Entre com a quantia a ser sacada: ");
		double saque = sc.nextDouble();
		
		try {
			conta.sacar(saque);
			System.out.println("Saldo atualizado: " + String.format("%.2f", conta.getSaldo()));
		}
		catch(DomainExceptions e) {
			System.out.println("Erro no saque: " + e.getMessage());
		}
		

        sc.close();
	}

}
