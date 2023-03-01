package aulas.Secao8;

import java.util.Locale;
import java.util.Scanner;
import aulas.Secao8.Funcionario;

public class ExerAula69_Funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Name: ");
		func.nome = sc.nextLine();
		System.out.print("Gross Salary: ");
		func.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();
		
		System.out.println(func);
		
		System.out.print("Witch percentage to increase salary: ");
		func.IncreaseSalary(sc.nextDouble());
		
		System.out.println(func);
		
	}

}
