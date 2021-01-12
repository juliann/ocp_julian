package ch5;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.WeekFields;



public class DateTimesTest1 {
	static ZonedDateTime z1 = ZonedDateTime.now();
	
	public static void main(String[] args) {
//		ZoneId.getAvailableZoneIds().stream()
//		.filter(z -> z.contains("Europe"))
//		.sorted()
//		.forEach(System.out::println);
		ZoneId z = ZoneId.of("Europe/Berlin");
		System.out.println(z.getRules());
		System.out.println(z1);

		
	
		
	}
}
