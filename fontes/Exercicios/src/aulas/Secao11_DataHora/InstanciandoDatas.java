package aulas.Secao11_DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoDatas {

	public static void main(String[] args) {
		// https://github.com/devsuperior/date-time-java

		// Instanciando Datas

		// utilizando LocalDate
		System.out.println("Instanciando objetos tipo DATA");
		LocalDate d01 = LocalDate.now();
		System.out.println("Data local sem hora");
		System.out.println("d01 = " + d01.toString());
		System.out.println("");

		// utilizando LocalDateTime
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Data local com hora");
		System.out.println("d02 = " + d02.toString());
		System.out.println("");

		// utilizando Instant
		Instant d03 = Instant.now();
		System.out.println("Data hora global GMT - Londres");
		System.out.println("d03 = " + d03.toString());

		// obtendo um texto ISO8601 e gerando uma data a partir dele
		System.out.println("");
		System.out.println("Texto ISO8601 -> data");
		LocalDate d04 = LocalDate.parse("2023-03-07");
		System.out.println("d04 = " + d04.toString());

		System.out.println("");
		System.out.println("Texto ISO8601 -> dataHora");
		LocalDateTime d05 = LocalDateTime.parse("2023-03-07T11:04:30");
		System.out.println("d05 = " + d05.toString());

		System.out.println("");
		System.out.println("Texto ISO8601 -> Instant(UTC-LONDRES)");
		Instant d06 = Instant.parse("2023-03-07T11:04:30Z");
		System.out.println("d06 = " + d06.toString());

		// instanciando com horario equivalente aqui do brazil
		System.out.println("");
		System.out.println("Texto ISO8601 -> Instant(UTC aplicando fuso do brazil)");
		Instant d07 = Instant.parse("2023-03-07T14:04:50-03:00");
		System.out.println("d07 = " + d07);
		System.out.println("");

		// Utilizando uma classe de formatação de data
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Instanciando uma data nem formato customizado");
		LocalDate d08 = LocalDate.parse("07/02/2023", fmt1);
		System.out.println(d08);
		System.out.println("");

		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("Instanciando uma data nem formato customizado");
		LocalDateTime d09 = LocalDateTime.parse("07/02/2023 14:30", fmt2);
		System.out.println(d09);
		System.out.println("");

		// INstanciando LocalDate passando isoladamente um dia, mes e ano
		LocalDate d10 = LocalDate.of(2023, 03, 07);
		System.out.println("Instanciando LocalDate passando isoladamente um dia, mes e ano");
		System.out.println(d10);
		System.out.println("");

		LocalDateTime d11 = LocalDateTime.of(2023, 03, 07, 16, 30);
		System.out.println("Instanciando LocalDateTime passando isoladamente um dia, mes , ano, hora e minuto");
		System.out.println(d11);

	}

}
