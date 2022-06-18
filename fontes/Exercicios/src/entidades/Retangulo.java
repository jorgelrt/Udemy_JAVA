package entidades;

import entidades.enums.Color;

public class Retangulo extends Shape{
	private double base;
	private double altura;
	
	//Contrutor
	public Retangulo(Color color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	//Getters and Setters
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public Double area() {
		return base * altura;
	}
	
}
