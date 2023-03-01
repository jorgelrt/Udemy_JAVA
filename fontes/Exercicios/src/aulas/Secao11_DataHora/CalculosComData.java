package aulas.Secao11_DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculosComData {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.parse("2023-02-21T14:32:15Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("LocalDate");
		System.out.println("d01 ISO8601 = "+d01);
		System.out.println("d01 formatado = "+fmt2.format(d01));
		System.out.println("");
		
		System.out.println("LocalDateTime");
		System.out.println("d02 ISO8601 = "+d02);
		System.out.println("d02 formatado = "+d02.format(fmt1));
		System.out.println("");
		
		System.out.println("Instant");
		System.out.println("d03 ISO8601 = "+d03.toString());
		System.out.println("d03 formatado = "+fmt3.format(d03));
		System.out.println("");
		
		System.out.println("Obtendo um objeto(LocalDate) 7 dias antes/depois da data utilizada");
		LocalDate pastWeek = d01.minusDays(7);
		LocalDate nextWeek = d01.plusDays(7);
		System.out.println("Data referencia: "+d01.format(fmt2));
		System.out.println("pastWeek = "+pastWeek.format(fmt2));
		System.out.println("nextWeek = "+nextWeek.format(fmt2));
		System.out.println("");
		
		System.out.println("Obtendo um objeto(LocalDateTime) 7 dias antes/depois da data utilizada");
		LocalDateTime pastWeek2 = d02.minusDays(7);
		LocalDateTime nextWeek2 = d02.plusDays(7);
		System.out.println("Data referencia: "+d02.format(fmt1));
		System.out.println("pastWeek = "+pastWeek2.format(fmt1));
		System.out.println("nextWeek = "+nextWeek2.format(fmt1));
		System.out.println("");
		
		System.out.println("Obtendo um obejto(Instant) 7 dias antes/depois da data utilizada");
		Instant pastWeek3 = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeek3 = d03.plus(7, ChronoUnit.DAYS);
		System.out.println("Data referencia: "+fmt3.format(d03));
		System.out.println("pastWeek = "+fmt3.format(pastWeek3));
		System.out.println("nextWeek = "+fmt3.format(nextWeek3));
		System.out.println("");
		
		System.out.println("Realizando o cálculo de duração entre duas datas com LocalDate e conversão");
		Duration t1 = Duration.between(pastWeek.atStartOfDay(), d01.atStartOfDay());
		System.out.println(fmt2.format(nextWeek)+" - "+fmt2.format(d01)+" = "+t1.toDays()+" dias ");
		System.out.println("");
		
		System.out.println("Realizando o cálculo de duração entre duas datas LocalDateTime");
		Duration t2 = Duration.between(d02,nextWeek2);
		System.out.println(fmt1.format(nextWeek2)+" - "+fmt1.format(d02)+" = "+t2.toDays()+" dias ");
		System.out.println("");
		
		System.out.println("Realizando o cálculo de duração entre duas dataHoras GMT - Instant");
		Duration t3 = Duration.between(d03, nextWeek3);
		System.out.println(fmt3.format(nextWeek3)+" - "+fmt3.format(d03)+" = "+t3.toDays()+" dias ");
		System.out.println("");
		
		
		

	}

}
