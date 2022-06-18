package aplicacao;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entidades.ContaBancaria;

public class ProgramaContaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<ContaBancaria> listaContas = new ArrayList<ContaBancaria>();
		Boolean continuar = true;

		Random gerador = new Random();
		
		try {
			
			while (continuar == true) {
				System.out.println("01 - Abrir conta corrente c/ deposito inicial");
				System.out.println("02 - Abrir conta corrente s/ deposito inicial");
				System.out.println("03 - Deposito em conta corrente");
				System.out.println("04 - Saque em conta corrente");
				System.out.println("05 - listar Contas Correntes");
				System.out.println("06 - Sair do programa");

				System.out.print("Informe a opção: ");
				int opc = sc.nextInt();
				sc.nextLine();
				switch (opc) {
				case 1:
					
					System.out.print("Nome: ");
					String nome = sc.nextLine();
					
					System.out.print("Deposito: ");
					double valor = sc.nextDouble();
					listaContas.add(new ContaBancaria(Math.abs(gerador.nextInt()), nome, valor));
					break;
				case 2:
					System.out.print("Nome: ");
					nome = sc.nextLine();
					listaContas.add(new ContaBancaria(Math.abs(gerador.nextInt()), nome));
					break;
				case 3:
					System.out.print("Informe o numero cc: ");
					int BuscaNrCc = sc.nextInt();
					System.out.print("Valor: ");
					valor = sc.nextDouble();
					for(ContaBancaria cb : listaContas) {
						if(cb.getNumeroConta() == BuscaNrCc) {
							cb.deposito(valor);
						}
					}
					System.out.println("Deposito efetuado no valor de: "+valor);
					break;
				case 4:
					System.out.print("Informe o numero cc: ");
					BuscaNrCc = sc.nextInt();
					System.out.print("Valor: ");
					valor = sc.nextDouble();
					for(ContaBancaria cb : listaContas) {
						if(cb.getNumeroConta() == BuscaNrCc) {
							cb.saque(valor);
						}
					}
					System.out.println("Saque efetuado no valor de: "+valor);
					break;
				case 5:
					for(ContaBancaria cb : listaContas) {
						System.out.println(cb);
					}
					break;
				case 6:
					continuar = false;
					System.out.println("Programa encerrado");
					break;
				default:
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
