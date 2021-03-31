package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.ContaNegocio;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaNegocio conta = new ContaNegocio(8080,"Eren",0.0,1000.00);
		
		conta.depositar(200.00);
		conta.sacar(50.00);
		// conta.emprestimo(100.00);
		System.out.println(conta.getSaldo());
		
		
		Conta conta2 = new Conta(8081, "Kaneki", 1000.00);
		conta2.sacar(200.00);
		System.out.println(conta2.getSaldo());
		
		Conta conta3 = new ContaPoupanca(8082,"Zoro", 1000.0, 0.01);
		conta3.sacar(200.00);
		System.out.println(conta3.getSaldo());
		
		Conta conta4 = new ContaNegocio(8083,"Naofumi",1000.00,10000.00);
		conta4.sacar(200.00);
		System.out.println(conta4.getSaldo());
		
      sc.close();
	}

}
