package aplicacao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Employee;
import entidades.OutsourcedEmployee;

public class ProgramaEmployees {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> listaFunc = new ArrayList<Employee>();
		try {

			System.out.println("Informe a quantidade de funcionarios serão cadastrados");
			System.out.print(">>: ");
			int qtd = sc.nextInt();
			sc.nextLine();
			
			for(int i=0; i<qtd; i++) {
				System.out.println("Funcionario #"+(i+1));
				System.out.print("Terceirizado (S/N): ");
				char resp = sc.next().charAt(0);
				resp = Character.toUpperCase(resp);
				sc.nextLine();
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("horas: ");
				Integer hours = sc.nextInt();
				sc.nextLine();
				System.out.print("Valor da hora: ");
				Double valuePerHour = sc.nextDouble();
				sc.nextLine();
				if(resp == 'S') {
					listaFunc.add(new OutsourcedEmployee(name, hours, valuePerHour, 110.0));
				}else {
					listaFunc.add(new Employee(name, hours, valuePerHour));
				}
			}
			
			for(Employee func : listaFunc) {
				System.out.println("Nome: "+func.getName());
				System.out.println("Salario: "+String.format("%.2f", func.payment()));
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Erro de entrada de dados!");
		}
		finally {
			sc.close();
		}
		

	}

}
