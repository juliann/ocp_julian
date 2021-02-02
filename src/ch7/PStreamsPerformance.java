package ch7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PStreamsPerformance {
	
	int processRecords(int input) {
		try {
			Thread.sleep(10);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		return input+1;
	}
	
	void processData(List<Integer> data) {
		data.stream().map(a->processRecords(a)).count();
	}
	
	void processDataParalell(List<Integer> data) {
		data.parallelStream().map(a->processRecords(a)).count();
		
	}
	
	public static void main(String[] args) {
		PStreamsPerformance pd = new PStreamsPerformance();
		
		String[] arr = {"a", "b", "aa", "bb"};
		
		Map<Integer, String> collect = Stream.of(arr).parallel().collect(Collectors.toMap(d->d.length(), e->e, (a,b) -> a));
		System.out.println(collect);
		//System.out.println(Runtime.getRuntime().availableProcessors());
		
		List<Integer> data = new ArrayList<>();
		for (int i=0;i<4000;i++) {
			data.add(i);
		}
		long start = System.currentTimeMillis();
		//pd.processDataParalell(data);
		pd.processData(data);
		double time = (System.currentTimeMillis()-start)/1000.0;
		System.out.println(time);
	}
}
