package aulas.Secao10;

import java.util.Scanner;

public class Exercicio102_Matriz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		System.out.print("Informe o tamanho da matriz: ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("");
		System.out.print("Diagonal principal: ");
		for(int i=0; i<n; i++) {
			System.out.print(matriz[i][i]+" ");
		}
		System.out.println("");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(matriz[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.printf("Total de números negativos: %d",cont);
		sc.close();
	}

}
