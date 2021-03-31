package util;

public class ConversorMoeda {

	public static final double IOF = 0.06;
	
	
	public static double conversao(double valor,double quantia) {	
		
		return valor * quantia * (1+IOF);
	}
	
}
