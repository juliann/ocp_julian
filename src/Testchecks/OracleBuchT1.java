package Testchecks;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

import com.sun.tools.javac.tree.TreeMaker;

import ch1.A;

public class OracleBuchT1 {
	static interface B{
		public static int i=1;
	}
	class BBCV{
		int i;
		static final int b=2;
	
		Thread a = new Thread();
		void dos() {a.start();}
	}
	 
	static class A extends AAAA{
class BBBBBB extends OracleBuchT1{}
		public A(String string) {
			// TODO Auto-generated constructor stub
		}}
	final class UZ{
		class ZZ{}
	}
	static Animals a;
public static void main(String[] args) {
	Queue q;
	Object o;
	System.out.println(a.DOG.sound);
	Animals[] ab = 	Animals.values();
	System.out.println(ab[0]);
	OracleBuchT1.A a = new OracleBuchT1.A("hi") {};
		TreeMap tm = new TreeMap<>();
	System.out.println(List.of(1,2,3));
	PriorityQueue<String> pq = new PriorityQueue<>();

	pq.add("a");
	pq.add("b");
	pq.add("c");
	pq.add("d");
	pq.add("e");
	pq.add("f");
	pq.add("g");
	pq.add("h");
	pq.add("j");
	pq.add("k");
	pq.add("l");
	pq.add("m");
	pq.add("n");
	pq.add("o");
	pq.add("p");
	pq.add("q");
	pq.add("r");
	pq.add("s");
//	System.out.println(pq);
	
	
	LocalDateTime ldt = LocalDateTime.of(2017, 12, 02, 6, 0, 0);  
	
	ZonedDateTime nyZdt = ldt.atZone(ZoneId.of("America/New_York")); 
	System.out.println(nyZdt);
	ZonedDateTime laZdt = ldt.atZone(ZoneId.of("America/Los_Angeles"));
	System.out.println(laZdt);
	Duration d = Duration.between(nyZdt, laZdt);
	System.out.println(d);
	
	
	
	
	
}
}
enum Animals{
	DOG("Woof");
	String sound;
	private Animals(String s) {
		sound = s;
	
	}
}