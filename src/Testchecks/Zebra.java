package Testchecks;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import ch4.Ding;

public class Zebra implements Serializable {
	   private static final long serialUID = 1L;
	   private transient String name = "George";
	   private static String birthPlace = "Africa";
	   private transient Integer age;
	   private java.util.List<Zebra> friends = new java.util.ArrayList<>();
	   private Object tail = null;
	   { age = 10;}
	   public Zebra() {
	      this.name = "Sophia";
	   }
	   
	   
	   @Override
	public String toString() {
		return "Zebra [name=" + name + ", age=" + age + ", friends=" + friends + ", tail=" + tail + "]";
	}


	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println(Instant.now().truncatedTo(ChronoUnit.MONTHS));
		LocalDateTime ld;
		Predicate c; 
		File f = new File ("c://test2/file.txt");
		//   f.createNewFile();
		 try {
			Ding makeDing = Ding.makeDing();
//			List.of(makeDing).stream().flatMap(x -> x.getDates().stream()).
		 }catch(Exception e) {}
//		   Console c = System.console();
		
		//		  boolean b =  c.reader().read() != 'x';
//		   OutputStream oss;
//		   InputStream iss;
//		   Writer w;
//		   w.app
//		   Reader r;
//		   r.re
//		 c.writer() ;
//		   BufferedWriter bcc= new Buff;
//		   InputStream inp;
		try(ObjectOutputStream o = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(f)));
			
				){
			Zebra z = new Zebra();
			System.out.println(z.name);
			o.writeObject(z);
			   File g = new File ("c://test2/file.txt");
			try(ObjectInputStream oi = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(g)));){
			Object obj = oi.readObject();
			if (obj instanceof Zebra) {
			Zebra z2 = (Zebra) obj;
			
			System.out.println(z2);
			}}
		}
	}
	}
interface AAA{
	
}