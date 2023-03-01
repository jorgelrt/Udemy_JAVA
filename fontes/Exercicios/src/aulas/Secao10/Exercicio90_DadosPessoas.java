package aulas.Secao10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio90_DadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantas leituras serão realizadas: ");
		int qtdeLeituras = sc.nextInt();
		
		char[] vetorGenero = new char[qtdeLeituras];
		double[] vetorAltura = new double[qtdeLeituras];
		
		for(int i=0; i<qtdeLeituras; i++) {
			System.out.printf("Altura da %d pessoa: ",(i+1));
			vetorAltura[i] = sc.nextDouble();
			System.out.printf("Genero da %d pessoa: ",(i+1));
			vetorGenero[i] = sc.next().charAt(0);
		}
		
		System.out.printf("Menor altura %.2f%n",MenorAltura(vetorAltura));
		System.out.printf("Maior altura %.2f%n",MaiorAltura(vetorAltura));
		System.out.printf("Media das alturas %.2f%n",MediaAlturas(vetorAltura));
		System.out.printf("Número de Homens %d%n",TotalHomens(vetorGenero));
		sc.close();
	}
	
	public static double MaiorAltura(double[] vetor) {
		double Maior = 0.0;
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i]>Maior) {
				Maior = vetor[i];
			}
		}
		return Maior;
	}

	public static double MenorAltura(double[] vetor) {
		double Menor = 10.0;
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i]<Menor) {
				Menor = vetor[i];
			}
		}
		return Menor;
	}
	
	public static double MediaAlturas(double[] vetor) {
		double Media = 0.0;
		for(int i=0; i<vetor.length; i++) {
			Media += vetor[i];
		}
		return Media/vetor.length;
	}
	
	public static int TotalHomens(char[] vetor) {
		int contador = 0;
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] == 'M') {
				contador++;
			}
		}
		return contador;
	}
}
