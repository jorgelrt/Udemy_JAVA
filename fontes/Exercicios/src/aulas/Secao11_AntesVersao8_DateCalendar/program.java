package aulas.Secao11_AntesVersao8_DateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("21/02/2023");
		Date y2 = sdf2.parse("21/02/2023 13:16:30");
		//utilizando sem formatação
		System.out.println("Utilizando sem formatação");
		System.out.println(y1);
		System.out.println(y2);
		System.out.println("");
		//Para sair a data formatada
		System.out.println("Utilizando método .format do sdf");
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println("");
		//Criando um objeto data obtendo a dataHora atual
		System.out.println("Criando um objeto data obtendo a dataHora atual");
		Date x1 = new Date();
		System.out.println(sdf2.format(x1));
		//ou
		Date x2 = new Date(System.currentTimeMillis());
		System.out.println(sdf2.format(x2));
		System.out.println("");
		//Criando uma data com 1º Janeiro 1970 - data inicial do padrão
		System.out.println("Criando uma data com 1º Janeiro 1970 - data inicial do padrão");
		Date x3 = new Date(0L);
		System.out.println(sdf2.format(x3)+" aplicar -3 horas de fuso, por isso não saiu 01/01/1970");
		System.out.println("");
		//Criando um objeto data de 1 janeiro 1970 as 05:00
		System.out.println("Criando um objeto data de 1 janeiro 1970 as 05:00");
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		System.out.println(sdf2.format(x4));
		System.out.println("");
		//Utilizando um Calendar
		System.out.println("Utilizando um Calendar");
		SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2023-02-21T14:23:55Z"));
		System.out.println(sdf5.format(d));
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf5.format(d));
		System.out.println("");
		//Obtendo uma unidade de tempo de uma data
		System.out.println("Obtendo uma unidade de tempo de uma data");
		SimpleDateFormat sdf6 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d1 = Date.from(Instant.parse("2023-02-21T14:27:50Z"));
		System.out.println(sdf6.format(d1));
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d1);
		int minutos = cal1.get(Calendar.MINUTE);
		int mes = cal1.get(Calendar.MONTH) + 1;
		System.out.println("Data utilizada: "+sdf6.format(d1));
		System.out.println("extraindo os Minutos: "+minutos);
		System.out.println("extraindo o mês: "+mes);
		
		
		

	}

}
