package ch7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableStuff {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = null;
		try {
			es = Executors.newSingleThreadExecutor();
			Future<Integer> fInt= es.submit(() -> 5);
			fInt.isDone();
			System.out.println(fInt.get());
			
			//muss <Integer> sein, <?> verwirrt compiler
			List<Callable<Integer>> al = new ArrayList<>();
			al.add(() -> 7);
			al.add(() -> 3*1);
			List<Future<Integer>> fl = es.invokeAll(al);
			
			fl.forEach(x -> {
				try {
					System.out.println(x.get());
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			
		}finally {
			es.shutdown();
		}
	}
}
