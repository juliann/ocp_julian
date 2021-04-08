package Testchecks;

import static java.nio.file.LinkOption.*;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ASS {
private static final String Arrays = null;

final public static void main(String[] args) throws ParseException {
//	 Path p = Paths.get(".").normalize();
//	   p.subpath(1, 2);
//	   Files f;
	if(new File("").exists()) {
       
     } else {
         new File("").mkdir();
     }

	 LocalDate ld = LocalDate.now();
	 System.out.println(ld.plusDays(1).plusMonths(1).plusMonths(1).plusDays(1));
	 File f = new File("E:\\gdocks\\OCP");
	 System.out.println(f.exists());
	 Instant i = Instant.now();
	 Stream<Integer> is;
		final int iaa= 1;
		 
	 IntSupplier a;

//	 System.out.println(i.plus(1, ChronoUnit.HOURS));
//	 NumberFormat currFormatDE = NumberFormat.getCurrencyInstance ();
//	 System.out.println(currFormatDE.parse("$45"));
	ZonedDateTime td = ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("GMT+1"));
	System.out.println(td);
	Reader r;
	InputStream isss;
	IntStream t;
	ArrayDeque<String> ad;
	Properties p;
	  Predicate<String> second = xxt -> "bob".equalsIgnoreCase(xxt);
	
	
}
}
interface b{}
enum A implements b{} 
class c implements b{
	
	b i = new c();
	Runnable r1 = () -> Stream.of(1,2,3).parallel();
	public int gib() {
		// TODO Auto-generated method stub
		return 0;
	}
}
