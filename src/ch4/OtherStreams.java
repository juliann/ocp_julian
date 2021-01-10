package ch4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import helper.SNP;

public class OtherStreams {
	
	
	public static void main(String[] args) {
	//	testFileStream();
		testArrayStream();
	//	testMapStream();
	//	testMapStream2();
		
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

	static void testFileStream() {
		List<SNP> listOfGenomeData = new ArrayList<>();
		
		Path genes = Paths.get("E:\\gdocks", "Downloads","ManuSporny-genome.txt");
		System.out.println(Files.exists(genes));
		
		try(Stream<String> stream = Files.lines(genes)){
			stream
			.filter( lines -> lines.startsWith("#") == false )
			.forEach(
				line ->{
					String[] arr = line.split("\t");
					SNP snp = new SNP(arr[0], arr[1], Long.parseLong(arr[2]), arr[3]);
					listOfGenomeData.add(snp);
					System.out.println(listOfGenomeData);
			});
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
