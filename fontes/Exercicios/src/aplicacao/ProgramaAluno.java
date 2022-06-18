package aplicacao;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class ProgramaAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		Boolean continuar = true;
		int mat = 1000;
		int Buscamat;
		
		try {
			while (continuar == true){
				System.out.println("01 - Matricular aluno");
				System.out.println("02 - Lançar nota por aluno");
				System.out.println("03 - Listar alunos");
				System.out.println("04 - Sair");
				
				System.out.print("Informe a opção: ");
				int opc = sc.nextInt();
				
				switch (opc) {
				case 1:
						sc.nextLine();
						System.out.print("Nome: ");
						String nome = sc.nextLine();
						
						listaAlunos.add(new Aluno(mat, nome));
						mat += 1;
						break;
				case 2:
						System.out.print("Informe a matricula: ");
						Buscamat = sc.nextInt();
						for(Aluno al : listaAlunos) {
							if(al.getMatricula() == Buscamat) {
								System.out.print("Trimestre1: ");
								al.setTrimestre1(sc.nextDouble());
								System.out.print("Trimestre2: ");
								al.setTrimestre2(sc.nextDouble());
								System.out.print("Trimestre3: ");
								al.setTrimestre3(sc.nextDouble());
							}
						}
						break;
				case 3:
						for(Aluno al : listaAlunos) {
							System.out.println(al);
						}
						break;
				case 4:
						continuar = false;
						System.out.println("Final de execução");
						break;
				default:
						System.out.println("Opção inválida!");
							
				}
				
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
