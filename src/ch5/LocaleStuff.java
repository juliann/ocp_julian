package ch5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
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
//		sysProp();
//		resBundle();
//		format();
//		formatNumbers();
//		formatDates();
//		newPropFile();
//		updateAndReadPropFile();

		
//		Properties props = System.getProperties();
//		props.entrySet().stream().forEach(System.out::println);
	}

	private static void updateAndReadPropFile() {
		Properties p2 = new Properties();
		FileInputStream fis;
		Double db;
		try {
	
			fis = new FileInputStream("myProps1.props");
			p2.load(fis);
			System.out.println("k1 from myprops1: "+ p2.getProperty("k1"));
			p2.list(System.out);
			p2.setProperty("k3", "v3");
			p2.list(System.out);
			
			FileOutputStream fos = new FileOutputStream("myProps2.props");
			p2.store(fos, "new fileprop2");
			fos.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	private static void newPropFile() {
		Properties p = new Properties();
		p.setProperty("k1", "v1");
		p.setProperty("k2", "v2");
		p.list(System.out);
		
		try {
			FileOutputStream out = new FileOutputStream("myProps1.prop");
			p.store(out, "this is a test comment");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void sysProp() {
		Properties p = System.getProperties();
		p.setProperty("hi", "Hullo?");
		System.out.println(p.getProperty("hi", "WHAAAAAT?"));
		System.out.println(p.getProperty("hi1", "WHAAAAAT?"));
		
		
		
	}

	private static void formatDates() {
		LocalDate ld = LocalDate.now(ZoneId.of("-11:00"));
		LocalTime lt = LocalTime.now(ZoneId.ofOffset("GMT", ZoneOffset.ofHours(1)));
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		//Jan 12, 2021
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(ld));
		//11:30:59 AM
		System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(lt));
		//Jan 12, 2021 11:30:59 AM
		System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(ldt));
		
		System.out.println("SHORT:");
		//1/12/21
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(ld));
		//11:32 AM
		System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(lt));
		//1/12/21 11:32 AM
		System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(ldt));
		
		System.out.println("LONG:");
		//January 12, 2021
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(ld));
		//java.time.DateTimeException: Unable to extract value: class java.time.format.DateTimePrintContext$1
//		System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG).format(lt));
		//java.time.DateTimeException: Unable to extract value: class java.time.LocalDateTime
//		System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(ldt));
		
		
		
		System.out.println("ISO ldt:");
		//2021-01-12T11:30:59.531
		System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(ldt));
		
	}

	private static void formatNumbers() {
		int visitors = 3_200_000;
		int vpm = visitors/12;
		double price = 48;
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		NumberFormat de = NumberFormat.getInstance(Locale.GERMANY);
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		
		System.out.println(us.format(vpm));
		System.out.println(de.format(vpm));
		System.out.println(ca.format(vpm));
		
		NumberFormat usc = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat dec = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		NumberFormat cac = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
		System.out.println(usc.format(price));
		System.out.println(dec.format(price));
		System.out.println(cac.format(price));
		
		try {
			System.out.println(de.parse("1.5")); //15
			System.out.println(de.parse("1,5")); //1.5
			
			System.out.println(us.parse("1.5")); //1.5
			System.out.println(us.parse("1,5")); //15
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void format() {
		Locale de = new Locale("de", "DE");
		ResourceBundle rb = ResourceBundle.getBundle("resources/Zoo", de);
		System.out.println(rb.getString("form"));
		String format = rb.getString("form");
		String formatted = MessageFormat.format(format, "Julian");
		System.out.println(formatted);
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
		System.out.println(rb2.getString("yesyes"));

		ResourceBundle rb4 = ResourceBundle.getBundle("resources.Zoo", de);
		System.out.println(rb4.getString("open3"));
		
		//java.util.MissingResourceException: Can't find bundle for base name myProps1, locale en_US
//		ResourceBundle rb5 = ResourceBundle.getBundle("myProps1");
//		System.out.println(rb5.getString("k1"));
		
		
		
	}

	private static void test1() {
		System.out.println(Locale.getDefault());
		Locale d = new Locale.Builder().setLanguage("de").setRegion("DE").build();
		System.out.println(d);
		Locale.setDefault(d);
		System.out.println(Locale.getDefault());
		
	}
}
