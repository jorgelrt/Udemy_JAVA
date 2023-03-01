package aulas.Secao9;

import java.util.Locale;
import java.util.Scanner;

public class ExercFixacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaCorrente C1;
		
		//cadastro de uma conta
		System.out.print("Informe o n�mero da conta corrente: ");
		int NrConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Informe o titular da conta corrente: ");
		String NmTitular = sc.nextLine();
		System.out.print("Haver� dep�sito inicial?(S/N): ");
		Character DepInicial = sc.next().charAt(0);
		DepInicial = DepInicial.toUpperCase(DepInicial);
		if(DepInicial == 'S') {
			System.out.print("Informe o valor do dep�sito: ");
			double valorInicial = sc.nextDouble();
			C1 = new ContaCorrente(NrConta, NmTitular, valorInicial);
			System.out.println(C1);
		}else {
			C1 = new ContaCorrente(NrConta, NmTitular);
			System.out.println(C1);
		}
		System.out.println("Op��o Deposito selecionado");
		System.out.print("Informe o valor do dep�sito R$: ");
		double NovoDeposito = sc.nextDouble();
		C1.deposito(NovoDeposito);
		System.out.printf("Saldo atualizado R$ %.2f%n",C1.getSaldo());
		
		System.out.println("Op��o Saque selecionado");
		System.out.print("Informe o valor para saque R$: ");
		double Saque = sc.nextDouble();
		C1.saque(Saque);
		System.out.printf("Saldo atualizado R$ %.2f%n",C1.getSaldo());
		
		sc.close();
	}

}
