package application;

import java.util.Locale;
import java.util.Scanner;

import entitie.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("Média final = " + aluno.media());
		if(aluno.media() >= 60.00) {
			System.out.println("Aprovado");
		}
		else {
			double pontosFaltando = 60 - aluno.media();
			System.out.println("Reprovado");
			System.out.println("Faltaram " + pontosFaltando + " pontos");
		}
		
		sc.close();

	}

}
