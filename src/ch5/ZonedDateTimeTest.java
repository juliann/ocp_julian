package ch5;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;
import java.time.zone.ZoneRules;

public class ZonedDateTimeTest {
	public static void main(String[] args) {
	
		rules();
//		tempAdjusters();
//		periods();
		
	}

	private static void periods() {
		
//		ZonedDateTime zdt = ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, zone)
		//2024-04-08T13:35:56-05:00[US/Central]
		ZonedDateTime zdt = ZonedDateTime.of(2024, 4, 8, 13, 35, 56, 0, ZoneId.of("US/Central"));
		System.out.println(zdt);
		Period p = Period.ofMonths(1);
		System.out.println("Period is: " + p);
		System.out.println("Remind on " +zdt.minus(p));
		Duration.between(zdt, zdt);
		
	}

	private static void tempAdjusters() {
//		For a positive or zero ordinal, the algorithm is equivalent to finding the firstday-of-week that matches within
//		the month and then adding a number of weeks to it.For a negative ordinal, the algorithm is equivalent 
//		to finding the lastday-of-week that matches within the month and then subtracting a number of weeks to it
		System.out.println(LocalDateTime.now().with(TemporalAdjusters.dayOfWeekInMonth(6, DayOfWeek.FRIDAY)));
		System.out.println(LocalDate.now().with(TemporalAdjusters.firstDayOfYear()));

		
		
	}

	private static void rules() {
		ZonedDateTime zdt = ZonedDateTime.now();
		//next tuesday
		
		ZonedDateTime nt = zdt.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println(nt);
		
		ZoneId zid= ZoneId.of("GMT+1");
		zid.getRules().getTransitions().stream().forEach(System.out::println);
		System.out.println(zid.getRules().isDaylightSavings(zdt.toInstant()));
		
	}
}
