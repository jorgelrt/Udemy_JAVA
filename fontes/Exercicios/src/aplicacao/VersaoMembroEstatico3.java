package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.Calculator2;

public class VersaoMembroEstatico3 {

	public static void main(String[] args) {
    			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o raio: ");
		double raio = sc.nextDouble();
			
		//Calculator c = new Calculator();
				
		System.out.printf("Circunferencia: %.2f%n",Calculator2.circunferencia(raio));
		System.out.printf("Volume: %.2f%n",Calculator2.volume(raio));
				
		sc.close();

	}

}
