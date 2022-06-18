package aplicacao;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class TrianguloComOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double maior = 0;
		List<Triangulo> lista = new ArrayList<>();
		
		//Triangulo T = new Triangulo();
		
		try {
			System.out.println("Informe quantos triangulos serão calculados");
			System.out.print(">>: ");
			int qtde = sc.nextInt();

			for (int i=0; i<qtde; i++) { 
				System.out.printf("Informe os dados do %dº triangulo: %n",i+1);
				/*
				T.setA(sc.nextDouble());
				T.setB(sc.nextDouble());
				T.setC(sc.nextDouble());
				double p = T.CalcP();
				*/
				double A = sc.nextDouble();
				double B = sc.nextDouble();
				double C = sc.nextDouble();
				lista.add(new Triangulo(A,B,C));
				//System.out.printf("Triangulo %d Area: %.2f%n%n",i+1, T.CalcArea());
				
			}
			 System.out.println("");
			for(int i=0; i< lista.size(); i++) {
				 if(lista.get(i).CalcArea() > maior)  {
					 maior = lista.get(i).CalcArea();
				 }
			 }
			
			 for(Triangulo t : lista) {
				 System.out.printf("Triangulo %d = %.2f%n",lista.indexOf(t),t.CalcArea());
			 }
			
			 System.out.println("");
			 System.out.printf("A maior area e: %.2f",maior);
			 

		}
		catch(InputMismatchException e) {
			System.out.println("Erro de entrada de dados!");
		}
		finally {
			sc.close();
		}
		

	}
}
