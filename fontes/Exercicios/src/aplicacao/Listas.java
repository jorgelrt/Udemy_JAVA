package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		lista.add("Jorge");
		lista.add("Camille");
		lista.add("Karen");
		lista.add(1, "Humberto");
		
		for(String x : lista) {
			System.out.println(x);
		}
		
		lista.remove(1);
		lista.removeIf(x -> x.charAt(0) == 'J');
		
		
		System.out.println("XXXXXXXXXXXXXXXX");
		
		for(String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("XXXXXXXXXXXXXXXX");
		
		System.out.println("Index da Karen: "+lista.indexOf("Karen"));
		System.out.println("Index da Karen: "+lista.indexOf("Jorge"));
		
		List<String> lista2 = lista.stream().filter(x -> x.charAt(0) == 'K' ).collect(Collectors.toList());
		
		System.out.println("XXXXXXXXXXXXXXXX");
		System.out.println("Lista filtrada:");		
		for(String x : lista2) {
			System.out.println(x);
		}
		
		System.out.println("XXXXXXXXXXXXXXXX");
		
		String nome = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nome);
	
	}
	

}
