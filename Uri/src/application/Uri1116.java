package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1116 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int teste = sc.nextInt();
		
		for(int i =0; i<teste;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(y ==0) {
				System.out.println("divisão impossivel");
			}
			else{
				double div = (double) x/y;
				System.out.printf("%.1f%n",div);
			}
			
		}
		
         sc.close();
	}

}
