package ch4;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


import helper.SNP;

public class OtherStreams {
	
	
	public static void main(String[] args) throws URISyntaxException {
//		testFileStream();
	//	testArrayStream();
	//	testMapStream();
	//	testMapStream2();
	//	sumint();
//		reduceS();
//		reduceS2();
		Optional<String> o = Optional.of("123");
		
		Map<String, String> sm = new HashMap<>();
//		sm.st
//		Stream aus Java 1.9
//		o.stream().forEach(System.out::println);
//		Optional<Integer> map = Optional.of(null);
//		System.out.println(map.isPresent());
		
//		Optional<Integer> map = o.map(y -> y.length());
//		map.stream()
		Stream<Boolean> bools = Stream.iterate(true,  x -> !x);
		List<Boolean> map = bools.limit(1)
		    .collect(Collectors.toList());
//		System.out.println(map);
//		System.out.println(map);
		Map<String,String> m = new HashMap<>();
		m.put("1", "a");
		m.put("1", "b");
		System.out.println(m);
		Set<String> set = new HashSet<>();
		set.add("tire-");
		List<String> list = new LinkedList<>();
		Deque<String> queue = new ArrayDeque<>();
		queue.push("wheel-");
		Stream.of(set, list, queue)
		   .flatMap(x -> x.stream())
		   .forEach(System.out::print);
		Comparator c;
	
		
	}
	
	

	private static void reduceS2() {
		List<Integer> intList = Arrays.asList( 1,2,3,4,5);
		Character c;
		Stream s; 
		intList.stream().collect(Collectors.toMap(x->x, y->y+1));
		long l = 1;
//		int i = l;
//		s.collect()
//		Stream.of(intList).collect(Collectors.tol)
	
		
//		intList.stream().map
//		Function<T, R>
//		throw new Error();
//		int oi = 	intList.stream().reduce(1, (h,c) -> h+c);
//			System.out.println(oi);
	
		
	}



	private static void reduceS() {
		List<Integer> intList = Arrays.asList( 1,2,3,4,5);
	Optional<Integer> oi = 	intList.stream().reduce((h,c) -> h+c);
		System.out.println(oi);
	}



	private static void sumint() {
		List<Integer> intList = Arrays.asList( 1,2,3,4,5);
		int i = intList.stream().collect(Collectors.summingInt(x -> x.intValue()));
		System.out.println("here"+i);
		
	}



	private static void testMapStream() {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("hallo", 1);
		map.put("du", 2);
		map.put("nuss", 3);
		map.put("tschüss", 2);
		
		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() 
				+ " " + e.getValue()));
	
		
		
	}
	
	private static void testMapStream2() {
		Map<String, List<Integer>> map = new HashMap<>();
		map.put("hallo", Arrays.asList(1,2,3,4));
		map.put("du", Arrays.asList(7,9,0,1));
		map.put("nuss", Arrays.asList(5,1,2,8));
		map.put("tschüss", Arrays.asList(1,2,3,4));
		map.entrySet().stream()
		.forEach(e -> System.out.println(e.getKey() + e.getValue()));
		
	}

	private static void testArrayStream() {
		Integer[] intArr = {1,2,3,4,5};
		//Stream<Integer> strStr= Stream.of(intArr);
		Stream<Integer> strStr= Arrays.stream(intArr);
		strStr
		.filter(i -> i%2==0)
		.forEach(System.out::println);
		
		long count = Arrays.stream(intArr).count();
		System.out.println("count: "+count);
	}

	static void testFileStream() throws URISyntaxException {
		List<SNP> listOfGenomeData = new ArrayList<>();
		
		Path genes = Paths.get("E:\\gdocks", "Downloads","ManuSporny-genome.txt");
	
	
		
		try(Stream<String> stream = Files.lines(genes)){
			stream
			.filter( lines -> lines.startsWith("#") == false )
			.forEach(
				line ->{
					String[] arr = line.split("\t");
					SNP snp = new SNP(arr[0], arr[1], Long.parseLong(arr[2]), arr[3]);
					listOfGenomeData.add(snp);
					
			});
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		System.out.println(listOfGenomeData.size());
	}
}
