package ch7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PStreams {
	public static void main(String[] args) {
		Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
		stream.forEach(System.out::println);
		System.out.println("---");
		Arrays.asList(1,2,3,4,5,6).stream().parallel().forEach(System.out::print);
		System.out.println("\n---");
		Arrays.asList(1,2,3,4,5,6).stream().parallel().sorted().forEach(System.out::print);
		System.out.println("\n---");
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6);
		asList.sort(Comparator.naturalOrder());
		asList.stream().parallel().forEach(System.out::print);
		System.out.println("\n---");
	
		
		Arrays.asList(1,2,3,4,5,6).stream().parallel().forEachOrdered(System.out::print);
		List<Character> c = Arrays.asList('a');
		
		System.out.println();
		String reduce = c.stream().reduce("1", (y,b) ->b+y, (g,d) ->g+d);
	//	String reduce = c.stream().reduce
	//	System.out.println(reduce);
		//System.out.println(c);
		Arrays.asList(1,2,3,4,5,6).stream().parallel().reduce((u,b) -> u+b);
		HashSet<Integer> collect = Arrays.asList(1,2,3,4,5,6).stream().parallel().collect(Collectors.toCollection(HashSet::new));
		String reduce2 = Arrays.asList("w","o","l","f").parallelStream().reduce("x", (a,b)->a+b);
		System.out.println(reduce2);
		Set<String> collect2 = Arrays.asList("w","o","l","f").parallelStream().collect(Collectors.toSet());
		System.out.println(collect2);
		
		System.out.println("\n\n" + Arrays.asList("w","o","l","f").parallelStream().reduce("", (a,b)->a+b));
		
		System.out.println("\n\n" + Arrays.asList(1,2,3,4,5,6,7,8).stream().reduce(1,(a,b)->a*b, (e,d) ->e+d));
	}
}
