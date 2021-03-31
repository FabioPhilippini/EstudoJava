package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		int duracao = (inicio < fim) ? fim-inicio : 24-inicio+fim ;
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
        sc.close();
	}

}
