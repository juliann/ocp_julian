package Testchecks;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.util.Comparator;
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Arr extends ListResourceBundle{
@Override
protected Object[][] getContents() {
	// TODO Auto-generated method stub
	return null;
}

public static void main(String[] args) {
	String[][] s = new String[10][10] ;
	s[0][0] = "hi";
	s[1][0] = "hallo";
	s[1][0] = "bye";
	s[1][1] = "tschüss";

	for(String[] i :s) {
		for (String st :i) {
			System.out.println(st);
		}
	}
	Predicate<String> p = (a) -> a.contains("b");
	ConcurrentMap cm;
	AtomicInteger i;
	System.out.println(Month.JANUARY.ordinal());
	Period p0;
	Duration d;
	LocalDateTime localDateTime= LocalDateTime.now();
	NumberFormat us = NumberFormat.getInstance(Locale.US);
//	PrintWriter pw = new PrintWriter("");
//		BufferedReader br = new BufferedReader("");
			
	try {
		Number parse = us.parse("123x");
		System.out.println(parse);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Runnable r = ()->System.out.println("hi");
	r.run();
	ExecutorService es = Executors.newSingleThreadExecutor();
	Future<?> submit = es.submit(r);
	
}
}
