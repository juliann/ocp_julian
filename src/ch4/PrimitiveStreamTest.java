package ch4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


public class PrimitiveStreamTest {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList( 1,2,3,4,5);
	//	IntStream intstream = intList.stream(); 			// Type mismatch: cannot convert from Stream<Integer> to 

		// Object Stream wird mit Function in einen Primitive Stream verwandelt
		IntStream intstream = intList.stream().mapToInt( integer -> integer.intValue() );
		
		//System.out.println( intstream.count() );
		
	//	System.out.println( intstream.average() ); // OptionalDouble average()  <- ist für Primitive doubles //
												   // Optional<Double> ist für Wrapper
		
		OptionalDouble od =  intstream.average() ;
		double zahl = od.getAsDouble();				// getAsDouble()
		
		
		System.out.println("\n DoubleStream");
		IntStream intstream2 = IntStream.range(1, 6);
		//DoubleStream doubleStream = intstream2.asDoubleStream();
		DoubleStream doubleStream = intstream2.mapToDouble( i -> (double)i );
//		DoubleStream doubleStream = intstream2.mapToDouble( i -> { 
//																Double a = new Double(i);
//																return a.doubleValue();
//																} );
		System.out.println(  doubleStream.max() );
		
		// Summarizing statistics, für Primiteve Streams
		//weil alle mathematischen Funktionen terminal operations sind, gibt es die Summarizing statistics
		
		DoubleStream doubleStream2 = DoubleStream.iterate(1.0,  x -> x + 0.2);
		DoubleSummaryStatistics dstats = doubleStream2.limit( 20l )
													  .summaryStatistics();
		System.out.println( "dstats: " + dstats.toString());
		
		long amountNumbers = dstats.getCount();
		double average = dstats.getAverage();
		
		
		LongStream longStream = LongStream.generate( () -> (long) ( (Math.random()+1)+ (Integer.MAX_VALUE ) ));
		
		IntStream intStreamfromLong = longStream.limit(8)
												.mapToInt( l -> (int) l);
		
		intStreamfromLong.forEach( System.out::println );
		

		
		// Map to Objectstream
		
		
		IntStream intStream3 = IntStream.of(1,2,3,4,5,6,7,8,9);
		Stream<Integer> integerStream = intStream3.mapToObj( i -> new Integer(i) );
		System.out.println( integerStream.collect( Collectors.toList() ) );
		
		// Primitive Streams gibt es nur für  int long double 
		
		
		
		// BooleanSupplier zum Spaß
		BooleanSupplier boolSup = () -> { return Math.random() > 0.5? true : false;};
		System.out.println("BooleanSupplier => methode zum Wert holen heisst getAsBoolean()");
		System.out.println( boolSup.getAsBoolean() );
		
		System.out.println( Stream.iterate("argh", x->x+"?").limit(10).
				reduce("!", (x,b)->x+b+"\t"));
		
		
	}
}

