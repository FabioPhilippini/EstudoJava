package application;

public class Program {

	public static void main(String[] args) {
		String name = "teste";
		System.out.println(Maiuscula(name));
        
	}
	
	public static String Maiuscula(String x) {
		if(x == null || x.isBlank()) {
			return "Variável vazia";
		}
		else {
			return x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
		}
	}

}
