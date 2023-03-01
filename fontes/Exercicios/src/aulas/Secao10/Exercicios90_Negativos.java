package aulas.Secao10;

import java.util.Scanner;

public class Exercicios90_Negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantos números serão lidos: ");
		int QtdeNum = sc.nextInt();
		
		int[] vetNumeros = new int[QtdeNum];
		
		for(int i=0; i<vetNumeros.length; i++) {
			System.out.print("Digite o "+ (i+1)+" numero: ");
			vetNumeros[i] = sc.nextInt();
		}
		
		System.out.println("");
		
		System.out.print("Mostrar numeros positivos ou negativos(+|-): ");
		char opc = sc.next().charAt(0);
		if(opc == '+') {
			System.out.println("Numeros positivos são");
		}else {
			System.out.println("Numeros negativos são");
		}
		
		for(int i=0; i<vetNumeros.length; i++) {
			if(opc == '+' && vetNumeros[i]>0) {
				System.out.println(vetNumeros[i]);
			}
			if(opc == '-' && vetNumeros[i]<0) {
				System.out.println(vetNumeros[i]);
			}
		}
	

	sc.close();
}

}
