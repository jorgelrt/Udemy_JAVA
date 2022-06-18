package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaCorrente;
import exceptions.ContaCorrenteException;

public class ProgramaExer145 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Informe os dados da conta: ");
			System.out.print("Numero: ");
			int numero = sc.nextInt();
			sc.nextLine();
			System.out.print("Correntista: ");
			String correntista = sc.nextLine();
			System.out.print("Saldo inicial: ");
			Double saldo = sc.nextDouble();
			System.out.print("Limite de saque: ");
			Double limiteSaque = sc.nextDouble();
			ContaCorrente cc = new ContaCorrente(numero, correntista, saldo, limiteSaque);
			
			System.out.print("Informe o valor de saque: ");
			Double valor = sc.nextDouble();
			
			cc.saque(valor);
			
			System.out.println("Saque atualizado: "+cc.getSaldo());
		}
		catch(ContaCorrenteException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		finally {
			sc.close();
		}
		
	
		
	}
}
