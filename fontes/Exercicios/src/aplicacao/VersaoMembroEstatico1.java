package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class VersaoMembroEstatico1 {

	public static final double PI = 3.1416;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o raio: ");
		double raio = sc.nextDouble();
		
		System.out.printf("Circunferencia: %.2f%n",circunferencia(raio));
		System.out.printf("Volume: %.2f%n",volume(raio));
		
		sc.close();

	}
	
	public static double circunferencia(double raio) {
		return 2.0*PI*raio;
	}
	
	public static double volume(double raio) {
		return 4.0*PI*(raio*raio*raio / 3.0);
	}

}
