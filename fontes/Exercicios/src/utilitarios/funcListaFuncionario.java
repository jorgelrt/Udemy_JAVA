package utilitarios;

import java.util.List;

import entidades.Funcionario;

public class funcListaFuncionario {
	public static void view(int codigo, List<Funcionario> lista) {
		for(Funcionario f :lista) {
			if(f.getCodigo() == codigo) {
				System.out.println(f);
			}
		}
	}
}
