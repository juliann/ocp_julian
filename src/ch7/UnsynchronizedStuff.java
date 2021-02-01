package ch7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class UnsynchronizedStuff {
	
	int sheepcount=0;
	private void incr() {
		int ausgabe = ++sheepcount;
		System.out.println(ausgabe+" ");
	}
	public static void main(String[] args) {
		ExecutorService es = null;
		ScheduledExecutorService es1 = null;
		
		try {
			es=Executors.newFixedThreadPool(20);
		//	es1=Executors.newScheduledThreadPool(10000);
		//	es1.scheduleAtFixedRate((()->System.out.println("hi")), 1, 1, TimeUnit.SECONDS);
			UnsynchronizedStuff us = new UnsynchronizedStuff();
			for (int i=0; i<10; i++) {
				es.submit(() -> us.incr());
			}
		}finally {
			if(es!=null)es.shutdown();
		}
	}
}
