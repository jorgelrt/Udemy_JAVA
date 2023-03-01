package aulas.Secao10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio90_Aprovados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Informe quantas leituras serão realizadas: ");
		int qtdeLeituras = sc.nextInt();
		sc.nextLine();
		
		String[] vetorAlunos = new String[qtdeLeituras];
		double[] vetorSemestre1 = new double[qtdeLeituras];
		double[] vetorSemestre2 = new double[qtdeLeituras];
		
		
		for(int i=0; i<qtdeLeituras; i++) {
			System.out.printf("Dados do %d aluno%n",(i+1));
			System.out.print("Nome: ");
			vetorAlunos[i] = sc.nextLine();
			System.out.print("Nota 1º semestre: ");
			vetorSemestre1[i] = sc.nextDouble();
			System.out.printf("Nota 2º semestre: ");
			vetorSemestre2[i] = sc.nextDouble();
			sc.nextLine();
		}
		System.out.println("Alunos aprovados");
		for(int i=0; i<qtdeLeituras; i++) {
			double soma = vetorSemestre1[i] + vetorSemestre2[i];
			if((soma/2)>=6.0) {
				System.out.printf("%s%n",vetorAlunos[i]);
			}
		}
		sc.close();
	}

}
