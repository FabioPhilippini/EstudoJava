package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1044 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		String div = (x%y==0 || y%x==0) ? "São Multiplos":"Nao sao Multiplos";
		System.out.println(div);	
		
        sc.close();
	}

}
