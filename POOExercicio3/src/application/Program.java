package application;

import java.util.Locale;
import java.util.Scanner;

import entitie.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		
		System.out.print("Sálario bruto: R$ ");
		func.salarioBruto = sc.nextDouble();
		
		System.out.print("Taxa: ");
		func.taxa = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário: " + func);
		
		System.out.println();
		System.out.print("De quantos porcento será o aumento?: ");
		double aumento = sc.nextDouble();
		func.aumentarSalario(aumento);
		
		System.out.println();
		System.out.println("Dados atualizados: " + func);
		
		
       sc.close();
	}

}
