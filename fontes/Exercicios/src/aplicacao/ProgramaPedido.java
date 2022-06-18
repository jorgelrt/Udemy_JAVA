package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entidades.Pedido;
import entidades.enums.StatusPedido;

public class ProgramaPedido {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			int id = r.nextInt(100);
			System.out.print("Data: ");
			Date data = sdf.parse(sc.next());
			System.out.print("Status: ");
			StatusPedido status = StatusPedido.valueOf(sc.next());
			Pedido pedido = new Pedido(id, data, status);
			System.out.println(pedido);
		}
		catch(InputMismatchException e) {
			System.out.println("Erro de antrada de dados!");
		}
		catch (ParseException e) {
			System.out.println("Erro de entrada na data!");
		}
		finally {
			sc.close();
		}
			
		

	}

}
