package aplicacao;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		int x = 0;
		
		for (int i = 1; i <= n; i++){
			x = sc.nextInt();
			soma += x;
		}
		System.out.println(soma);
		sc.close();
	}

}
