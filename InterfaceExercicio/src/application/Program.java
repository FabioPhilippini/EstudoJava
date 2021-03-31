package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Prestacoes;
import model.services.PayPal;
import model.services.ServicoContrato;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Dados do contrato");
		System.out.print("Número: ");
		Integer numero = sc.nextInt();
		System.out.print("Data (DD/MM/YYYY):");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		Double valor = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero,data,valor);
		
		System.out.print("Número de parcelas: ");
		int parcelas = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(new PayPal());
		
		servicoContrato.processarContrato(contrato, parcelas);
		
		System.out.println("Prestações:");
		for(Prestacoes prest : contrato.getPrestacao()) {
			System.out.println(prest);
			
		}
		
		sc.close();
	}

}
