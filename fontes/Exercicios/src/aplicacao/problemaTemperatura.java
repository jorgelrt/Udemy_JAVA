package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class problemaTemperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char continuar;
		double Tf, Tc;
		
		do {
			System.out.println("Informe a conversão");
			System.out.println("1 - Calcular Celsius -> Fahrenheit");
			System.out.println("2 - Calcular Fahrenheit -> Celsius");
			System.out.print(">>: ");
			int resp = sc.nextInt();
			if(resp == 1) {
				System.out.println("Conversao Celsius -> Fahrenheit");
				System.out.print("Informe a temperatura: ");
				Tc = sc.nextDouble();
				Tf =  ((9*Tc)/5) + 32 ;
				System.out.printf("%.2f Graus celsius equivale a %.2f graus fahrenheit%n",Tc,Tf);
			}else if(resp == 2) {
				System.out.println("Conversao Fahrenheit -> Celsius");
				System.out.print("Informe a temperatura: ");
				Tf = sc.nextDouble();
				Tc = (Tf - 32) / 1.8;
				System.out.printf("%.2f Graus fahrenheit equivale a %.2f graus celsius%n",Tf,Tc);
			}
			System.out.print("Deseja fazer uma nova conversao? (s/n) :");
			continuar = Character.toUpperCase(sc.next().charAt(0));
		}while(continuar == 'S');
		sc.close();
	}

}
