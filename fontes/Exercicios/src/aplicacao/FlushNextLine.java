package aplicacao;

import java.util.Scanner;

public class FlushNextLine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		System.out.print("Digite um numero: ");
		x = sc.nextInt();
		sc.nextLine();/*se faz necess�rio, porque o comando acima deu uma quebra de linha - que ficou pendente na entrada padr�o,
                                caso n�o exista o comando sc.nextLine(), o comando pendente ser� consumido na pr�xima entrada de dados*/
		System.out.print("Digite uma string: ");
		s1 = sc.nextLine();
		System.out.print("Digite uma string: ");
		s2 = sc.nextLine();
		System.out.print("Digite uma string: ");
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
