package utilitarios;

import entidades.AluguelQuartos;

public class funcQuartosLivres {
	public static void lista(AluguelQuartos[] array) {
		System.out.println("Quartos vagos:");
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				System.out.println("Nr.Quarto: " + i);
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}
		}
	}
}
