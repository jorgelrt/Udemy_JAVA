package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Produto> listaProdutos = new ArrayList<>();
		/*
		 * obtendo o nome da classe
		 */
		Produto produto = new Produto(4, "PC", 1200.00, 1);
		System.out.println("Nome da classe: "+produto.getClass().getName().substring(produto.getClass().getName().toString().indexOf('.')+1));
		System.out.println("");
		/*
		 * função lambda
		 */
		listaProdutos.add(new Produto(1, "Notebook Dell", 4500.00, 1));
		listaProdutos.add(new Produto(2, "Smart TV 40", 1900.00, 1));
		listaProdutos.add(new Produto(3, "Caixa de Som bluetooth", 890.00, 1));
		listaProdutos.add(produto);
		
		System.out.printf("Total de itens na lista de desejos: %d%n",listaProdutos.size());
		System.out.println("");
		for(Produto p : listaProdutos) {
			System.out.println(p);
		}
		double TotalInvestido = 0; 
		for(Produto p : listaProdutos) {
			TotalInvestido += produto.getPreco();
		}
		System.out.printf("Total a investir R$: %.2f%n",TotalInvestido);
		TotalInvestido = 0.0;
		
		System.out.print("Informe o codigo p remoção da lista: ");
		int busca = sc.nextInt();
		listaProdutos.removeIf(x -> x.getCodigo() == busca);
		
		System.out.printf("Total de itens na lista de desejos: %d%n",listaProdutos.size());
		System.out.println("");
		for(Produto p : listaProdutos) {
			System.out.println(p);
		}
 
		for(Produto p : listaProdutos) {
			TotalInvestido += produto.getPreco();
		}
		System.out.printf("Total a investir R$: %.2f%n",TotalInvestido);
		/*
		 * localização e remoção
		 */
		System.out.println("Buscando codigo 3");
		System.out.println("");
		for(Produto p : listaProdutos) {
			if(p.getCodigo() == 3) {
				System.out.println(p);
			}
		}
		
		/*
		 * criando uma nova lista 
		 */
		List<String> listaAmigos = new ArrayList<String>();
		listaAmigos.add("Camille");
		listaAmigos.add("Karen");
		listaAmigos.add("Camila");
		for(String x : listaAmigos) {
			System.out.println(x);
		}
		
		sc.nextLine();
		System.out.print("Informe um nome p mostrar em qual indice esta: ");
		String inimiga = sc.nextLine();
		if(listaAmigos.indexOf(inimiga) == -1) {
			System.out.println("Inexistente");
		}else {
			System.out.println(listaAmigos.indexOf("Camila está no indice: "+inimiga));
		}
		
		sc.close();
	}

}
