package aplicacao;
import java.util.Locale;
import java.util.Scanner;

public class TrianguloSemOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados do triangulo X: ");
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();
		System.out.println("Informe os dados do triangulo Y: ");
		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();
		/*
		double px = (xa + xb + xc) / 2;
		double py = (ya + yb + yc) / 2;
		double xarea = Math.sqrt(px*(px-xa)*(px-xb)*(px-xc));
		double yarea = Math.sqrt(py*(py-ya)*(py-yb)*(py-yc));
		*/
		Double px = CalcP(xa, xb, xc);
		Double py = CalcP(ya, yb, yc);
		System.out.printf("Triangulo X area: %.2f%n", CalcArea(px,xa,xb,xc));
		System.out.printf("Triangulo Y area: %.2f%n", CalcArea(py, ya, yb, yc));
		
		if(CalcArea(px,xa,xb,xc) > CalcArea(py, ya, yb, yc)) {
			System.out.println("Maior area: X");
		}else {
			System.out.println("Maior area: Y");
		}
		sc.close();
	}
	
	public static Double CalcP(Double X, Double Y, Double Z) {
		return (X+Y+Z)/2;
	}
	
	public static Double CalcArea(Double p, Double A, Double B, Double C) {
		return Math.sqrt(p*(p-A)*(p-B)*(p-C));
	}

}
