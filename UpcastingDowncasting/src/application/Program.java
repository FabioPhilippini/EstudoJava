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
		/*
		Upcasting : casting da subclasse para superclasse (uso comum no polimorfismo), acontence em tempo de execu��o
        Downcasting : casting da super para subclasse, se usa o istanceof (uso comum em m�todos que recebem parametros gen�ricos como o Equals)
		*/
		
		Conta conta = new Conta(8080,"Eren",0.0);
		ContaNegocio cn = new ContaNegocio(8081,"Naofumi",0.0,500.00);
		
		//Upcasting
		Conta conta1 = cn;
		Conta conta2 = new ContaNegocio(8083, "Luffy", 0.0, 200.0);
		Conta conta3 = new ContaPoupanca(8084,"Rimuru",0.0,0.01);
		
		//Downcasting
		ContaNegocio cn2 = (ContaNegocio)conta2;
		cn2.emprestimo(100.0);
		
			
		//Vai dar erro durante a execu��o que � quando o compilador vai reconhecer em tempo de execu��o que a conta4 � uma ContaPoupanca
		// ContaNegocio cn3 = (ContaNegocio) conta3;
		
		if(conta3 instanceof ContaNegocio) {
			ContaNegocio cn4 = (ContaNegocio) conta3;
			cn4.emprestimo(200.0);
			System.out.println("Empr�stimo!");
		}
		
		if(conta3 instanceof ContaPoupanca) {
			ContaPoupanca cn4 = (ContaPoupanca) conta3;
			cn4.atualizarSaldo();
			System.out.println("Atualizado");
		}
		
		
		
		
		sc.close();
	}

}
