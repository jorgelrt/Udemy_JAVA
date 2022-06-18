package aplicacao;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Shape;
import entidades.enums.Color;

public class ProgramaCalculeAreaRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> listaFormas = new ArrayList<Shape>();
		
		Boolean continuar = true;
		
		try {
			while(continuar == true) {
				System.out.println("Informe: (R = Retangulo / C = Circulo)");
				System.out.print(">>: ");
				char forma = sc.next().charAt(0);
				forma = Character.toUpperCase(forma);
				if(forma == 'R') {
					System.out.println("Informe os dados do retangulo ");
					System.out.print("Altura: ");
					double altura = sc.nextDouble();
					System.out.print("Base: ");
					double base = sc.nextDouble();
					System.out.print("Cor: ");
					String cor = sc.next();
					listaFormas.add(new Retangulo(Color.valueOf(cor), base, altura));
				}else {
					System.out.println("Informe os dados do circulo ");
					System.out.print("Raio: ");
					double raio = sc.nextDouble();
					System.out.print("Cor: ");
					String cor = sc.next();
					listaFormas.add(new Circulo(Color.valueOf(cor), raio));
				}
		
				//continuar aplicação
				System.out.print("Deseja continuar?(S/N): ");
				char opc = sc.next().charAt(0);
				opc = Character.toUpperCase(opc);
				if(opc != 'S') {
					continuar = false;
				}
			}
			for(Shape f : listaFormas) {
				String forma = f.getClass().toString().substring(16) ;
				if(forma.equals("Retangulo")) {
					System.out.printf("A área do retangulo e: %.2f metros%n",f.area());
				}else {
					System.out.printf("A área do circulo e: %.2f diametro%n",f.area());
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
