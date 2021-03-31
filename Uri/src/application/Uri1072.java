package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1072 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int in = 0, out = 0;
		int teste = sc.nextInt();
		
		for(int i =0; i<teste;i++) {
			int num = sc.nextInt();
			if(num>=10 && num<=20) {
				in +=1;
			}
			else {
				out +=1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}

}
