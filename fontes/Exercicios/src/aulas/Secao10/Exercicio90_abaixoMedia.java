package aulas.Secao10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio90_abaixoMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantas leituras serão realizadas: ");
		int qtdeLeituras = sc.nextInt();
		
		double[] vetor = new double[qtdeLeituras];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.printf("Informe o %d valor: ",(i+1));
			vetor[i] = sc.nextDouble();
		}
		
		double media = MediaArit(vetor);
		System.out.printf("%nMedia do vetor: %.3f%n",media);
		System.out.print("Elementos abaixo da média: ");
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]<media) {
				System.out.printf("%.1f ,",vetor[i]);
			}
		}
		
		sc.close();
	}
	
	public static double MediaArit(double[] vetor) {
		double somaTotal = 0.0;
		for(int i=0;i<vetor.length;i++) {
			somaTotal += vetor[i];
		}
		return somaTotal/vetor.length;
	}

}
