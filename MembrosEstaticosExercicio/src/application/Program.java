package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorMoeda;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o valor do dolar?: ");
		double valor = sc.nextDouble();
		
		System.out.print("Quantos dolares serão comprados?: ");
		double quantia = sc.nextDouble();
		
		double convertido = ConversorMoeda.conversao(valor, quantia);
		
		System.out.println("Quantia a ser paga em reais: " + String.format("%.2f", convertido));
		
		sc.close();
	}

}
