package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		int qntd = sc.nextInt();
		
		double total;		
		if(cod == 1) {		
			total = qntd * 4.0;
		}
		else if(cod == 2) {
			total = qntd * 4.5;
		}
		else if(cod == 3) {
			total = qntd * 5.0;
		}
		else if(cod == 4) {
			total = qntd * 2.0;
		}
		else{
			total = qntd*4.00;
		}	
		System.out.printf("Total: R$ %.2f%n",total);
		
		sc.close();
	}

}
