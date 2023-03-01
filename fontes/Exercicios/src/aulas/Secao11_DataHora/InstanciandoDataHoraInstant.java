package aulas.Secao11_DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoDataHoraInstant {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-02-19");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-19T11:54:00");
		Instant d06 = Instant.parse("2023-02-19T11:54:00Z");
		
		
				
		System.out.println("xxxxxxxx Informando objetos instanciados com dataHora de agora - .now() xxxxxxxxx");
		System.out.println("d01 = "+d01);
		System.out.println("d02 = "+d02);
		System.out.println("d03 = "+d03);
		
		System.out.println("");
		System.out.println("xxxxxxxx Instanciando objetos a partir de texto ISO8601 xxxxxxxxxx");
		System.out.println("d04 = "+d04);
		System.out.println("d05 = "+d05);
		System.out.println("d06 = "+d06);
		
		System.out.println("");
		System.out.println("xxxxxxxx Instanciando objetos a partir de texto customizado xxxxxxxx");
		System.out.println("Preciso instanciar/usar um objeto DateTimeFormatter");
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d07 = LocalDate.parse("19/02/2023",fmt1);
		System.out.println("d07 = "+d07);
		LocalDate d08 = LocalDate.parse("19/02/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("d08 = "+d08);
		
		System.out.println("xxxxxxxx Instanciando objeto a partir de ISO8601 de Londres xxxxxxxxx");
		Instant d09 = Instant.parse("2023-02-19T15:09:50+03:00");
		System.out.println("d09 = "+d09);
		
		System.out.println("xxxxxxxx Instanciando objeto a partir do ano, mes e dia xxxxxxxxx");
		LocalDate d10 = LocalDate.of(2023, 02, 19);
		System.out.println("d10 = "+d10);
		
		
		
		

	}

}
