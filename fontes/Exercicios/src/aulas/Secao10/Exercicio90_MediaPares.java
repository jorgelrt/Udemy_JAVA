package aulas.Secao10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio90_MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantas leituras serão realizadas: ");
		int qtdeLeituras = sc.nextInt();
		
		int[] vetor = new int[qtdeLeituras];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.printf("Informe %d valor: ",(i+1));
			vetor[i] = sc.nextInt();
		}
		if(MediaPares(vetor) != 0) {
			System.out.printf("Média dos números pares: %d",MediaPares(vetor));
		}
		
		sc.close();
	}
	
	public static int MediaPares(int[] vetor) {
		int	Media = 0;
		int contadorPar = 0;
		int contadorImpar = 0;
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i]%2 == 0) {
				Media += vetor[i];
				contadorPar++;
			}else {
				contadorImpar++;
			}
		}
		if(contadorImpar == vetor.length) {
			System.out.println("Nenhum número par foi localizado");
			return 0;
		}else {
			return Media/contadorPar;
		}
		
	}

}
