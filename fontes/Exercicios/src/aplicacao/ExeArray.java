package aplicacao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExeArray {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Informe o tamanho do vetor: ");
			int tam = sc.nextInt();
			double soma = 0.0;
			
			double[] vetor = new double[tam];
			
			for(int i=0; i<vetor.length; i++) {
				System.out.print("Informe a "+(i+1)+" altura: ");
				vetor[i] = sc.nextDouble();
				soma += vetor[i];
			}
			System.out.printf("Altura média: %.2f",(double)soma/tam);
		
		}
		catch(InputMismatchException e) {
			System.out.println("Erro de entrada de dados!");
		}
		finally {
			sc.close();
		}
		
	}
}
