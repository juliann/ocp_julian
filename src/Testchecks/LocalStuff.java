package Testchecks;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.text.NumberFormat;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LocalStuff {
	
	X x = new X () {
		void doSth() {
			System.out.println("hi Dominik");
		}
	};
	
	XZY y = new XZY() {

		@Override
		public void testSth() {
			// TODO Auto-generated method stub
			
		}
		
	};
	
	
	
public static void main(String[] args) throws MalformedURLException {
	
//	LocalStuff lf = new LocalStuff();
//	lf.x.doSth();
//	lf.y.test();
	

	
	System.out.println(Locale.getDefault());
	
//	File file = new File("C:\\Users\\julian\\git\\ocp_julian\\l18n");
//	URL[] urls = {file.toURI().toURL()};
//	ClassLoader loader = new URLClassLoader(urls);
//	Locale.setDefault(new Locale("en", "US"));
//	Locale newLocale= new Locale("de", "DE");
	Locale.setDefault(new Locale("de", "DE"));
	ResourceBundle rb = ResourceBundle.getBundle("l18n.l18n", new Locale("fr"));
	

//	/ResourceBundle rb = ResourceBundle.getBundle("C:\\Users\\julian\\git\\ocp_julian\\l18n\\l18n");
	System.out.println(rb.getString("hello"));
	System.out.println(rb.getString("horst"));
	System.out.println(rb.getString("de"));
	System.out.println(Locale.getDefault());
	
	//Stream.of(1,2).collect(Collectors.groupingByConcurrent(i->i));
	
	
	
	
	
	
}
}

interface XZY{
	default void test() {
		System.out.println("apfel");
	}
	void testSth();
}
class X{
	void doSth() {
		
	}
}