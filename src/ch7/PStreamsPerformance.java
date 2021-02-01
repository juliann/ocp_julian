package ch7;

import java.util.ArrayList;
import java.util.List;

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
