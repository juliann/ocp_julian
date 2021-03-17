package Testchecks;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsNStuff {

	public static void main(String[] args) {
		Res
		LocalDate.of(1, Month.APRIL, 3);
		ZoneId z = ZoneId.of("UTC+1");
		LocalDateTime now3 = LocalDateTime.now();
		LocalDateTime now2 = now3;
		LocalDateTime now = now2;
		ZonedDateTime zdt = ZonedDateTime.of(now, z);
		System.out.println(z.getRules());
		Locale.get
//		Stream<Integer> iterate = Stream.iterate(2, x-> x+1);
//		System.out.println(iterate.allMatch(y ->y>1));
		
//		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
//		System.out.println(stream.limit(2).map(x -> x + "2"));
		LongStream ls = LongStream.of(1,2);
		ls.summaryStatistics();
		Predicate<? super String> predicate = s -> s.startsWith("g");
		Stream<String> stream1 = Stream.generate(() -> "growl! ");
		Stream<String> stream2 = Stream.generate(() -> "growl! ");
	
//		boolean b1 = stream1.anyMatch(predicate);
//		boolean b2 = stream2.allMatch(predicate);
//		System.out.println(b1 + " " );
		
//		Optional opt = Optional.of(o);
//		Optional opt1 = Optional.ofNullable(o);
//		opt1.
//		OptionalDouble d = OptionalDouble.of(5.0);
		
		
//		System.out.println(opt.get());
//		System.out.println(opt1);
		
		Instant i = Instant.now();
		LocalDateTime.now();
		LocalTime lt = LocalTime.NOON;
		lt.for
		System.out.println(Clock.systemDefaultZone());
		System.out.println(Locale.getDefault());
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(dtf.format(now3));
		Arrays.asList();
		double d = 1;
		boolean b = d>0;
	//	IntUnaryOperator i = x -> x;
		DoubleFunction<Double> df = x-> x;
		Supplier s = () -> new Object();
		long l = 1;
		double db = l;
		Duration dt = Duration.ofMinutes(90);
		System.out.println((dt));
		
		Period p = Period.of(0,30,200);
		System.out.println(p);
		
			
		
	}
}
