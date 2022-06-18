package aplicacao;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class ProgramaProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produto> listaProdutos = new ArrayList<Produto>();

		Boolean flag = true;

		int indice = 1;

		try {
			while (flag == true) {
				System.out.println("01 - cadastrar produtos");
				System.out.println("02 - entrada estoque");
				System.out.println("03 - saida estoque");
				System.out.println("04 - Listar produtos");

				System.out.print("Informe a opção desejada: ");
				int opc = sc.nextInt();
				Boolean incrementaChave = false;

				switch (opc) {
				case 1:
					incrementaChave = true;
					int codigo = indice;
					System.out.println("Cadastro de Produto");
					System.out.print("Nome: ");
					sc.nextLine();
					String nome = sc.nextLine();
					System.out.print("Preço: ");
					Double preco = sc.nextDouble();
					System.out.println("Quantidade: ");
					int qtd = sc.nextInt();
					listaProdutos.add(new Produto(codigo, nome, preco, qtd));
					break;
				case 2:
					System.out.println("Entrada de Dados");
					for (Produto p : listaProdutos) {
						System.out.println(p);
					}

					System.out.println("Informe o codigo e qtd de entrada");
					System.out.print("codigo: ");
					codigo = sc.nextInt();
					System.out.print("qtd para entrada: ");
					qtd = sc.nextInt();
					for (Produto p : listaProdutos) {
						if (p.getCodigo() == codigo) {
							p.entradaEstoque(qtd);
							System.out.println("Produto: " + p.getNome());
							System.out.printf("Estoque atualizado para: %d%n", p.getQtd());
						}

					}
					break;
				case 3:
					System.out.println("Saida de Dados");
					for (Produto p : listaProdutos) {
						System.out.println(p);
					}

					System.out.println("Informe o codigo e qtd de entrada");
					System.out.print("codigo: ");
					codigo = sc.nextInt();
					System.out.print("qtd para entrada: ");
					qtd = sc.nextInt();
					for (Produto p : listaProdutos) {
						if (p.getCodigo() == codigo) {
							p.saidaEstoque(qtd);
							System.out.println("Produto: " + p.getNome());
							System.out.printf("Estoque atualizado para: %d%n", p.getQtd());
						}

					}
					break;
				case 4:
					double totalGeral = 0;
					for (Produto p : listaProdutos) {
						System.out.println(p);
						totalGeral = p.valorTotal() + totalGeral;
						
					}
					System.out.println("Total investido: "+totalGeral);
					break;
				default:
					System.out.println("Opção inválida");
					break;
				}
				if (incrementaChave == true) {
					indice +=  1;
				}

				System.out.println("Deseja continuar?:(S/N)");
				char continuar = sc.next().charAt(0);
				continuar = Character.toUpperCase(continuar);
				if (continuar != 'S') {
					flag = false;
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
