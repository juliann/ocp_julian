package Testchecks;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Line {
	static BlockingDeque<Integer> queue = new LinkedBlockingDeque<>();
	   public static void main(String[] participants) throws Exception {
		   
		   System.out.println(Collectors.
		   
	      IntStream.iterate(1, i -> i+1).limit(5)
	         .parallel()
	       
	         .forEach(s -> {
				try {
					queue.offerLast(s,10000,TimeUnit.MILLISECONDS);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
	      IntStream.iterate(1, i -> 5).limit(10)
	         .parallel()
	         .forEach(s -> {
				try {
					queue.pollFirst(10,TimeUnit.SECONDS);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
	      System.out.print(queue.size());
	   }
	}

