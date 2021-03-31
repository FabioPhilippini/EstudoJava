package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitie.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcLista = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão registrados?: ");
		int numFunc = sc.nextInt();
		
		for(int i  = 1; i <= numFunc;i++) {
			System.out.println("Funcionário #" + i + ":");
					
			System.out.print("Id: ");
			int idFunc = sc.nextInt();
			while(idExiste(funcLista, idFunc)) {
				System.out.print("Id já está sendo usado. Tente outro: ");
				idFunc = sc.nextInt();
			}
			
			System.out.print("Nome do funcionário: ");
			sc.nextLine();
			String nomeFunc = sc.nextLine();
			
			System.out.print("Salário: ");
			double salFunc = sc.nextDouble();
			
			/*
			Funcionario funcionario = new Funcionario(idFunc,nomeFunc,salFunc);
			funcLista.add(funcionario);
			*/
			
			//forma simplificada
			funcLista.add(new Funcionario(idFunc,nomeFunc,salFunc));
			
			System.out.println();
		}
				
		System.out.print("Qual o id do funcionário que terá o aumento: ");
		int idFunc = sc.nextInt();
		
		Funcionario funcionario = funcLista.stream().filter(x -> x.getId() == idFunc).findFirst().orElse(null);
		
		if(funcionario == null) {
			System.out.println("Id inexistente");
		}
		else {
			System.out.print("De quantos porcento será o aumento?: ");
			double porcento = sc.nextDouble();
			funcionario.aumentarSalario(porcento);
		}
		System.out.println();
		System.out.println("Lista dos funcionários:");
		for(Funcionario func : funcLista) {
			System.out.println(func);
		}
		
       sc.close();
	}
	public static boolean idExiste(List<Funcionario> funcLista,int idFunc) {
		Funcionario func = funcLista.stream().filter(x -> x.getId() == idFunc).findFirst().orElse(null);
		return func != null;
	}

}
