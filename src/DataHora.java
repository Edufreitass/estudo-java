package src;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DataHora {

	public static void main(String[] args) {
		
		// Formato de datas (dd MM yyyy)
		// Imprime a data atual
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		// Configurando a data manualmente
		System.out.println(LocalDate.of(2020, 4, 19));
		// Convertendo uma String que contem o formato ISO, para LocalDate
		System.out.println(LocalDate.parse("2020-04-19"));
		
		// Adiciona 30 dias
		System.out.println(agora.plusDays(30));
		
		// Volta 1 mes, se utiliza a classe ChronoUnit, que é um ENUM
		System.out.println(agora.minus(1, ChronoUnit.MONTHS));
		// Volta 24 anos
		System.out.println(LocalDate.parse("2020-08-10").minus(24, ChronoUnit.YEARS));
		
		// Pega o dia da semana(seg, ter, qua, qui, sex, sab ou dom)
		System.out.println(agora.getDayOfWeek());
		// Pega o dia do mes
		System.out.println(agora.getDayOfMonth());
		// Pega o dia do ano
		System.out.println(agora.getDayOfYear());
		
		// 2020 é um ano bisexto? TRUE
		System.out.println(agora.isLeapYear());
		// 2019 é um ano bisexto? False
		System.out.println(LocalDate.parse("2019-04-19").isLeapYear());
		
		// Formato de horas (hora minutos segundos )
		// Exibe a hora atual
		LocalTime hAgora = LocalTime.now();
		System.out.println(hAgora);
		
		// Configura a hora manualmente (hora, minuto) no formato ISO
		System.out.println(LocalTime.of(13, 21));
		// Converte uma String para LocalTime
		System.out.println(LocalTime.parse("20:18"));
		
		// Adiciona 1 hora a mais na hora atual
		System.out.println(hAgora.plusMinutes(60));
		
		// Diminui 40 horas da hora atual
		System.out.println(hAgora.minus(40, ChronoUnit.HOURS));
		// Diminui 40 minutos da hora atual 
		System.out.println(hAgora.minus(40, ChronoUnit.MINUTES));
		
		// Pega somente a hora atual, do tipo INTEIRO
		System.out.println(hAgora.getHour());
		
		// data completa = data + hora
		LocalDateTime agoraCompleto = LocalDateTime.now();
		System.out.println(agoraCompleto);
		
		// Configura a data e hora manualmente
		System.out.println(LocalDateTime.of(2020, 12, 25, 7, 0));
		
		// Converte uma String para LocalDateTime
		System.out.println(LocalDateTime.parse("2000-04-19T21:52:14.050"));
		
		// Adiciona mais 20 anos desde o ano atual(2020)
		System.out.println(agoraCompleto.plusYears(20));
		
		// Pega o fuso horario do sistema operacional
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		// Set retorna um set de Strings, e NAO uma lista!
		// Ele é um array de objetos que não se repetem!
		// Imprime todos os fusos horarios
//		Set<String> fusos = ZoneId.getAvailableZoneIds();
//		for(String f : fusos) {
//			System.out.println(f);
//		}
//		System.out.println(fusos);
		
		// Converte uma String para ZoneId
		ZoneId sp = ZoneId.of("America/Sao_Paulo");
		
		// Faz o parse de uma String que tenha data, hora e zona horaria para ZonedDateTime
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2000-04-19T21:52:14.050"), sp);
		System.out.println(zdt);
		 
		// Faz o parse da String completa para ZonedDateTime
		System.out.println(ZonedDateTime.parse("2000-04-19T21:52:14.050-03:00[America/Sao_Paulo]"));
		
		// ZoneOffset serve para verificar a diferenca de horas entre os paises e regioes
		ZoneOffset offset = ZoneOffset.of("+02:00");
		// Faz a adiçao do offset na data/hora completa
		OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);
		System.out.println(offsetdt);
				
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		
		// Obtem uma instancia do LocalDateTime
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
		System.out.println(ldtDate);
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
		
		System.out.println(date);
		System.out.println(c);
	}

}