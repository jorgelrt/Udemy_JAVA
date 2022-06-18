package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.ReservaHotel;

public class ProgramaReservaHotel {

	public static void main(String[] args)  {
		// implementação muito ruim, com a lógica no Main
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Numero do Quarto:");
			int nrQuarto = sc.nextInt();
			System.out.print("Checkin: ");
			Date checkin = sdf.parse(sc.next());
			System.out.print("Checkout: ");
			Date checkout = sdf.parse(sc.next());

			
			ReservaHotel rh = new ReservaHotel(nrQuarto, checkin, checkout);
			System.out.println("Reserva: " + rh);
			System.out.println("");
			System.out.println("Informe as datas para alteracao");
			System.out.print("Checkin: ");
			checkin = sdf.parse(sc.next());
			System.out.print("Checkout: ");
			checkout = sdf.parse(sc.next());

			rh.alteraDatas(checkin, checkout);
			
			System.out.println("Datas atualizadas!");
			System.out.println("Reserva " + rh);

		}
		catch(IllegalArgumentException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		catch (ParseException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		finally {
			sc.close();
		}
		
	}

}
