package utilitarios;

import java.util.Scanner;

import entidades.AluguelQuartos;

public class  funcCadastraReserva {
	
	static Scanner sc = new Scanner(System.in);
	
	public static AluguelQuartos[] addReserva(int qtde, int tamanho) {
		AluguelQuartos[] listaReserva = new AluguelQuartos[tamanho];
		for(int i=0; i<qtde; i++) {
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			// sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			// sc.nextLine();
			System.out.print("Nr.Quarto: ");
			int nrQuarto = sc.nextInt();
			sc.nextLine();
			if(nrQuarto < tamanho) {
				listaReserva[nrQuarto] = new AluguelQuartos(nome, email);
			}else {
				//lançar exceção aqui
				
			}
			
		}
		return listaReserva;
		
	}
	
}
