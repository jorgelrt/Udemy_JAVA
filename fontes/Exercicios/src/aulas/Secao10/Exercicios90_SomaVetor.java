package aulas.Secao10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios90_SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantos números serão lidos: ");
		int totNum = sc.nextInt();
		
		double[] vetNumeros = new double[totNum];
		
		for(int i=0; i<vetNumeros.length; i++) {
			System.out.print("Informe o "+(i+1)+" número: ");
			vetNumeros[i] = sc.nextDouble();
		}
		
		System.out.printf("Soma: %.2f%n",Somatorio(vetNumeros));
		System.out.printf("Média: %.2f%n",(Somatorio(vetNumeros)/vetNumeros.length));
		
		sc.close();
	}
	
	public static double Somatorio(double[] vetor){
		double somatorio = 0.0;
		for (int i=0; i<vetor.length; i++) {
			somatorio += vetor[i];
		}
		return somatorio;
	}

}
