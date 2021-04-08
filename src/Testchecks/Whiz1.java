package Testchecks;

import java.io.BufferedReader;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Queue;
import java.util.ResourceBundle;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinTask;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.print.attribute.HashAttributeSet;



public class Whiz1 {
public class inner implements Callable<String>{
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub	
		Integer c;
		return null;
	
	}
	
}
	public static void main(String[] args) {
		Consumer<Integer> cons = System.out::println;
		Predicate<Integer> pred = yyyy -> yyyy>4;
	
		Period.ofWeeks(1);

		Locale loc;
		IntConsumer ic = x ->x++;
		IntFunction<Integer> iff = x ->x++;
		Instant ins = Instant.now();
		Integer inter;
		Year y;
		Period p= null;
//		Comparator<String> stt = Comparator.co	
		System.out.println(p.ofDays(-5).plusMonths(1));
		Instant i = Instant.now();
		
		DoubleSupplier ds = () -> Math.random()*10;
		DoubleBinaryOperator db;
		ResourceBundle rb;
		Duration d;
	
		List<String> l = new ArrayList<>();
		l.add("1");
//		l.stream().finda
	Double collect = l.stream().collect(Collectors.averagingInt(a ->a.length()));
		char[] cc = new char[] {1,2};
		Double aad =12.9;
		int ijk = aad.intValue();
		System.out.println(ijk);
		for (int ccc:cc) {}
		DoubleStream aaaa = DoubleStream.of(1);
		DoubleStream of = aaaa;
		boolean allMatch = of.
				peek(v ->System.out.println((int)v))
				.limit(2).allMatch(dxx ->dxx<0);
		Optional<String> o;
		Consumer c;
	Integer m;
	LocalDate ld1;
	Period per;

		List list;
		
		Collection col;
		ArrayDeque que;
		XYZ xyz = new XYZ() {
		};
		xyz.p();
//		Integer i;
		
		OptionalInt oisInt = OptionalInt.of(1);
		Callable ccc;
		Math.random();
		Function f;
//		Consumer cc;
		BooleanSupplier b;
		Map map = new HashMap();
		map.remove("1", "2");
	
		List<? extends Number> ln = new ArrayList<>();
//		ln.add(new Integer(10));
		
		
		
		BasicFileAttributes bfa;
	
	}
}
abstract class XYZ{
	@Override
	public String toString() {
		TreeMap<Whiz1, String> tm = new TreeMap<Whiz1, String>();
		tm.put(new Whiz1(), "1!");
		
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	public void p(){
		System.err.println("hi");
	}
}