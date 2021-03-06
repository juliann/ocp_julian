package ch1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public  class LocalInner  {

	int length = 5;
	 
	 
	void calc() {
		Stream<String> a = Stream.of("1");
		a.forEach(System.out::println);
		TreeMap<String, Integer> m = new TreeMap<>();
		List<String> l = new ArrayList<>();
		TreeSet<String> ss=new TreeSet<>();
		Queue q = new ArrayDeque();
		List<Integer> ll = new LinkedList<>();
		Map map = new TreeMap<>(m);
		List llll= (List) map.values();
		
		

//		TreeSet<String> t = new Tree
		
		
		int w=20;
		
		class Inner{
			
			void multiply() {
				System.out.println(w*length);
			}
		}
		Inner i = new Inner();
		i.multiply();
	}
	public static void main(String[] args) {
		LocalInner l = new LocalInner();
		l.calc();
		
	}
}
