package aulas.Secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio99_Listas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> listaFunc = new ArrayList<Funcionario>();
		
		System.out.print("Informe quantos funcionarios serão registrados: ");
		int qtdeRegistros = sc.nextInt();
	
		
		for(int i=0; i<qtdeRegistros; i++) {
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			listaFunc.add(new Funcionario(id,nome,salario));
		}
		
		System.out.println("Módulo Aumento Salarial");
		System.out.print("Informe a identificação do funcionario: ");
		Integer id = sc.nextInt();
		System.out.print("Informe o percentual: ");
		Double percentual = sc.nextDouble();
		
		/*resolução 1
		Funcionario func = listaFunc.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
		
		if(func == null) {
			System.out.println("Identificação de funcionário não localizada");
		}else {
			func.AumentoSalarial(percentual);
		}
		*/
		
		Integer indice = posicaoIDFunc(listaFunc, id);
		
		if(indice == -1) {
			System.out.println("Identificação de funcionário não localizada");
		}else {
			listaFunc.get(indice).AumentoSalarial(percentual);
		}
		
		
		System.out.println("");
		System.out.println("Lista de funcionarios");
		for(Funcionario x : listaFunc) {
			System.out.println(x);
		}
		sc.close();

	}
	
	public static int posicaoIDFunc(List<Funcionario> lista, Integer id) {
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).getID() == id) {
				return i;
			}
		}
		return -1;
	}

}
