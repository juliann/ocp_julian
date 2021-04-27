package Testchecks;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EnthuFinal {
	static int type =10;

public static void main(String[] args) {
	 IntSummaryStatistics collect = Stream.of(1,2).collect(Collectors.
			 mapping(x->x, Collectors.summarizingInt(x->x)));
			
	 System.out.println();
	
	System.out.println("hi");
	Path p = Paths.get("C:\\Users\\julian\\Nextcloud\\Books");
	p.getFileName();
	System.out.println(p);
	System.out.println("hi");
	File p1;
	Map m;
	
	List<String> list = new ArrayList<>(); list.add("A");
	list.addAll(new ArrayList<>());
	String[] a = null;
	Double collecta = Stream.of(1).collect(Collectors.averagingInt(x ->x));
	//Arrays.binarySearch(a,"0");
	String aaa = null;
	  Optional<String> stro = Optional.of(aaa);//1
	  System.out.println(stro);
}
void dops(int i) {
	type = 20;
	System.out.println(type);
}

}
class En extends EnthuFinal{
	void dops(int i) {
		type = 20;
		System.out.println(type);
	}

}
















interface Eatable{   
//	int types = 10; 
	} 
class Food implements Eatable {  
	
	public static int types = 20;
	}
 class Fruit extends Food implements Eatable
 {  //LINE1        
	 public static void main(String[] args) 
 	{         types = 30; //LINE 2       
	System.out.println( types); //LINE 3   
	System.out.println( types); //LINE 3   
}
 }