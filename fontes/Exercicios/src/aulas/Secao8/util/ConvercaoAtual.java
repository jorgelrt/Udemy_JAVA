package aulas.Secao8.util;

public class ConvercaoAtual {
	public final static int IOF = 6;
	
	public static double dollar(double valor, double cotacaoDia) {
		double subTotal = valor / cotacaoDia;
		double imposto =  subTotal * (IOF/100);
		return subTotal - imposto;
	}

	
}
