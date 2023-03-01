package aulas.Secao8;

import java.util.Locale;
import java.util.Scanner;

import aulas.Secao8.util.Calculados;

public class MembroEstaticov2 {
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculados calc = new Calculados();
		
		System.out.print("Entre o raio: ");
		double raio = sc.nextDouble();
		double circunf = calc.circunferencia(raio); //necessario usar um objetpo instanciado
		double vol = calc.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n",circunf);
		System.out.printf("Volume: %.2f%n",vol);
		System.out.printf("Pi: %.2f%n",calc.PI);
		
		sc.close();

	}
	
	

}
