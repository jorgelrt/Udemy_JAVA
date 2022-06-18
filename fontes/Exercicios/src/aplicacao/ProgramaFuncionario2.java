package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import utilitarios.funcAumentoIndividualFuncionario;
import utilitarios.funcCadastraFuncionario;
import utilitarios.funcListaFuncionario;
import utilitarios.funcListaFuncionarios;
import utilitarios.funcMenuFuncionario;

public class ProgramaFuncionario2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> listaFunc = new ArrayList<>();
		boolean flag = false;

		while (flag != true) {
			switch (funcMenuFuncionario.menu()) {
			case 1:
				listaFunc.add(funcCadastraFuncionario.addCad());
				System.out.println("Funcioanrio Cadastrado com sucesso");
				break;
			case 2:
				funcListaFuncionarios.listFunc(listaFunc);
				System.out.print("Informe o código identificador do funcionario: ");
				int codigo = sc.nextInt();
				funcAumentoIndividualFuncionario.increase(codigo, listaFunc);
				break;
			case 3:
				funcListaFuncionarios.listFunc(listaFunc);
				break;
			case 4:
				System.out.print("Informe o código identificador do funcionario: ");
				codigo = sc.nextInt();
				funcListaFuncionario.view(codigo, listaFunc);
				break;
			case 5:
				flag = true;
				System.out.println("Programa finalizado com sucesso!");
			}
			
		}
		sc.close();
	}

}

