package Testchecks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fun extends RecursiveTask<Integer> {
	   final int value;
	   public Fun(int value) {
		  AtomicInteger i = new AtomicInteger();
		  i.set(1);
		  System.out.println(i);
		  
	      this.value = value;
	   }
	   @Override protected Integer compute() {  // w1
	      if(value<1) {
	    	  System.out.println(Thread.currentThread().getName());
	         return 1;
	      }
	      final Fun f1 = new Fun(value-1);
	      final Fun f2 = new Fun(value-2);
	      f1.fork();
	      
	      return f2.compute()+f1.join();
	   }
	   public static void main(String... data) {
	      ForkJoinPool pool = new ForkJoinPool();
	      try {
	         System.out.print(pool.invoke(new Fun(10)));
	      } finally {
	         pool.shutdown();
	      }
	ExecutorService es = Executors.newCachedThreadPool();
	Future x = es.submit(()->  System.out.println("h"));
LinkedBlockingDeque<String> e;
Stream<Integer> s = Arrays.asList(1,2,3).stream();
List<String> li = new ArrayList<>();
li.add("1");
li.add("2");
li.add("3");
CyclicBarrier cb;
RecursiveTask<String> r;

li.stream()
.parallel()
.peek((i)-> 
	{System.out.println(li.remove(i));
	System.out.println(i);})
.forEach(System.out::println);
System.out.println(li);


	   }
	}