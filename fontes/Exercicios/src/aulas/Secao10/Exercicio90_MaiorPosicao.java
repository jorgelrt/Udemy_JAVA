package aulas.Secao10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio90_MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe quantas leituras serão realizadas: ");
		int qtdeLeituras = sc.nextInt();
		
		int[] vetor = new int[qtdeLeituras];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.printf("Informe o %d número: ",(i+1));
			vetor[i] = sc.nextInt();
		}
		System.out.printf("%nMaior número informado: %d%n",MaiorNum(vetor));
		System.out.printf("Posição do maior valor: %d%n",LocalizaIndice(MaiorNum(vetor),vetor));
		sc.close();
	}
	public static int MaiorNum(int[] vet) {
		int MaiorNum = 0;
		for(int i=0; i<vet.length; i++) {
			if(MaiorNum < vet[i]) {
				MaiorNum = vet[i];
			}
		}
		return MaiorNum;
	}
	
	public static int LocalizaIndice(int valor, int[]vet) {
		int indice = -1;
		for(int i=0; i<vet.length;i++) {
			if(vet[i] == valor) {
				indice = i;
			}
		}
		return indice;
	}

}
