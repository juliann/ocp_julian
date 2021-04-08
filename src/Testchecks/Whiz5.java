package Testchecks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.text.DateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import jdk.internal.misc.FileSystemOption;

public class Whiz5 {
	public static void main(String[] args) throws IOException {
		T.print("hi");
		Instant iii;
	
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
		HashMap<String, String> hm = new HashMap<>();
		ArrayList a = new ArrayList<>();
//		hm.put(null,"1");
	ExecutorService es;

Path p;
PathMatcher pm;
IntFunction in = ina -> ina*2;
IntFunction in2 = Integer::toString;
Duration du;
Map map = new ConcurrentHashMap<>();



		System.out.println(hm);
		String st;
		LocalDate ld;
		Duration d;
		Period pt;
//		OptionalInt.of(1).or
		IntStream.of(1).min();
	
		Optional o = Optional.empty();
		
//				Stream of = Stream.of(1.1,2.2);
//				of.mapToInt(Double::intValue);
//		boolean out = stream.allMatch( in -> in instanceof Number);
		Optional<Boolean> ob = Optional.of(false);
		System.out.println(ob);
//		System.out.println(out);
		ArrayDeque ad;
//		Path p = Paths.get("");
//		PosixFileAttributes pf = Files.readAttributes(p, PosixFileAttributes.class);
//		System.out.println(pf.group().getName());
//		System.out.println(pf.group());
		ObjectOutputStream oos;
//		oos.writeInt(12);
		System.out.println("hi 2");
		File f;
		LocalDateTime ldt;
		Period ppp;
	Comparable com = new Comparable() {

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
		}
		
		catch(RuntimeException r) {throw r;}
	}

}
enum Days{
	
	MARCH,
	APRIL;
	 int age;
}