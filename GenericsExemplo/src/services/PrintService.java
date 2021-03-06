package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	//vantagens de utilizar o generics: Reuso,TypeSafety,Perfomance. Uso comum: cole??es.
	private List<T> lista = new ArrayList<>();
    
	public void addValor(T valor) {
		lista.add(valor);
	}
	
	public T primeiro() {
		if(lista.isEmpty()) {
			throw new IllegalStateException("Lista vazia");
		}
		return lista.get(0);
	}
	
	public void imprimir() {
		System.out.print("[");
		if(!lista.isEmpty()) {
			System.out.print(lista.get(0));
		}
		for(int i =1;i<lista.size();i++) {
			System.out.print(", " + lista.get(i));
		}
		System.out.println("]");
	}
	
	
}
