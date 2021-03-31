package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri1153 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int fat = 1;
		for (int i = 1; i <= num; i++) {
			fat *= i;
		}
		System.out.println(fat);
        sc.close();
	}

}
