package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Employee2;

public class Employee2Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do funcionario: ");
		String nome = sc.nextLine();
		
		System.out.print("Salario bruto: ");
		double salario = sc.nextDouble();
		
		System.out.print("Impostos: ");
		double impostos = sc.nextDouble();
		
		Employee2 e = new Employee2(nome, salario, impostos);
		
		System.out.printf("Funcionario: %s, $ %.2f%n",e.getNome(), e.salarioLiquido());
	
		System.out.print("Informe o percentual de aumento salarial: ");
		e.aumentoSalarial(sc.nextDouble());
		
		System.out.println(e);
		
		sc.close();

	}

}
