package aulas.Secao5_Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class CalculoMinutosTelefone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int min_usados = 0;
		double min_excedente = 2.0;
		
		double vl_min_excedente = 0.0;
		double vl_plano_basico = 50.0;
		double vl_total = vl_plano_basico;
		
		System.out.print("Informe a qtde de minutos utilizada: ");
		min_usados = sc.nextInt();
		
		if (min_usados > 100) {
			vl_min_excedente = (double) ((min_usados - 100) * min_excedente);
			vl_total = vl_min_excedente + 50.0;
		}
		
		System.out.printf("Total de minutos consumidos: %d%n",min_usados);
		System.out.printf("Plano básico 100 minutos: %.2f%n",(double)vl_plano_basico);
		System.out.printf("Valor excedente em minutos: %d%n",(min_usados > 100)?(min_usados-100):0);
		System.out.printf("Total a pagar: %.2f%n",vl_total);
		
	
		
		sc.close();

	}

}
