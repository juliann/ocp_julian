package Testchecks;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
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
//		Stream<Integer> iterate = Stream.iterate(2, x-> x+1);
//		System.out.println(iterate.allMatch(y ->y>1));
		
//		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
//		System.out.println(stream.limit(2).map(x -> x + "2"));
		LongStream ls = LongStream.of(1,2);
		DoubleSummaryStatistics
		Predicate<? super String> predicate = s -> s.startsWith("g");
		Stream<String> stream1 = Stream.generate(() -> "growl! ");
		Stream<String> stream2 = Stream.generate(() -> "growl! ");
		stream2.to
//		boolean b1 = stream1.anyMatch(predicate);
//		boolean b2 = stream2.allMatch(predicate);
//		System.out.println(b1 + " " );
		Object o = null;
//		Optional opt = Optional.of(o);
		Optional opt1 = Optional.ofNullable(o);
//		opt1.
		OptionalDouble d = OptionalDouble.of(5.0);
		d.
		
//		System.out.println(opt.get());
		System.out.println(opt1);
		
		
		Arrays.asList();
		double d = 1;
		boolean b = d>0;
		IntUnaryOperator i = x -> x;
		DoubleFunction<Double> df = x-> x;
		Supplier s = () -> new Object();
		long l = 1;
		double db = l;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
