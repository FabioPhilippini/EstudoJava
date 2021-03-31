package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1143 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int teste =sc.nextInt();
		
		for(int i =1; i<=teste;i++) {
			/*
			int primeiro = i;
			int segundo = i*i;
			int terceiro = i*i*i;
			System.out.printf("%d %d %d%n",primeiro,segundo,terceiro);
			*/
			//forma simplificada
			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3) );
		}
      sc.close();
	}

}
