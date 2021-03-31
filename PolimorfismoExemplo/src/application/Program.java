package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.print("Número de funcionáros: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n;i++) {
			System.out.println("Dados do funcionário #" + i + ":");
			System.out.print("Terceirizado (y/n)?: ");
			char resp = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String funcNome = sc.nextLine();
			
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			
			System.out.print("Valor hora: ");
			double valorHora = sc.nextDouble();
					
			if(resp == 'y') {
				System.out.print("Taxa bônus: ");
				double taxa = sc.nextDouble();
				Funcionario func = new FuncionarioTerceirizado(funcNome,horas,valorHora,taxa);
				lista.add(func);
			}
			else {
				Funcionario func = new Funcionario(funcNome,horas,valorHora);
				lista.add(func);
			}
		}
		System.out.println();
		System.out.println("Pagamentos:");
		for(Funcionario func : lista) {
			System.out.println(func.getNome() + " - " + String.format("%.2f", func.pagamento()));
		}
		
		
		sc.close();

	}

}
