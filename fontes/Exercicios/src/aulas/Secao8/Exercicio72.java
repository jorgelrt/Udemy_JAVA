package aulas.Secao8;

import java.util.Locale;
import java.util.Scanner;

import aulas.Secao8.util.ConvercaoAtual;

public class Exercicio72 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a cotacao do Dia: ");
		double cotacaoDia = sc.nextDouble();
		
		System.out.print("Informe o valor em reais para conversao: ");
		double totalReais = sc.nextDouble();
		
		System.out.printf("Valor convertido em U$5.16: %.2f%n",ConvercaoAtual.dollar(totalReais, cotacaoDia));
		sc.close();

	}

}
