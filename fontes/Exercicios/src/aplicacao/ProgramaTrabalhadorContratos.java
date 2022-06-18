package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

import entidades.Departamento;
import entidades.HorasDoContrato;
import entidades.Trabalhador;
import entidades.enums.Nivel;

public class ProgramaTrabalhadorContratos {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		List<Trabalhador> listaTrabalhadores = new ArrayList<Trabalhador>();
		
			
		try {
			System.out.print("Qtos trabalhadores serão cadastrados: ");
			int qtdTrab = sc.nextInt();
			sc.nextLine();
			for(int i=0;i<qtdTrab;i++) {
				System.out.print("Informe o departameno: ");
				String departamento = sc.nextLine();
				System.out.println("Informe dados do Trabalhador");
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Nivel: ");
				String nivel = sc.nextLine();
				System.out.print("Salario: ");
				Double baseSal = sc.nextDouble();
				sc.nextLine();
				/*com os dados, instânciar o objeto “trabalhador”. Atentar que o atributo 				
				*Departamento é uma associação e deve ser instanciada também. Note ainda que 		
				*usamos o método valueOf para converter uma string para uma instância Enum.
				*/
				listaTrabalhadores.add(new Trabalhador(nome, Nivel.valueOf(nivel.toUpperCase()), baseSal, new Departamento(departamento)));
			}
				
				for(Trabalhador t : listaTrabalhadores) {
					System.out.println("Qtos contratos para o trabalhador "+t.getNome());
					
					System.out.println("Qtos contratos para este trabalhador: ");
					int qtdContratos = sc.nextInt();
					sc.nextLine();
					for(int j=0; j<qtdContratos; j++) {
						System.out.println("Dados do contrato");
						System.out.print("Data (DD/MM/YYYY) : ");
						Date data = sdf.parse(sc.next());
						System.out.println(sdf.format(data));
						System.out.print("Valor da hora: ");
						Double valorHora = sc.nextDouble();
						System.out.print("Duracao: ");
						Integer totalHoras = sc.nextInt();
						sc.nextLine();
						//instânciando o objeto trabalhador “t1” com a associação “hc”, através do método voltado para add contrato
						t.addContrato(new HorasDoContrato(data, valorHora, totalHoras));
					}
				}
				
			
			
			
						
				System.out.print("Informe o nome do Trabalhador: ");
				String nmTrab = sc.nextLine();
				
				for(Trabalhador t : listaTrabalhadores) {
					if(t.getNome().equals(nmTrab)) {
						System.out.println("Informe a data (MM/yyyy) : ");
						String anoMes = sc.next();
						int buscaMes = Integer.parseInt(anoMes.substring(0, 2));
						int buscaAno = Integer.parseInt(anoMes.substring(3));
								
						/*
						 * System.out.print("Ano: ");
						   int buscaAno = sc.nextInt();
						   System.out.print("Mes: ");
						   int buscaMes = sc.nextInt();
						 */
						sc.nextLine();
						System.out.println(t.getNome());
						System.out.println(t.getNmDepto().getNmDepto());
						System.out.printf("Total a receber: R$%.2f para %s",t.calcularContrato(buscaAno, buscaMes),anoMes);
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
		
		

