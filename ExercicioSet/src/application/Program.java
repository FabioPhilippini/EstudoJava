package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Set por conta que não vai contar aluno repetido no mesmo curso
		// HashSet porque é a busca mais rápida e não vai ser preciso retornar os valores de forma ordenada na questão.
		// TreeSet seria mais lento mas retornaria de forma ordenada
		// LinkedHashSet tem uma velocidade intermediária e os elementos seriam ordenados na ordem em que foram adicionados
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("Quantos alunos no curso A?: ");
		int alunosNum = sc.nextInt();
		
		for(int i = 0; i<alunosNum;i++) {		
			int cod = sc.nextInt();
			a.add(cod);
		}
		
		System.out.print("Quantos alunos no curso B?: ");
		alunosNum = sc.nextInt();
		
		for(int i = 0; i<alunosNum;i++) {		
			int cod = sc.nextInt();
			b.add(cod);
		}
		
		System.out.print("Quantos alunos no curso C?: ");
		alunosNum = sc.nextInt();
		
		for(int i = 0; i<alunosNum;i++) {		
			int cod = sc.nextInt();
			c.add(cod);
		}
		
		// Como a questão pede o número de alunos se usa o addAll(other) que é uma operação de união adicionando ao A os valores de B e C sem repetir valores
		// retainAll(other) faria uma interseção, ou seja, remove do conjunto elementos que não se encontram em other
		// removeAll(other) é uma operação de diferença, remove do conjunto os elementos que se encontram em other
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total de alunos: " + total.size());
		
		

		sc.close();
	}

}
