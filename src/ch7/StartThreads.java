package ch7;

import java.util.Random;
import java.util.stream.IntStream;

public class StartThreads {

	static class MyThread extends Thread{
		
		public void run() {
			System.out.println("MyThread started");
			System.out.println("MyThread finished");
			System.out.println(Math.sqrt(13));
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		
		

		
		Runnable r = new MyRunnable();
		Thread newThread = new Thread(r);
		newThread.start();
		
		Runnable rL = () ->{
			System.out.println("LambdaRunner started");
			System.out.println("LambdaRunner finished");
			IntStream ra = new Random().ints();
			ra.parallel().map((x) -> x*x).limit(10000000).forEach(System.out::println);
			
			System.out.println(Thread.currentThread().getName());
			
		};
		
		Thread newThread2 = new Thread();
		newThread2.start();
		
		Thread newThread3 = new Thread("Threadnames are dumb");
		newThread3.start();
		System.out.println(newThread3.getName());
		
		System.out.println(Thread.currentThread().getName());
	}
	
	static class MyRunnable implements Runnable{
		@Override
		public void run() {
			System.out.println("MyRunnable started");
			System.out.println("MyRunnable finished");
			System.out.println(Math.sqrt(13));
			System.out.println(Thread.currentThread().getName());
			
		}
	}
}


