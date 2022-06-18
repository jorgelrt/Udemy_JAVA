package utilitarios;

import java.util.List;

import entidades.Funcionario;

public class funcAumentoIndividualFuncionario {
	
	public static final double PERCENTUAL = 1.30;
	
	public static void increase(int codigo, List<Funcionario> lista) {
		for(Funcionario f : lista) {
			if(f.getCodigo() == codigo) {
				f.aumentaSal(PERCENTUAL);
			}
		}
	}
}
