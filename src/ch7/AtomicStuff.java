package ch7;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;



import ch4.Ding;

public class AtomicStuff {
	
	private static AtomicInteger ai = new AtomicInteger(0);
	private static AtomicInteger ai2 = new AtomicInteger(2);
	private static AtomicInteger ai3 = new AtomicInteger(2);
public static void main(String[] args) {
	System.out.println(ai.get()+1);
	System.out.println(ai.get()+ai2.get());
	AtomicIntegerArray arr = new AtomicIntegerArray(10);
	
	AtomicReference<Ding> dingAtom = new AtomicReference<Ding>(Ding.makeDing());
	System.out.println(dingAtom.get());


}
}
