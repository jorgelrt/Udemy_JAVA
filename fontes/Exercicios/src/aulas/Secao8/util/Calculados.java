package aulas.Secao8.util;

public class Calculados {
	public final double PI = 3.14159; //membro est�tico como CONSTANTE
	
	public double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3 ;
	}

}
