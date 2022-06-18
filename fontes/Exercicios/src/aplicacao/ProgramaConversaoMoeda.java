package aplicacao;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import utilitarios.ConverteMoedas;

public class ProgramaConversaoMoeda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Boolean continuar = true;
		
		try {
			System.out.print("Informe a cotação do dia: ");
			double cotacaoDia = sc.nextDouble();
			
			while(continuar == true) {
				
				System.out.print("Valor em reais: ");
				double valor = sc.nextDouble();
				
			  	System.out.printf("Valor em dollares: %.2f%n",ConverteMoedas.convDollar(valor, cotacaoDia));
				
				System.out.print("Fazer nova converção?(S/N): ");
				char resp = sc.next().charAt(0);
				resp = Character.toUpperCase(resp);
				if(resp != 'S') {
					continuar = false;
				}
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Erro de entrada de dados!");
		}
		finally {
			sc.close();
		}
		
	}

}
