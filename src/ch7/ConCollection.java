package ch7;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConCollection {

	List<String> ls = new CopyOnWriteArrayList<>();
	
	public static void main(String[] args) {
		ConCollection cc = new ConCollection();
		cc.add();
		
	}

	private void add() {
		ls.add("1");
		
		ExecutorService es = null;
		try {
			es = Executors.newFixedThreadPool(20);
			for (int i=0; i<100000; i++) {
				es.submit(() -> ls.add("2"));
			}
			for (int j=0;j<10000;j++) {
				
			}
			
		}finally {
			if(es!=null)
				es.shutdown();
		}
		
	}
}
