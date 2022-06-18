package utilitarios;

import entidades.AluguelQuartos;

public class funcQuartosOcupados {
	public static void lista(AluguelQuartos[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				System.out.println("Nr.Quarto: " + i);
				System.out.println(array[i].getNome());
				System.out.println(array[i].getEmail());
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}
		}
	}
}
