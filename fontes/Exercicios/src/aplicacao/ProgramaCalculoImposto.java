package aplicacao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class ProgramaCalculoImposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> listaPess = new ArrayList<Pessoa>();
		
		try {
			System.out.println("Informe o nr de impostos a calcular");
			System.out.print(">>: ");
			int qtd = sc.nextInt();
			
			for(int i=0; i<qtd; i++) {
				System.out.print("Pessoa Fisica ou Juridica (1 - 2)");
				System.out.print(">>: ");
				int tpPessoa = sc.nextInt();
				sc.nextLine();
				if(tpPessoa == 1) {
					System.out.print("nome: ");
					String nome = sc.nextLine();
					System.out.print("Renda anual: ");
					Double rendaAnual = sc.nextDouble();
					System.out.print("Despesas medicas: ");
					Double despesasMedicas = sc.nextDouble();
					listaPess.add(new PessoaFisica(nome, rendaAnual, despesasMedicas));
				}else if(tpPessoa == 2) {
					System.out.print("nome: ");
					String nome = sc.nextLine();
					System.out.print("Renda anual: ");
					Double rendaAnual = sc.nextDouble();
					System.out.print("Qtde funcionarios: ");
					int nrFunc = sc.nextInt();
					listaPess.add(new PessoaJuridica(nome, rendaAnual, nrFunc));
				}else {
					System.out.println("Opcao invalida");
				}	
			}
			System.out.println("Imposto a pagar");
			for(Pessoa p : listaPess) {
				System.out.println(p.getNome()+": $ "+p.calcImposto());
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Erro de entrada de dados!");
		}
		finally {
			sc.close();
		}
		
		
	}

}
