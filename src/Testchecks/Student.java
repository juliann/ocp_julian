package Testchecks;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;



public class Student implements Comparator{  
	private String name;  
private int marks;     



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public Student(String name, int marks) {
	super();
	this.name = name;
	this.marks = marks;
}
public void addMarks(int m){    
	 this.marks += m;     }   
public void debug(){       
	 System.out.println(name+":"+marks); 
	 } 
public static void main(String[] args) {
	List<Student> slist = Arrays.asList(new Student("S1", 40), 
			 new Student("S2", 35), 
			 new Student("S3", 30));
	
	Optional<String> a = Optional.empty();
	Optional<String> of = a.of("a");
	System.out.println(of);
    Map<String, Integer> map = new HashMap<>();    
    map.clear();
    List<StringBuilder> ls = new ArrayList<StringBuilder>();
    Stream<List<String>> s1 = Stream.of(            
			 Arrays.asList("a", "b"),  
			 Arrays.asList("a", "c")     
			 );
	   Stream<String> news = s1.filter(s->s.contains("c"))   
			   .flatMap(olds -> olds.stream());  
	   news.forEach(System.out::print); 
	}
@Override
public int compare(Object o1, Object o2) {

	return 0;
}
}
class TT implements Callable<String>
{
	
public String call()  {
	// TODO Auto-generated method stub
	PrintWriter pw= null;
	ReentrantLock rl = new ReentrantLock();
	rl.lock();
	rl.lock();
	BufferedReader br;
	 Stream<List<String>> s1 = Stream.of(            
			 Arrays.asList("a", "b"),  
			 Arrays.asList("a", "c")     
			 );
	   Stream<String> news = s1.filter(s->s.contains("c"))   
			   .flatMap(olds -> olds.stream());  
	   news.forEach(System.out::print); 
	   ArrayBlockingQueue aq;
	   
	
	return null;
}}
interface Y{}
enum GZUIOA implements Y{
	
} 

class Game{ } class Cricket extends Game{ } class Instrument{ } 
class Guitar extends Instrument{ }  interface Player<E>{ void play(E e); } 
interface GamePlayer<E extends Game> extends Player<E>{ }
interface MusicPlayer<E extends Instrument> extends Player{ }

class MidiPlayer implements MusicPlayer { 
	
	public void play(Guitar g){ }
	@Override
	public void play(Object e) {
		HashMap hm = new HashMap();
	
		
	} }
interface Measurement{ 
	int INTAS = 1;
	public default  int getUnit()
	{ return 100; } }

class TA extends Thread{
	void dos() throws  IOException, SQLException {
		System.out.println(((Measurement)this).INTAS);
		TreeSet<TA> ts = new TreeSet<>();
	
		ResourceBundle rb = ResourceBundle.getBundle("");
		try(InputStream is = new FileInputStream("")){
			int i;
			doss();
//			System.out.println(i);
			i=is.read();
		}catch(Exception e) {
			Stream.of(1);
			ArrayDeque ad;
			ArrayBlockingQueue abq;
		
		}
	}
	void doss() throws SQLException{}
}
class RunTest {   
	static class Runner implements Runnable{  
		public void run(){      
			System.out.println("In Run"); 
			}     }  
	public static void main(String[] args) { 
		Runner r = new Runner();    
		Thread t1 = new Thread(r); 
		Thread t2 = new Thread(r);   
t1.start();   
t2.start();   
}   
	}