package aplicacao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entidades.Produto;

public class ExeArrayReferencia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// List<Produto> listaProduto = new ArrayList<Produto>();
		Boolean continuar = true;
		//int tam = 0;
		Random gerador = new Random();
		

		try {
			System.out.print("Informe a qtd de produtos a ser inseridos: ");
			int qtd = sc.nextInt();
			sc.nextLine();
			Produto[] arrayProduto = new Produto[qtd]; //instanciação do vetor tipo produto
			while (continuar == true) {
				System.out.println("01 - carregar array");
				System.out.println("02 - mostrar dados array");
				System.out.println("03 - finalizar programa");
	
				System.out.print("Informe a opção: ");
				int opc = sc.nextInt();
				sc.nextLine();
				switch (opc) {
				case 1:
					for (int i = 0; i < arrayProduto.length; i++) {
						//int indice = gerador.nextInt();
						System.out.print("Nome: ");
						// sc.nextLine();
						String nome = sc.nextLine();
						System.out.print("Preco: ");
						double preco = sc.nextDouble();
						System.out.print("Qtd: ");
						qtd = sc.nextInt();
						sc.nextLine();
						//inserindo valores no vetor tipo Produto - Heap(vetor) + ponteiro p objeto instanciado
						arrayProduto[i] = new Produto(Math.abs(gerador.nextInt()), nome, preco, qtd);
					}
					break;
				case 2:
					for (int i = 0; i < arrayProduto.length; i++) {
						System.out.print("Codigo: " + arrayProduto[i].getCodigo() + " | " + arrayProduto[i].getNome()
								+ " | R$ " + arrayProduto[i].getPreco() + " | qtd: " + arrayProduto[i].getQtd());
						System.out.println("");
					}
					break;
				case 3:
					continuar = false;
					System.out.println("Execução encerrada");
					break;
				default:
					System.out.println("Opção inválida");
	
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
