package aulas.Secao10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios90_Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altMedia = 0.0;
		int qtdeMenores = 0;
		
		System.out.print("Informe a quantidade de leituras: ");
		int qtde = sc.nextInt();
		sc.nextLine();
		
		Pessoa[] vetPessoa = new Pessoa[qtde];
		
		for(int i=0; i<vetPessoa.length; i++) {
			System.out.printf("Dados da %d pessoa%n",(i+1));
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			vetPessoa[i] = new Pessoa(nome,idade,altura);
			altMedia += vetPessoa[i].getAltura();
			if(vetPessoa[i].getIdade() < 16) {
				qtdeMenores++;
			}
		}
		
		System.out.printf("%nAltura média: %.2f%n",altMedia/vetPessoa.length);
		if(qtdeMenores == 0) {
			System.out.println("Não há menores");
		}else {
			System.out.println("Percentual de menores presentes: "+ ((double)qtdeMenores / (double)qtde)*100 +"%");
		}
	sc.close();	
	}

}
