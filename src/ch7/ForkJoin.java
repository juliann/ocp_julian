package ch7;

import java.util.Random;
import java.util.concurrent.RecursiveAction;

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
	
		if (start-end<=3) {
			for (int i=start;i<end;i++) {
				weights[i] = (double) new Random().nextInt(100);
				System.out.println("Animal weighed Animalnumber: " + i);
			}
		}else {
			int middle = start+((end-start)/2);
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(fact(11));
	}

	private static int fact(int i) {
		if(i<=1) return 1;
		else return i*fact(i-1);
		
	}
}
