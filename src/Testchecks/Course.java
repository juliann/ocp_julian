package Testchecks;

import java.io.InvalidClassException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Course{ 
	private String id;  
	private String category;    
	public Course(String id, String category){     
		this.id = id; this.category = category;     }    
	public String toString(){      
		
		return id+" "+category; 
		}    

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		

		map.put(1, "z");
		map.put(2, "2");
		map.put(3, "4");
		map.put(4, "5");
		

		map.forEach((k,v)->System.out.println(k+" "+v));
		Stream<Map<Integer,String>> mapStream = Stream.of(map);
		map.entrySet().stream().forEach(System.out::println);
	//	mapStream.peek(System.out::print).forEach( (m) -> System.out.println(m) );
	 
	   List<Course> s1 = Arrays.asList(   
			   new Course("OCAJP", "Java"),   
			   new Course("OCPJP", "Java"),  
			   new Course("C#", "C#"),     
			   new Course("OCEJPA", "Java") );
	   s1.stream();
	   Map m;
	 
}
	}