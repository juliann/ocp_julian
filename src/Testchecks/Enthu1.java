package Testchecks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Enthu1 {
	
	Map<String, List<Double>> groupedValues = new HashMap<>();
	
	public static void main(String[] args) {
		
		Enthu1 e1 = new Enthu1();
		e1.groupedValues.put("1", new ArrayList<Double>());
		e1.groupedValues
		.computeIfAbsent("1", x -> new ArrayList<Double>())
		.add(5.0);
		
		
	}

	public void process(String name, Double value) {
	 List<Double> values = groupedValues.get(name); 
	 if(values == null){       
		 values = new ArrayList<Double>();       
		 groupedValues.put(name, values);     } 
	 values.add(value); }
}
