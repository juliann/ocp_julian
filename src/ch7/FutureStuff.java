package ch7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureStuff {

	
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		Runnable r = new Futuristic();
		ExecutorService es = null;
		try {
			es = Executors.newSingleThreadExecutor();
			Future<?> e = es.submit(r);
			System.out.println(e.isCancelled());
			System.out.println(e.isDone());
			System.out.println(e.cancel(true));
			System.out.println(e.get(4, TimeUnit.SECONDS));
		
			es.shutdownNow();
			System.out.println(e.isCancelled());
			System.out.println(e.isDone());
			
		}finally {
			es.shutdown();
		}
	}
	static class Futuristic implements Runnable{
		@Override
		public void run() {
			System.out.println("hji");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
