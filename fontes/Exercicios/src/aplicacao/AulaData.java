package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class AulaData {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date d1 = sdf1.parse("28/09/2020");
		Date d2 = sdf2.parse("28/09/2020 18:57:00");
		Date agora = new Date();
		Date agora2 = new Date(System.currentTimeMillis());
		Date decada70 = new Date(0L);
		Date decada70_5 = new Date(1000L * 60L * 60L * 5L);
		
		
		System.out.println("Suponha q as datas acima foram informadas horário do Brasil");
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		System.out.printf("Agora = %s%n",agora);
		System.out.printf("Agora = %s%n",agora2);
		System.out.println("decada70 = "+decada70);
		System.out.println("decada70_5 = "+decada70_5);
		System.out.println("Formatado com sdf1.format = "+sdf1.format(d1));
		System.out.printf("Formatado com sdf2.format = %s%n",sdf2.format(d2));
		System.out.println("---------------------------");
		System.out.println("Trazendo o horário UTC");
		System.out.println("d1 = "+sdf3.format(d1));
		System.out.println("d2 = "+sdf3.format(d2));
		System.out.printf("Agora = %s%n",sdf3.format(agora));
		System.out.printf("Agora = %s%n",sdf3.format(agora2));
		System.out.println("decada70 = "+sdf3.format(decada70));
		System.out.println("decada70_5 = "+sdf3.format(decada70_5));
		
		System.out.println("Manipulando Datas");
		Date dataManipulada  = sdf2.parse("29/09/2020 19:22:00");
		System.out.println("Data informada = "+sdf2.format(dataManipulada));
		Calendar cal = Calendar.getInstance();		
		cal.setTime(dataManipulada);
		cal.add(Calendar.MONTH, 1);
		dataManipulada = cal.getTime();
		System.out.println("Data acrescida de 30 dias = "+sdf2.format(dataManipulada));
		System.out.println("");
		System.out.println("Extraindo o dia da data informada");
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("Dia = "+dia);
		System.out.println("Extraindo o mes da data informada");
		int mes = cal.get(Calendar.MONTH)+1;
		System.out.println("Mes = "+mes);
		System.out.println("Extraindo a hora da data informada");
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("Hora = "+hora);
		System.out.println("Extraindo os minutos da data informada");
		int minutos = cal.get(Calendar.MINUTE);
		System.out.println("Minutos = "+minutos);
		
		
		
		
		
	}

}
