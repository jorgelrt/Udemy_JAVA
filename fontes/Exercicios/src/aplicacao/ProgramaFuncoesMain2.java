package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaFuncoesMain2 { //aqui temos uma CLASSE

	public static void main(String[] args) { //J? aqui temos uma FUN??O enterpoint MAIN
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe 3 n?meros separados por espa?o");
		System.out.print(">>: ");
		String numeros = sc.nextLine();
		String[] arrNum = numeros.split(" ")  ; //somente exercitando uso do split
		
		double resultado = MaiorNumero(Double.parseDouble(arrNum[0]), Double.parseDouble(arrNum[1]), Double.parseDouble(arrNum[2]));
		
		System.out.printf("O maior n?mero informado foi: %.2f",resultado);
		
		sc.close();

	}
	//fun??o personalizada
	public static double MaiorNumero(double A, double B, double C) {
		if((A > B) && (A> C)){
			return A ;
		}else if ((B>A) && (B>C)){
			return B;
		}else {
			return C;
		}
	}

}
