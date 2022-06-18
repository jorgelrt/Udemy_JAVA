package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo2;

public class Retangulo2Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a largura do retangulo: ");
		double largura = sc.nextDouble();
		
		System.out.print("Informe a altura do retangulo: ");
		double altura = sc.nextDouble();
		
		Retangulo2 r = new Retangulo2(largura, altura);
		
		System.out.printf("Area: %.2f%n",r.areaRetangulo(altura, largura));
	
		System.out.printf("Perímetro: %.2f%n",r.perimetro(altura, largura));
	
		System.out.printf("Diagonal: %.2f",r.diagonal(altura, largura));
		sc.close();
	}

}
