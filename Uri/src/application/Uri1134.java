package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1134 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0, gasolina = 0, diesel = 0;
		
		int entrada = sc.nextInt();
		
		while(entrada !=4) {
			switch(entrada) {
			case 1:			
				alcool +=1;
				break;
			case 2:
				gasolina +=1;
				break;
			case 3:
				diesel +=1;
				break;
			default:
				break;
			}
			entrada = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
        sc.close();
	}

}
