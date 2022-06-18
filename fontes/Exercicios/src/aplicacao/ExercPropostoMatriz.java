package aplicacao;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ExercPropostoMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		
		try {
			System.out.println("Informe as dimensoes da matriz:");
			System.out.print("D1: ");
			int d1 = sc.nextInt();
			System.out.print("D2: ");
			int d2 = sc.nextInt();
			
			int[][] matriz = new int[d1][d2];
			for(int i=0; i<matriz.length;i++) {
				for(int j=0; j<matriz[i].length; j++) {
					matriz[i][j] = gerador.nextInt(500);
				}
			}
			
			for(int i=0; i<matriz.length;i++) {
				System.out.println("");
				for(int j=0; j<matriz[i].length; j++) {
					if(matriz[i].length == matriz[i].length - 1) {
						System.out.print(matriz[i][j]);
					}else {
						System.out.print(matriz[i][j]+" | ");
					}
					
				}
			}
			System.out.println("");
			System.out.print("Informe a busca: ");
			int busca = sc.nextInt();
			
			for(int i=0; i<matriz.length;i++) {
				for(int j=0; j<matriz[i].length; j++) {
					if(matriz[i][j] == busca) {
						//obtem a posicao
						System.out.println("posição atual ["+i+"]["+j+"] = "+matriz[i][j]);
						//quais sao os limites da matriz
						if(i == 0 && j == 0) {
							System.out.println("Valor abaixo: "+matriz[i+1][j]);
							System.out.println("Valor a direita: "+matriz[i][j+1]);
						}
						if(i == matriz.length - 1 && !(j == matriz[i].length - 1)) {
							System.out.println("Valor acima: "+matriz[i-1][j]);
							System.out.println("Valor a direita: "+matriz[i][j+1]);
							
						}
						
						if(i == matriz.length - 1 && j == matriz[i].length - 1) {
							System.out.println("Valor a esquerda: "+matriz[i][j-1]);
							System.out.println("Valor acima: "+matriz[i-1][j]);
						}
						
						if(j == matriz[i].length - 1 && i == 0) {
							System.out.println("Valor abaixo: "+matriz[i+1][j]);
							System.out.println("Valor a esquerda: "+matriz[i][j-1]);
						}
						
						if(i > 0 && j < matriz[i].length - 1) {
							System.out.println("Valor acima: "+matriz[i-1][j]);
							System.out.println("Valor a direita: "+matriz[i][j+1]);
							System.out.println("Valor abaixo: "+matriz[i+1][j]);
						}
						
						if(i > 0 && j == matriz[i].length - 1) {
							System.out.println("Valor acima: "+matriz[i-1][j]);
							System.out.println("Valor a esquerda: "+matriz[i][j-1]);
							System.out.println("Valor abaixo: "+matriz[i+1][j]);
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
