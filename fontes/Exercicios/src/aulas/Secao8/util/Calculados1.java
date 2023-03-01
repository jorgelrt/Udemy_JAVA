package aulas.Secao8.util;

public class Calculados1 {
	public static final double PI = 3.14159; //membro estático como CONSTANTE
	
	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3 ;
	}

}
