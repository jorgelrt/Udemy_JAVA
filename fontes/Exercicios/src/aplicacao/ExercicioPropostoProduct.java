package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Product2;
import exceptions.QtdeLimiteException;

public class ExercicioPropostoProduct {
	//Fun??o ENTERPOINT MAIN
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Produto: ");
			String nome = sc.nextLine();
			
			System.out.print("Preco: ");
			Double preco = sc.nextDouble();
			
			System.out.print("Qtde: ");
			int qtde = sc.nextInt();
			
			Product2 p1 = new Product2(nome, preco, qtde);
			
			System.out.println(p1);
			
			System.out.print("Entre com n? adicionados de produtos: ");
			p1.addProducts(sc.nextInt());
			
			System.out.println(p1);
			
			System.out.print("Entre com n? saida de produtos: ");
			p1.removeProducts(sc.nextInt());
			
			System.out.println(p1);
		}catch(QtdeLimiteException e) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			sc.close();
		}
	}

}
