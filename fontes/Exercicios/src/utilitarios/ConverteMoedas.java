package utilitarios;

public class ConverteMoedas {
	private static final double IOF = 6.0;
	
	
	public static double calcIOF(double valorReais) {
		return (valorReais*IOF)/100;
	}
	public static double convDollar(double valorReais, double cotacaoDodia) {
		return (valorReais/cotacaoDodia) - calcIOF(valorReais);
	}
	
	
}
