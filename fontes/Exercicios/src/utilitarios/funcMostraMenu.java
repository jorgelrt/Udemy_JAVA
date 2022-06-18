package utilitarios;

import java.util.Scanner;

public class funcMostraMenu {
	static Scanner sc = new Scanner(System.in);

	public static int show() {
		System.out.println("01 - Cadastrar reservas");
		System.out.println("02 - Listar quartos ocupados");
		System.out.println("03 - Listar quartos livres");
		System.out.println("04 - finalizar o programa");

		System.out.print("Informe a opção: ");
		int opc = sc.nextInt();
		sc.nextLine();
		
		return(opc);

	}
}
