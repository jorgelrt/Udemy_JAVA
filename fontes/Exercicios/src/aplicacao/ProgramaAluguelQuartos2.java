package aplicacao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entidades.AluguelQuartos;
import utilitarios.funcCadastraReserva;
import utilitarios.funcMostraMenu;
import utilitarios.funcQuartosLivres;
import utilitarios.funcQuartosOcupados;

public class ProgramaAluguelQuartos2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Boolean continuar = true;
		AluguelQuartos[] vagasQuartos = new AluguelQuartos[10];//criação do vetor tipo AluguelQuartos
		//int qtdReservas = 0;

		try {
			while (continuar == true) {
			    switch (funcMostraMenu.show()) {				
				case 1:
					System.out.print("Informe a qtde a ser reservada: ");
					int qtde = sc.nextInt();
					vagasQuartos = funcCadastraReserva.addReserva(qtde, 10);
					qtde = 0;
					break;
				case 2:
					funcQuartosOcupados.lista(vagasQuartos);
					break;
				case 3:
					funcQuartosLivres.lista(vagasQuartos);
					break;
				case 4:
					continuar = false;
					System.out.println("Programa finalizado");
					break;
				default : 
					System.out.println("Opcao invalida!");
				
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
