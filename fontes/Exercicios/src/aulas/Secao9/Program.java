package aulas.Secao9;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Descricao do produto: ");
		String nome = sc.nextLine();
		System.out.print("Informe o preco: ");
		double preco = sc.nextDouble();
		System.out.print("Informe a quantidade: ");
		int qtde = sc.nextInt();
		
		Produto p = new Produto(nome, preco, qtde);
		
		
		System.out.println("Dados do produto: "+ p);
		
		System.out.print("Entrada de produtos no estoque: ");
		p.addItem(sc.nextInt());
		
		System.out.println("Dados após entrada no estoque: "+ p);
		
		System.out.print("Saida de produtos do estoque: ");
		
		p.remItem(sc.nextInt());
		
		System.out.println("Total em estoque: "+ p);
		
		//sobrecarga - qdo há mais de um construtor, porém com parâmetros diferentes
		sc.nextLine();
		System.out.print("Descricao de um novo produto: ");
		nome = sc.nextLine();
		System.out.print("Informe o preco: ");
		preco = sc.nextDouble();
		sc.nextLine();
		Produto p2 = new Produto(nome, preco);
		
		System.out.println("Novo produto informado: "+p2);
		
		//Após o encapsulamento não há como acessar direto aos atributos
		System.out.println("Alterando o nome utilizando setNome");
		System.out.print("Nova descricao do produto  "+p2.getNome()+" : ");
		p2.setNome(sc.nextLine());
		System.out.println("Alteração do novo produto inserido: "+p2);
		//acessando e alterando o preco diretamente no atributo
		System.out.print("Preço atual "+String.format("%.2f", p2.getPreco())+" será alterado para: ");
		p2.setPreco(sc.nextDouble());
		System.out.println("Preço alterado: "+p2);
		sc.close();

	}

}
