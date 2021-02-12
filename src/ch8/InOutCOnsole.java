package ch8;

import java.io.Console;

public class InOutCOnsole {
	
	
	
	public static void main(String[] args) {
		String name="sonoo";  
		System.out.println("test");
		Console c = System.console();
		
		if (c!=null) {
			System.out.println("hi");
			c.writer().write("hi");
			c.readLine("name is %s",name);
			//c.printf, args)
		}
		}
}
