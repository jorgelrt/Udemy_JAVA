package aplicacao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class ExerPropostoLista {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> listaFunc = new ArrayList<Funcionario>();
		int seqID = 1;
		
		try {
			System.out.print("Informe a qtd de registros: ");
			int qtdRegs = sc.nextInt();
			sc.nextLine();
			System.out.println();
			for (int i=0; i<qtdRegs; i++) {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Salario: ");
				Double salarioBruto = sc.nextDouble();
				sc.nextLine();
				listaFunc.add(new Funcionario(seqID, nome, salarioBruto));
				seqID+=1;
			}
			System.out.println("Funcionarios cadastrados:");
			for(Funcionario f : listaFunc) {
				System.out.println(f);
			}
			/*
			System.out.print("Informe o nome do funcionario: ");
			String NomePesq = sc.nextLine(); 
					
			for(Funcionario f : listaFunc) {
				if(NomePesq.equals(f.getNome())) {
					f.aumentaSal(0.10);
				}
			}
			*/
			System.out.print("Informe o id do funcionario: ");
			int CodFunc = sc.nextInt();
			
			for(Funcionario f : listaFunc) {
				if(CodFunc == f.getCodigo()) {
					f.aumentaSal(0.10);
				}
			}
			
			System.out.println("Dados alterados");
			for(Funcionario f : listaFunc) {
				System.out.println(f);
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
