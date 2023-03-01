package aulas.Secao10;

import java.util.Scanner;

public class Desafio93_Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hospede[] hospedagem = new Hospede[10];
		
		System.out.print("Informe quantas reservas serão cadastradas: ");
		int qtdeReservas = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<qtdeReservas; i++) {
			System.out.printf("Dados da reserva %d%n",(i+1));
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Nr do quarto: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			hospedagem[quarto] = new Hospede(nome, email);
		}
		
		for(int i=0; i<hospedagem.length; i++) {
			if(hospedagem[i] != null) {
				System.out.printf("%nQuarto: %d%n",(i));
				System.out.printf("Hospede: %s%n",hospedagem[i].getNome());
				System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
			}
			
		}
		sc.close();
	}

}
