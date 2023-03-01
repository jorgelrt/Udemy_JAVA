package aulas.Secao11_DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatandoDatas {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2023-03-07");
		LocalDateTime d02 = LocalDateTime.parse("2023-03-07T16:30");
		Instant d03 = Instant.parse("2023-03-07T01:30:15Z");
		
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("d01 = "+d01);//vai utilizar o toString implícito e vai dar saida no formato ISO8601
		
		//FOrmatando LocalDate - d01 - Vale as três formas
		System.out.println("d01 = "+d01.format(fmt1));
		System.out.println("d01 = "+fmt1.format(d01));
		System.out.println("d01 = "+d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("");
		//
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("d02 = "+d02.format(fmt1));
		System.out.println("d02 = "+d02.format(fmt2));
		System.out.println("");
		//
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println("d03 = "+fmt3.format(d03));
		System.out.println("");
		//
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM").withZone(ZoneId.of("Portugal"));
		System.out.println("d03 = "+fmt4.format(d03));
		System.out.println("");
		//Convertendo uma dataHora global p/ uma data Local, considerando o fuso
		System.out.println("Convertendo uma dataHora global p/ uma data Local, considerando o fuso");
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		System.out.println("r1 = "+r1.toString());
		System.out.println("Convertendo uma dataHora global p/ uma data Local, considerando o fuso de Portugal");
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		System.out.println("r2 = "+r2.toString());
		System.out.println("");
		//Agora utilizando um DateLocalTime 
		System.out.println("Convertendo um Instant GMT (Londres 01:30:15) para LocalDateTime do sistema");
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		System.out.println("r3 = "+r3.toString());
		System.out.println("Convertendo um Instant GMT (Londres 01:30:15) para LocalDateTime de Portugal");
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		System.out.println("r4 = "+r4.toString());
		System.out.println("");
		//Obtendo Ano, Mês e dia de um LocalDate
		System.out.println("Obtendo Ano, Mês e dia de um LocalDate");
		System.out.println("A data é: "+d01.toString()+" - Ano: "+d01.getYear());
		System.out.println("A data é: "+d01.toString()+" - Mês: "+d01.getMonthValue());
		System.out.println("A data é: "+d01.toString()+" - Dia: "+d01.getDayOfMonth());
	}

}
