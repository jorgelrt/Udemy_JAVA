package aplicacao;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> listaFunc = new ArrayList<Funcionario>();
		double perc = 0.0;
		Boolean	continuar = true;
		Integer indice = 0;
		
		try {
			while(continuar == true) {
				
				System.out.println("01 - Cadastrar novo funcionario");
				System.out.println("02 - Aumentar salario");
				System.out.println("03 - Mostrar dados");
				
				System.out.print("Informe a opção: ");
				int opc = sc.nextInt();
				
				switch (opc) {
				case 1:
						indice += indice;
						System.out.print("Nome: ");
						String nome = sc.nextLine();
						sc.nextLine();
						System.out.print("Salario: ");
						Double salario = sc.nextDouble();
						System.out.print("Taxa: ");
						Double taxa = sc.nextDouble();
						listaFunc.add(new Funcionario(indice, nome, salario, taxa));
						break;
				case 2:
						for(Funcionario f : listaFunc) {
							System.out.println(f);
						}
						System.out.print("Informe o código do funcionario: ");
						Integer codigo = sc.nextInt();
						for(Funcionario f : listaFunc) {
							if(f.getCodigo() == codigo) {
								f.aumentaSal(perc);
							}
						}
						break;
				case 3:
						for(Funcionario f : listaFunc) {
							System.out.println(f);
						}
						break;
				default:
					System.out.println("Opção inexistente!");
				}
				
				
				System.out.print("Deseja continuar?(S/N): ");
				char opc1 = sc.next().charAt(0);
				opc1 = Character.toUpperCase(opc1);
				if(opc1 == 'N') {
					continuar = false;
				}
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
