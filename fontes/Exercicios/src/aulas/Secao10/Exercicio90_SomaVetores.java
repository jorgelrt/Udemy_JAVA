package aulas.Secao10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio90_SomaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantas leituras serão realizadas: ");
		int qtdeLeituras = sc.nextInt();
		
		int[]vetorA = new int[qtdeLeituras];
		int[]vetorB = new int[qtdeLeituras];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.printf("Leitura %d vetorA: ",(i+1));
			vetorA[i] = sc.nextInt();
		}
		System.out.println("");
		for(int i=0; i<vetorA.length; i++) {
			System.out.printf("Leitura %d vetorB: ",(i+1));
			vetorB[i] = sc.nextInt();
		}
		System.out.println("Soma dos vetores");
		for(int i=0; i<qtdeLeituras; i++) {
			System.out.println(vetorA[i]+vetorB[i]);
		}
		sc.close();
	}

}
