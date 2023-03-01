package aulas.Secao8;

import java.util.Locale;
import java.util.Scanner;

public class MembroEstaticov1 {
	public static final double PI = 3.14159; //membro estático como CONSTANTE
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre o raio: ");
		double raio = sc.nextDouble();
		double circunf = circunferencia(raio); 
		double vol = volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n",circunf);
		System.out.printf("Volume: %.2f%n",vol);
		System.out.printf("Pi: %.2f%n",PI);
		
		sc.close();

	}
	
	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3 ;
	}

}
