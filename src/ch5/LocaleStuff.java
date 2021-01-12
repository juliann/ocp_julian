package ch5;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class LocaleStuff {
	

	public static void main(String[] args) {
//		test1();
//		resourceFile();
//		resourceSet();
//		propFile();
		resBundle();
	}

	private static void resBundle() {
		Locale de = new Locale("de", "DE");
		ResourceBundle rb = ResourceBundle.getBundle("resources.Tax", de);
		System.out.println(rb.getString("open"));
		
	}

	private static void propFile() {
		Locale de = new Locale("de", "DE");
		ResourceBundle rb2 = ResourceBundle.getBundle("resources/Zoo", de);
		
		Properties prop= new Properties();
		rb2.keySet().stream().forEach(k -> prop.put(k, rb2.getString(k)));
		
		System.out.println(prop.getProperty("hello"));
		System.out.println(prop.getProperty("nello"));
		System.out.println(prop.getProperty("nello", "nellooooooooo"));
		
	}

	private static void resourceSet() {
		Locale de = new Locale("de", "DE");
		ResourceBundle rb2 = ResourceBundle.getBundle("resources/Zoo", de);
		Set<String> resourceSet=rb2.keySet();
		resourceSet.stream()
					.map(k ->k +" "+ rb2.getString(k))
					.forEach(System.out::println);
		
	}

	private static void resourceFile() {
		Locale en = new Locale("en", "US");
		Locale fr = new Locale("fr", "FR");
		Locale de = new Locale("de", "DE");
	
		ResourceBundle rb = ResourceBundle.getBundle("resources/Zoo", fr);
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
		
		ResourceBundle rb1 = ResourceBundle.getBundle("resources/Zoo", en);
		System.out.println(rb1.getString("hello"));
		System.out.println(rb1.getString("open"));
		
		ResourceBundle rb2 = ResourceBundle.getBundle("resources/Zoo", de);
		System.out.println(rb2.getString("hello"));
		System.out.println(rb2.getString("open"));
		System.out.println(rb2.getString("key"));
		System.out.println(rb2.getString("value"));
		System.out.println(rb2.getString("value2"));
		
		
		
	}

	private static void test1() {
		System.out.println(Locale.getDefault());
		Locale d = new Locale.Builder().setLanguage("de").setRegion("DE").build();
		System.out.println(d);
		Locale.setDefault(d);
		System.out.println(Locale.getDefault());
		
	}
}
