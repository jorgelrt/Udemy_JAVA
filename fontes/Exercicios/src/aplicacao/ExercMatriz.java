package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Informe dimensao da matriz: ");
			int n = sc.nextInt();
			
			int[][] matriz = new int[n][n];
			
			for(int i=0; i<matriz.length; i++) {
				for(int j=0; j<matriz[i].length; j++) {
					System.out.print("Informe um numero para posicao["+i+"]["+j+"] : ");
					matriz[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("IMprimindo a matriz");
			for(int i=0; i<n; i++) {
				System.out.println("");
				for(int j=0; j<n; j++) {
					if(j == n-1) {
						System.out.print(matriz[i][j]);
					}else {
					System.out.print(matriz[i][j]+" | ");
					}
				}
			}
			System.out.println("");
			System.out.println("");
			System.out.println("Impressao da diagonal principal");
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(i == j) {
						if(j == n-1) {
							System.out.print(matriz[i][j]);
						}else {
							System.out.print(matriz[i][j]+" | ");
						}
						
					}
				}
			}
			System.out.println("");
			System.out.println("");
			System.out.println("Impressao dos numero negativos");
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
						if(matriz[i][j] < 0) {
							if(j < n-1) {
								System.out.println(matriz[i][j]);
							}else {
								System.out.println(matriz[i][j]+" | ");
							}
							
						}
					}
				}
		}
		catch(InputMismatchException e) {
			System.out.println("Erro de entrada de dados!");
		}
		finally {
			sc.close();
		}
		
		
	}

}
