package ch7;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class ForkJoin extends RecursiveAction{

	private int start;
	private int end;
	private Double[] weights;
	
	public ForkJoin(int start, int end, Double[] weights) {
		super();
		this.start = start;
		this.end = end;
		this.weights = weights;
	}
	
	protected void compute() {
	
		if (end-start<=4) {
//			System.out.println(" true start: " + start + " end: " + end );
			for (int i=start;i<end;i++) {
				weights[i] = ThreadLocalRandom.current().nextDouble();
				System.out.println("Animal weighed Animalnumber: " + i);
			}
		}else {
			int middle = start+((end-start)/2);
			System.out.println("false start: " + start + " end: " + end + " middle: " +middle);
			invokeAll(new ForkJoin(start, middle, weights),new ForkJoin(middle, end, weights));
		
		}
	}
	
	
	
	public static void main(String[] args) {
//		System.out.println(fact(18));
	
		Double weights[] =new Double[10];
		ForkJoinTask<?> task = new ForkJoin(0,weights.length, weights);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);
		Stream.of(weights).forEach(System.out::println);
	}

	private static long fact(long i) {
		if(i<=1) return 1;
		else return i*fact(i-1);
		
	}
}
