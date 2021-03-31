package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Map<String,Integer> votos = new TreeMap<>();
		
		System.out.print("Caminho do arquivo: ");
		//lê o caminho do arquvivo
		String path = sc.nextLine();
		
		//abre o arquivo e lê.
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String linha = br.readLine();
			
			//enquanto houverem linhas a serem lidas o programa vai rodar o bloco
			while(linha != null) {
				
				//vai separar as linhas em campos tendo a virgula como separador
				String [] campos = linha.split(",");
				String nome = campos[0];
				
				//como está em string o número de votos tem que ter um parse
				int contador = Integer.parseInt(campos[1]);
				
				//se dentro do map votos tiver uma chave nome
				if(votos.containsKey(nome)) {
					
					//vai recuperar o valor dentro da chave nome
					int votosMomento = votos.get(nome);
					
					//vai adicionar a chave nome o valor de contador + votosMomento
					votos.put(nome, contador + votosMomento);
				}
				else {
					votos.put(nome, contador);
				}
				linha = br.readLine();
			}
			for(String chave : votos.keySet()) {
				System.out.println(chave + ": " + votos.get(chave));
			}
		}
		catch(IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}
			
		sc.close();
	}

}
