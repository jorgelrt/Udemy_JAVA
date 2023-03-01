package aulas.Secao10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio90_MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantas leituras serão realizadas: ");
		int qtdeLeituras = sc.nextInt();
		sc.nextLine();
		int[] vetorIdade = new int[qtdeLeituras];
		String[] vetorNome = new String[qtdeLeituras];
		
		for(int i=0; i<qtdeLeituras; i++) {
			System.out.printf("Informe o nome da %d pessoa: ",(i+1));
			vetorNome[i] = sc.nextLine();
			System.out.printf("Informe a idade da %d pessoa: ",(i+1));
			vetorIdade[i] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.printf("%nA pessoa mais velha é %s",vetorNome[MaiorIdade(vetorIdade)]);
		sc.close();
	}
	
	public static int MaiorIdade(int[] vetor) {
		int Maior = 0;
		int indice = 0;
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i]>Maior) {
				Maior = vetor[i];
				indice = i;
			}
		}
		return indice;
	}

}
