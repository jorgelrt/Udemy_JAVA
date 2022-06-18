package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.Calculator;

public class VersaoMembroEstatico2 {

	public static void main(String[] args) {
		
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o raio: ");
		double raio = sc.nextDouble();
		
		Calculator c = new Calculator();
			
		System.out.printf("Circunferencia: %.2f%n",c.circunferencia(raio));
		System.out.printf("Volume: %.2f%n",c.volume(raio));
			
		sc.close();

		}
		
		


	}


