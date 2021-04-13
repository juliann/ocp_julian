package Testchecks;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.DoubleSupplier;

public class OracleCh4 {

	
	public static void main(String[] args) {
//		ZonedDateTime zdt = ZonedDateTime.parse("2020-05-01T10:05:00 GMT+1");
//		System.out.println(zdt);
		AtomicInteger ai;
		DoubleSupplier ds = ()->Double.valueOf(1.0);
		Queue<OracleBuchT1> q = new PriorityQueue<OracleBuchT1>();
		Path p1;
		   Map hm = new HashMap();      
		   hm.put(null, "asdf");  //3    
		   hm.put("aaa", null);  //4
		   Object o = new Object();
		   Object b = new Object();
		   System.out.println(o.hashCode() + " " + b.hashCode());
		   Integer i;
		   Executor e;
		   ExecutorService ee;
		   
		       
		   
	}
}
class TestFrame extends Frame { 
	String s="Message";   

public static void main(String args[])   
{       TestFrame t = new TestFrame();   
	Button b = new Button("press me");    
	b.addActionListener(new ActionListener()       
	{                      public void actionPerformed(ActionEvent e) 
	{                         System.out.println("Message is " +t.s);          
}                   }   
);
}}