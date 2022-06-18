package aplicacao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x ;
		double soma = 0;
		
		x = sc.nextInt();
		//soma = x;
		
		while(x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.println(soma);
		sc.close();

	}

}
