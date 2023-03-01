package aulas.Secao10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio90_NumerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantas leituras serão realizadas: ");
		int qtdeLeituras = sc.nextInt();
		
		int[] vetor = new int[qtdeLeituras];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite o "+(i+1)+" numero: ");
			vetor[i] = sc.nextInt();
		}
		System.out.print("Numeros pares informados:");
		for(int i=0; i<vetor.length;i++) {
			if(vetor[i]%2 == 0) {
				System.out.print(vetor[i]+" ");
			}
		}
		int totalPares = ContaPares(vetor);
		System.out.printf("%nTotal informado de números pares: %d",totalPares);
		sc.close();
	}
	
	public static int ContaPares(int[] vetor) {
		int totalPares = 0;
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i]%2 == 0) {
				totalPares++;
			}
		}
		return totalPares;
	}

}
