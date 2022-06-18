package aplicacao;

import java.util.Locale;

import entidades.ContaFisica;
import entidades.ContaJuridica;
import entidades.ContaPoupanca;

public class ProgramaBancario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		ContaFisica CF = new ContaFisica(3, "Camille", 1000.00);
		ContaFisica CJ = new ContaJuridica(1, "Jorge", 1000.0, 200.00);
		ContaFisica CP = new ContaPoupanca(2, "JLRT", 1000.0, 0.05);
		
		//Iniciando saques e verificando sobreposi��o de m�todos em classes herdadas
		
		System.out.println("Saldo Conta Fisica: "+String.format("%.2f", CF.getSaldo()));
		System.out.println("Saldo Conta Jur�dica: "+String.format("%.2f", CJ.getSaldo()));
		System.out.println("Saldo Conta Poupan�a: "+String.format("%.2f", CP.getSaldo()));
		
		CF.saque(200.00);
		CJ.saque(200.00);
		CP.saque(200.00);
		
		System.out.println("Saldo ap�s saque de 100 reais");
		System.out.println("Saldo Conta Fisica: "+String.format("%.2f", CF.getSaldo()));
		System.out.println("Saldo Conta Jur�dica: "+String.format("%.2f", CJ.getSaldo()));
		System.out.println("Saldo Conta Poupan�a: "+String.format("%.2f", CP.getSaldo()));
		
		
		
		
		
		
		

	}

}
