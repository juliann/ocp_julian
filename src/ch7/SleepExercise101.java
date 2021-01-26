package ch7;

public class SleepExercise101 {

	public static void main(String[] args) {
		SleepTest s = new SleepTest();
		s.start();
		
		System.out.println(s.getPriority());
		System.out.println(s.isDaemon());
		System.out.println("alive: " + s.isAlive());
		System.out.println("interrupted: " + s.isInterrupted());
		System.out.println("state: " + s.getState());
		System.out.println(s.toString());
		try {
			Thread.sleep(13000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after alive: " + s.isAlive());
		System.out.println("after interrupted: " + s.isInterrupted());
		System.out.println("after state: " + s.getState());
	
	}
	static class SleepTest extends Thread{
		@Override
		public void run() {
			for (int i = 0;i<10; i++) {
				
				System.out.println("current number is :" + i);
				if(i%10==0) {
					System.out.println("remainder 0");
				}
				try {
					Thread.sleep(1000);
					System.out.println("sleep alive: " + Thread.currentThread().isAlive());
					System.out.println("sleep interrupted: " + Thread.currentThread().isInterrupted());
					System.out.println("sleep state: " + Thread.currentThread().getState());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
