package ch5;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.time.temporal.WeekFields;
import java.util.Locale;



public class DateTimesTest1 {
	static ZonedDateTime z1 = ZonedDateTime.now();
	
	public static void main(String[] args) {
//		ZoneId.getAvailableZoneIds().stream()
//		.filter(z -> z.contains("Europe"))
//		.sorted()
//		.forEach(System.out::println);
		
		LocalTime lt1 = LocalTime.now();
		LocalTime lt2 = LocalTime.now().minus(61, ChronoUnit.MINUTES);
		System.out.println(ChronoUnit.HOURS.between(lt1, lt2));
		Duration d = Duration.between(lt1, lt2);
		System.out.println(d);
		

		ZoneId z = ZoneId.of("Europe/Berlin");
		System.out.println(z.getRules());
		System.out.println(z1);
		//DateTimeFormatter dtf = DateTimeFormatter.of
		Instant i = Instant.now();
		System.out.println(i);
		System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(LocalDate.now()));
		System.out.println(DateTimeFormatter.ISO_ORDINAL_DATE.format(LocalDate.now()));
		System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(LocalDateTime.now()));
		
		Locale br = new Locale("pt", "BR");
		System.out.println(br.getDisplayCountry());
		System.out.println(br.getDisplayCountry(br));
		System.out.println(br.getDisplayLanguage());
		System.out.println(br.getDisplayLanguage(br));
		
		Locale hi = new Locale("hi", "IN");
		System.out.println(hi.getDisplayCountry());
		System.out.println(hi.getDisplayCountry(hi));
		System.out.println(hi.getDisplayLanguage());
		System.out.println(hi.getDisplayLanguage(hi));
		
		
		LocalTime lt = LocalTime.parse("11:11");
		LocalDate ld = LocalDate.parse("1999-01-01");
		LocalDateTime ldt = LocalDateTime.parse("1999-01-01T11:11");
		System.out.println(System.getProperty("file.separator"));
		System.out.println(ldt.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(hi.getCountry());
		
	
		
	}
}
