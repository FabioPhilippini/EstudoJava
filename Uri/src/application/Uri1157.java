package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1157 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int teste = sc.nextInt();
		
		for(int i =1;i<=teste;i++) {
			if(teste %i ==0) {
				System.out.println(i);
			}
		}
        sc.close();
	}

}
