package utilitarios;

import java.util.Scanner;

public class funcMenuFuncionario {

	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		System.out.println("01 - Cadastrar funcionario");
		System.out.println("02 - Aumento salarial individual");
		System.out.println("03 - Listar todos os funcionarios");
		System.out.println("04 - Listar funcionario");
		System.out.println("05 - sair");
		System.out.print(">>: ");
		int opc = sc.nextInt();
		return opc;
	}
}
