package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitie.enums.Nivel;
import entities.ContratoHora;
import entities.Departamento;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Departamento: ");
		String departamento = sc.nextLine();
		
		System.out.println("Dados do funcionário:");
		System.out.print("Nome: ");
		String funcNome = sc.nextLine();
		
		System.out.print("Nivel: ");
		String funcNivel = sc.nextLine();
		
		System.out.print("Salário base: ");
		double salarioBase = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(funcNome, Nivel.valueOf(funcNivel),salarioBase,new Departamento(departamento));
		
		System.out.print("Número de contratos?: ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n;i++) {
			System.out.println("Dados do contrato #" + i + ":");
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Número de horas: ");
			int horasTrabalhadas = sc.nextInt();
			ContratoHora contrato = new ContratoHora(dataContrato, valorHora, horasTrabalhadas);
			funcionario.adicionarContrato(contrato);		
		}
		System.out.println();
		
		System.out.print("Entre com o mês e ano para calcular os ganhos (MM/YYYY): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
		System.out.println("Ganhos para " + mesAno + ": " + String.format("%.2f",funcionario.ganhos(ano, mes)));
		
       sc.close();
	}

}
