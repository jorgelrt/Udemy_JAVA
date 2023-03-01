package aulas.Secao10;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVetoresAula89 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0.0;
		int loops = 0;
		
		
		System.out.print("Informe quantas leituras serão realizadas: ");
		loops = sc.nextInt();
		sc.nextLine();
		Produto[] vetProd = new Produto[loops] ;
		
		for(int i=0; i<vetProd.length; i++) {
			System.out.println("Produto "+(i+1));
			System.out.print("Descricao: ");
			String descricao = sc.nextLine();
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			soma += preco;
			sc.nextLine();
			vetProd[i] = new Produto(descricao,preco);
			
		}
		System.out.println("");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
		for(int i=0; i<vetProd.length; i++) {
			System.out.printf("%s - ",vetProd[i].getDescricao());
			System.out.printf("%.2f%n",vetProd[i].getPreco());
		}
		System.out.println("");
		System.out.printf("Media de preços dos produtos %.2f%n",soma/vetProd.length);
	}

}
