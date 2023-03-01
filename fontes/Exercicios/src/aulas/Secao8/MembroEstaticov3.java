package aulas.Secao8;

import java.util.Locale;
import java.util.Scanner;

import aulas.Secao8.util.Calculados1;

public class MembroEstaticov3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre o raio: ");
		double raio = sc.nextDouble();
		double circunf = Calculados1.circunferencia(raio); //basta chamar a classe estatica
		double vol = Calculados1.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n",circunf);
		System.out.printf("Volume: %.2f%n",vol);
		System.out.printf("Pi: %.2f%n",Calculados1.PI);
		
		sc.close();

	}

}
