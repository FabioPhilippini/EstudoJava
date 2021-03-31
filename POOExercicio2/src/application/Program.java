package application;

import java.util.Locale;
import java.util.Scanner;

import entitie.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo ret = new Retangulo();
		System.out.println("Entre com o comprimento e altura do retangulo: ");
		ret.comprimento = sc.nextDouble();
		ret.altura = sc.nextDouble();
		
		System.out.println("ÁREA = " + String.format("%.2f", ret.area()));
		System.out.println("PERÍMETRO = " + String.format("%.2f", ret.perimetro()));
		System.out.println("DIAGONAL = " + String.format("%.2f", ret.diagonal()));
		
		sc.close();
	}

}
