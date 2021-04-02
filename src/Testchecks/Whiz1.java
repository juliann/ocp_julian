package Testchecks;

import java.nio.file.DirectoryNotEmptyException;
import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.time.Year;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Queue;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinTask;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import javax.print.attribute.HashAttributeSet;



public class Whiz1 {
public class inner implements Callable<String>{
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub	
		return null;
	}
	
}
	public static void main(String[] args) {
		Consumer<Integer> cons = System.out::println;
		Predicate<Integer> pred = yyyy -> yyyy>4;
		Thread tt;
		Locale loc;
	
		Instant ins = Instant.now();
		
		Year y;
		Period p= null;
//		Comparator<String> stt = Comparator.co	
		System.out.println(p.ofDays(-5).plusMonths(1));
		Instant i = Instant.now();
		
		DoubleSupplier ds = () -> Math.random()*10;
		DoubleBinaryOperator db;
		
		List<String> l = new ArrayList<>();
		l.add("1");
	Double collect = l.stream().collect(Collectors.averagingInt(a ->a.length()));
		char[] cc = new char[] {1,2};
		for (int ccc:cc) {}
		DoubleStream aaaa = DoubleStream.of(1);
		DoubleStream of = aaaa;
		boolean allMatch = of.peek(v ->System.out.println((int)v)).limit(2).allMatch(d ->d<0);
		Optional<String> o;

		DoubleStream.of(1);
		List list;
		Collection col;
		ArrayDeque que;
		XYZ xyz = new XYZ() {
		};
		xyz.p();
//		Integer i;
		
		OptionalInt oisInt = OptionalInt.of(1);
		
		Math.random();
		Function f;
//		Consumer cc;
		BooleanSupplier b;
		Map map = new HashMap();
		map.remove("1", "2");
		
		List<? extends Number> ln = new ArrayList<>();
//		ln.add(new Integer(10));
//		ln
	}
}
abstract class XYZ{
	public void p(){
		System.err.println("hi");
	}
}