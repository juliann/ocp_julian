package Testchecks;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class Enthu4  {
	  public static enum EnumC{ C, CC, CCC }; 
public static void main(String[] args) throws FileNotFoundException  {

	
	
	Path p2 = Paths.get("\\yellowstone");
	 System.out.println(p2.isAbsolute());
	 
    Duration du = Duration.ofMillis(1100);
    System.out.println(du); 
    du = Duration.ofSeconds(61);
    System.out.println(du);
  String a;
  Duration dua = Duration.ofHours(1);
  Period pe;
 
	
	List li = new ArrayList<>();
	
	assert li==null:li=null;
	String s;
	int i = Integer.MAX_VALUE;
	Console c = System.console();
//	c.readLine();
	    Path p1 = Paths.get("c:\\a\\b\\c");
	    String x = p1.getName(1).toString();    
	    String y = p1.subpath(1,2).toString();
	    System.out.println(x+" " + y);
	   double d =i;
	 HashSet hs;
	 
	    Map<String, Integer> map1 = new HashMap<>();
	    map1.put("a", 1); map1.put("b", 1);
	    map1.merge("b", 1, (i1, i2)->i1+i2); 
	    map1.merge("c", 3, (i1, i2)->i1+i2);
	    System.out.println(map1);
	    assert false : null;
	    List<String> lia = new ArrayList<String>(10);
	    ExecutorService es =  Executors.newSingleThreadExecutor();     
	    Future<String> future = es.submit(() ->"hu");
	  PrintWriter pw = new PrintWriter("");
	  ConcurrentMap<String, Object> cache = new ConcurrentHashMap<>();
	 
//	LocalDateTime ltd = LocalDateTime.ofInstant(readyTime, ZoneId.of("GMT+2"));
}

}

