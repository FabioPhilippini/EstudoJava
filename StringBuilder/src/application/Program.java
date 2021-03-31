package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comentario;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Comentario c1 = new Comentario("Traz minhas figures!!!!!");
		Comentario c2 = new Comentario("Quero meus mangás!!!! xD");
		Post p1 = new Post(sdf.parse("10/06/2016 13:15:30"),"Indo para o Japão","Começar o curso de linguas",50);
		p1.adicionarComentario(c1);
		p1.adicionarComentario(c2);
		
		System.out.println(p1);
       sc.close();
       }

}
