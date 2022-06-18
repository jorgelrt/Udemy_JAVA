package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class CalculaTriangulos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		byte v_qtde;
		byte v_loop = 0; //tamanho 8bits / faixa -128 - 127
		double l1, l2, l3; 
		double maior = 0;
		List<Triangulo> listaT = new ArrayList<Triangulo>();
		
		
		System.out.print("Informe a qtde de triangulos a ser calculada: ");
		v_qtde = sc.nextByte();//leitura
		while(v_qtde > v_loop) {
			System.out.print("Informe lado A do triangulo "+(v_loop+1)+" : ");
			l1 = sc.nextDouble();
			System.out.print("Informe lado B do triangulo "+(v_loop+1)+" : ");
			l2 = sc.nextDouble();
			System.out.print("Informe lado C do triangulo "+(v_loop+1)+" : ");
			l3 = sc.nextDouble();
			listaT.add(new Triangulo(l1, l2, l3));
			v_loop++;
			System.out.println(listaT.getClass());//informa o tipo do objeto
		}
	    
		for(int i= 0; i<listaT.size(); i++) {
			if(maior < listaT.get(i).CalcArea()) {
				maior = listaT.get(i).CalcArea();
			}
			
		}
		int cont = 1;
		for(Triangulo l : listaT) {
			if(maior == l.CalcArea()) {
				System.out.printf("O triangulo %d é o maior %.2f",cont,l.CalcArea());
			}
			cont++;
		}
		sc.close();
	}
	
	

}
