package utilitarios;

import java.util.Random;
import java.util.Scanner;

import entidades.Funcionario;

public class funcCadastraFuncionario {
	
	static Scanner sc = new Scanner(System.in);
	
	public static Funcionario addCad() {
		Random random = new Random();
		int codigo = random.nextInt(100);
		//sc.nextLine();
		System.out.print("Nome do Funcionario: ");
		String nome = sc.nextLine();
		//sc.nextLine();
		System.out.print("Salario: ");
		double salario = sc.nextDouble();
		//sc.close();
		sc.nextLine();
		Funcionario f = new Funcionario(codigo, nome, salario);
		return f;
	}
}
