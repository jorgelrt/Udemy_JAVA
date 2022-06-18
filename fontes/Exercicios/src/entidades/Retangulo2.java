package entidades;

public class Retangulo2 {
	private double largura;
	private double altura;
	
	//COnstrutor
	public Retangulo2(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	//Getters and Setters
	public double getLargura() {
		return largura;
	}
	
	public void setLargura(Double largura) {
		this.largura = largura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	//outros metodos
	public double areaRetangulo(double altura, double largura) {
		return altura * largura;
	}
	
	public double perimetro(double altura, double largura) {
		return 2*(altura+largura);
	}
	
	public double diagonal(double altura, double largura) {
		return Math.sqrt((altura*altura)+(largura*largura));
	}
}
