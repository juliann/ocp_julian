package ch7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {

	public static void main(String[] args) {
		ScheduledExecutorService ses=null;
		ExecutorService es = null;
		try {
			ExecutorService ess = 
			es = Executors.newSingleThreadExecutor();
			ses = Executors.newSingleThreadScheduledExecutor();
			ScheduledFuture<?> scheduleWithFixedDelay 
			= ses.scheduleWithFixedDelay(()->System.out.println("hi"), 10, 15, TimeUnit.SECONDS);
			es.execute(()->System.out.println("exec test"));
			System.out.println(scheduleWithFixedDelay.getDelay(TimeUnit.MICROSECONDS
					));
		}finally {
			es.shutdown();
			try {
				es.awaitTermination(10, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
