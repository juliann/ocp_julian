package Testchecks;

import java.nio.file.AccessDeniedException;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.DoubleSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Enthu1 {
	
	Map<String, List<Double>> groupedValues = new HashMap<>();
	
	public static void main(String[] args) {
		
		Enthu1 e1 = new Enthu1();
		e1.groupedValues.put("1", new ArrayList<Double>());
		e1.groupedValues
		.computeIfAbsent("1", x -> new ArrayList<Double>())
		.add(5.0);
		Duration d = Duration.between(LocalDate.now(), 
				LocalDate.of(2015, Month.SEPTEMBER, 1)); 
		System.out.println(d);
		Map m;
		List t;
//		t.rep
		Set<String> s=null;
		LinkedList lk;
//		 s.stream().collect(Collectors.su
	
	}

	public void process(String name, Double value) {
	 List<Double> values = groupedValues.get(name); 
	 if(values == null){       
		 values = new ArrayList<Double>();       
		 groupedValues.put(name, values);     } 
	 values.add(value); }
}
