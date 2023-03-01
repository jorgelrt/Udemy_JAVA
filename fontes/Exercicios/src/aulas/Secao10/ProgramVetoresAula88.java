package aulas.Secao10;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVetoresAula88 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0.0;
		double[] vetAltura;
		
		System.out.print("Informe quantas leituras serão realizadas: ");
		int loops = sc.nextInt();
		
		vetAltura = new double[loops];
		
		for(int i=0; i<loops; i++) {
			System.out.print("Informe a " + (i+1) +" altura: ");
			vetAltura[i] = sc.nextDouble();
			soma += vetAltura[i];
		}
		
		System.out.printf("Altura média: %.2f%n",soma/loops);
		
		sc.close();		

	}

}
