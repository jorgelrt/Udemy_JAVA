package aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


import entidades.Produtos;

public class ProgramaMenorPrecoMercado {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Produtos> lista = new ArrayList<Produtos>();
		List<Produtos> ListaBusca = new ArrayList<Produtos>();
		Boolean flag = true;
		int seq = 1;
		
		try {

			while(flag == true) {
				System.out.println("01 - Cadastrar Ofertas");
				System.out.println("02 - Buscar Produto");
				System.out.println("03 - Listar Produtos");
				System.out.print("Informe a opcao: ");
				int opc = sc.nextInt();
				
				switch (opc) {
				case 1:
					char continuar = 'S';
					while(continuar == 'S') {
						Integer idProd = seq;
						seq += 1;		
						sc.nextLine();
						System.out.print("Mercado: ");
						String nome = sc.nextLine();
						
						System.out.print("Descricao: ");
						String descricao = sc.nextLine();
						
						System.out.print("R$: ");
						Double preco = sc.nextDouble();
						
						lista.add(new Produtos(idProd, nome, descricao, preco));
						
						System.out.print("Continuar Cadastrando?: ");
						opc = sc.next().charAt(0);
						opc = Character.toUpperCase(opc);
						if(opc != 'S') {
							continuar = 'N';
						}
					}
					break;
				case 2:
					sc.nextLine();
					System.out.print("Informe o produto: ");
					String busca = sc.nextLine();
					for(Produtos p : lista) {
						if(p.getDescricao().equals(busca)) {
							//System.out.printf("%s - %s - R$ %.2f%n",p.getMercado(),p.getDescricao(),p.getPreco());
							ListaBusca.add(new Produtos(p.getId(),p.getMercado(),p.getDescricao(),p.getPreco()));
						}
					}
					Collections.sort(ListaBusca);
					for(Produtos p : ListaBusca) {
						System.out.println(p);
					}
					
					break;
				case 3:
					for(Produtos p : lista) {
						System.out.println(p);
					}
					break;
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
