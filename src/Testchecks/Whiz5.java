package Testchecks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import jdk.internal.misc.FileSystemOption;

public class Whiz5 {
	public static void main(String[] args) throws IOException {
		T.print("hi");
		
		Path p = Paths.get("\\\\TOWER\\TV Shows\\Youtube\\Java OCP");
//		Files.list(p).forEach(System.out::println);
//		PosixFileAttributes pf = Files.readAttributes(p, PosixFileAttributes.class);
//		System.out.println(pf.group().getName());
//		System.out.println(pf.group());
		
	}
}
 class T{
//	public  void print(String...strings ),FileNotFoundException;
	public static void print(String s) throws IOException {
		try {
			System.out.println("hi");
		Integer i;
		ConcurrentHashMap<String, String> hm = new ConcurrentHashMap<>();
//		hm.put(null,"1");
		System.out.println(hm);
		String st;
		LocalDate ld;
		Duration d;
		Period pt;
//		OptionalInt.of(1).or
		IntStream.of(1).min();
	
		Optional o = Optional.empty();
		
				Stream of = Stream.of(1.1,2.2);
				of.mapToInt(Double::intValue);
//		boolean out = stream.allMatch( in -> in instanceof Number);
		Optional<Boolean> ob = Optional.of(false);
		System.out.println(ob);
//		System.out.println(out);
		ArrayDeque ad;
		Path p = Paths.get("");
//		PosixFileAttributes pf = Files.readAttributes(p, PosixFileAttributes.class);
//		System.out.println(pf.group().getName());
//		System.out.println(pf.group());
		ObjectOutputStream oos;
//		oos.writeInt(12);
		System.out.println("hi 2");
		File f;
		LocalDateTime ldt;
		Period ppp;
		ppp.nor
		}
		
		catch(RuntimeException r) {throw r;}
	}

}
enum Days{
	
	MARCH,
	APRIL;
	 int age;
}