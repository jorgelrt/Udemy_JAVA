package aulas.Secao8;

import java.util.Locale;
import java.util.Scanner;
import aulas.Secao8.Aluno;

public class ExerAula69_Aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Aluno: ");
		aluno.nome = sc.nextLine();
		System.out.print("Nota 1º bimestre: ");
		aluno.nota1B = sc.nextDouble();
		System.out.print("Nota 2º bimestre: ");
		aluno.nota2B = sc.nextDouble();
		System.out.print("Nota 3º bimestre: ");
		aluno.nota3B = sc.nextDouble();
		
		System.out.printf("Final grade = %.2f%n",aluno.CalcFinal());
		System.out.println(aluno.Resultado(aluno.CalcFinal()));
		sc.close();
	}

}
