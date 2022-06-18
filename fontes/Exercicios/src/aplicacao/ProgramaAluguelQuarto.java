package aplicacao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entidades.AluguelQuartos;

public class ProgramaAluguelQuarto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Boolean continuar = true;
		AluguelQuartos[] vagasQuartos = new AluguelQuartos[10];//criação do vetor tipo AluguelQuartos
		int qtdReservas = 0;

		try {
			while (continuar == true) {
				System.out.println("01 - Informar a quantidade de reservas");
				System.out.println("02 - Cadastrar reservas");
				System.out.println("03 - Listar reservas ocupadas");
				System.out.println("04 - Listar reservas livres");
				System.out.println("05 - finalizar o programa");

				System.out.print("Informe a opção: ");
				int opc = sc.nextInt();
				sc.nextLine();
				switch (opc) {
				case 1:
					System.out.print("Qtd reservas: ");
					qtdReservas = sc.nextInt();
					sc.nextLine();
					break;
				case 2:
					if (qtdReservas == 0) {
						System.out.println("Favor informar a quantidade de reservas a serem feitas - opção 01");
					} else {
						for (int i = 0; i < qtdReservas; i++) {
							System.out.print("Nome: ");
							String nome = sc.nextLine();
							// sc.nextLine();
							System.out.print("Email: ");
							String email = sc.nextLine();
							// sc.nextLine();
							System.out.print("Nr.Quarto: ");
							int nrQuarto = sc.nextInt();
							sc.nextLine();
							vagasQuartos[nrQuarto] = new AluguelQuartos(nome, email);
						}
						qtdReservas = 0;
					}
					break;
				case 3:
					for (int i = 0; i < vagasQuartos.length; i++) {
						if (vagasQuartos[i] != null) {
							System.out.println("Nr.Quarto: " + i);
							System.out.println(vagasQuartos[i].getNome());
							System.out.println(vagasQuartos[i].getEmail());
							System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						}
					}
					break;
				case 4:
					System.out.println("Quartos vagos:");
					for (int i = 0; i < vagasQuartos.length; i++) {
						if (vagasQuartos[i] == null) {
							System.out.println("Nr.Quarto: " + i);
							System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						}
					}

					break;
				case 5:
					continuar = false;
					System.out.println("Programa finalizado");
					break;
				default : 
					System.out.println("Opcao invalida!");
				
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
