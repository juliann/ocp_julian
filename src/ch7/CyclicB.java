package ch7;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class CyclicB {

	void removeA() {
		System.out.println("removeA");
	}
	void cleanPen() {
		System.out.println("cleanPen");
	}
	void addA() {
		System.out.println("addA");
	}
	
	void performTask(CyclicBarrier c1,CyclicBarrier c2) {
		try{
			removeA();
			c1.await();
			cleanPen();
			c2.await();
			addA();
		}catch (InterruptedException| BrokenBarrierException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		CyclicB cb = new CyclicB();
		CyclicBarrier c1 = new CyclicBarrier(5);
		CyclicBarrier c2 = new CyclicBarrier(10,()->System.out.println("hullo"));
		ExecutorService es = null;
		try {
			es=Executors.newFixedThreadPool(10);
			for (int i=0;i<10;i++) {
				es.submit(()->cb.performTask(c1,c2));
			}
		}
		finally {
			if (es!=null) {
				es.shutdown();
			}
		}
	}
}
