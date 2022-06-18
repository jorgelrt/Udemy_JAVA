package utilitarios;

import java.util.List;

import entidades.Funcionario;

public class funcListaFuncionarios {
	public static void listFunc(List<Funcionario> lista) {
		for(Funcionario f : lista) {
			System.out.println(f);
		}
	}
}
