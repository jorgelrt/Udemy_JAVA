package entidades;

import entidades.enums.Color;

public class Circulo extends Shape{
	private Double raio;
	
	private static final Double PI = 3.14;
	
	
	public Circulo(Color color, Double raio) {
		super(color);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}
	
	public void setRaio(Double raio) {
		this.raio = raio;
	}
	@Override
	public Double area() {
		return PI * raio * raio ;
	}

}
