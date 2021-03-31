package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Set por conta que n�o vai contar aluno repetido no mesmo curso
		// HashSet porque � a busca mais r�pida e n�o vai ser preciso retornar os valores de forma ordenada na quest�o.
		// TreeSet seria mais lento mas retornaria de forma ordenada
		// LinkedHashSet tem uma velocidade intermedi�ria e os elementos seriam ordenados na ordem em que foram adicionados
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
		
		// Como a quest�o pede o n�mero de alunos se usa o addAll(other) que � uma opera��o de uni�o adicionando ao A os valores de B e C sem repetir valores
		// retainAll(other) faria uma interse��o, ou seja, remove do conjunto elementos que n�o se encontram em other
		// removeAll(other) � uma opera��o de diferen�a, remove do conjunto os elementos que se encontram em other
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total de alunos: " + total.size());
		
		

		sc.close();
	}

}
