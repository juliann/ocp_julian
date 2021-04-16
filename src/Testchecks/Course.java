package Testchecks;

import java.io.InvalidClassException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Course{ 
	private String id;  
	private String category;    
	public Course(String id, String category){     
		this.id = id; this.category = category;     }    
	public String toString(){      
		return id+" "+category;     }    

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
		
	 
	   List<Course> s1 = Arrays.asList(   
			   new Course("OCAJP", "Java"),   
			   new Course("OCPJP", "Java"),  
			   new Course("C#", "C#"),     
			   new Course("OCEJPA", "Java") );
	   s1.stream();
}
	}