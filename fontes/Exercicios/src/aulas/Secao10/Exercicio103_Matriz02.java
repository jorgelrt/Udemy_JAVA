package aulas.Secao10;

import java.util.Scanner;

public class Exercicio103_Matriz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valorEsquerda ;
		int valorDireita ;
		int valorAcima ;
		int valorAbaixo ;
		
		System.out.print("Informe a qtde de linhas da matriz: ");
		int linhas = sc.nextInt();
		System.out.print("Informe a qtde de colunas da matriz: ");
		int colunas = sc.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		
		for(int i=0; i<linhas; i++) {
			for(int j=0; j<colunas; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Informe um número que pertence a matriz: ");
		int numero = sc.nextInt();
		
		String PosNum = identificaPosicao(numero, matriz);
		
		String[] linhaColuna = (PosNum.split(" "));
		
		int posLinha = Integer.parseInt(linhaColuna[0]);
		int posColuna = Integer.parseInt(linhaColuna[1]);
		/*
		System.out.println("linha: "+posLinha);
		System.out.println("coluna: "+posColuna);
		*/
		valorEsquerda = checkEsquerda(posLinha, posColuna, matriz);
		if( valorEsquerda != -1) {
			System.out.println("Número a esquerda: "+valorEsquerda);
		}
		
		valorDireita = checkDireita(posLinha, posColuna, matriz);
		if( valorDireita != -1) {
			System.out.println("Número a direita: "+valorDireita);
		}
		
		valorAcima = checkAcima(posLinha, posColuna, matriz);
		if(valorAcima != -1) {
			System.out.println("Número acima: "+valorAcima);
		}
		
		valorAbaixo = checkAbaixo(posLinha, posColuna, matriz);
		if(valorAbaixo != -1) {
			System.out.println("Número abaixo: "+valorAbaixo);
		}
		sc.close();
	}
	
	public static String identificaPosicao(int numero, int[][] mat) {
		String saida = null;
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == numero) {
					saida = (i+" "+j);
				}
			}
		}
		return saida;
	}
	
	public static int checkEsquerda(int linha, int coluna, int[][] mat) {
		int numEsquerda = -1;
		if(coluna > 0 && coluna < mat[linha].length) {
			numEsquerda = mat[linha][coluna-1];
		}
		return numEsquerda;
	}
	
	public static int checkDireita(int linha, int coluna, int[][] mat) {
		int numDireita = -1;
		if(coluna >= 0 && coluna < mat[linha].length-1) {
			numDireita = mat[linha][coluna+1];
		}
		return numDireita;
	}
	
	public static int checkAcima(int linha, int coluna, int[][] mat) {
		int numAcima = -1;
		if(linha > 0 && linha < mat.length) {
			numAcima = mat[linha - 1][coluna];
		}
		return numAcima;
	}
	
	public static int checkAbaixo(int linha, int coluna, int[][]mat) {
		int numAbaixo = -1;
		if(linha >= 0 && linha < mat.length-1) {
			numAbaixo = mat[linha+1][coluna];
		}
		return numAbaixo;
	}

}
