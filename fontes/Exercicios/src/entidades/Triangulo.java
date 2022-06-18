package entidades;

public class Triangulo {
	private double A;
	private double B;
	private double C;
	//Construtor
	public Triangulo(double a, double b, double c) {
		this.A = a;
		this.B = b;
		this.C = c;
	}
	public Triangulo() {
		
	}
	//Getters and Setters
	public double getA() {
		return A;
	}
	public void setA(double a) {
		this.A = a;
	}
	public double getB() {
		return B;
	}
	public void setB(double b) {
		this.B = b;
	}
	public double getC() {
		return C;
	}
	public void setC(double c) {
		this.C = c;
	}
	
	public double CalcP() {
		return (this.A + this.B + this.C) / 2;
	}
	
	public double CalcArea() {
		double p = CalcP();
		return Math.sqrt(p*(p-A)*(p-B)*(p-C));
	}
	
	
	
}
