package ch7;

public class StarvationExample {
 
    public static void main(String[] args) {
        Worker worker = new Worker();
 
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    worker.work();
                }
            }).start();
        }
    }
}