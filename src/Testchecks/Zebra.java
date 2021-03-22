package Testchecks;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

public class Zebra implements Serializable {
	   private static final long serialUID = 1L;
	   private transient String name = "George";
	   private static String birthPlace = "Africa";
	   private transient Integer age;
	   private java.util.List<Zebra> friends = new java.util.ArrayList<>();
	   private Object tail = null;
	   { age = 10;}
	   public Zebra() {
	      this.name = "Sophia";
	   }
	   
	   
	   @Override
	public String toString() {
		return "Zebra [name=" + name + ", age=" + age + ", friends=" + friends + ", tail=" + tail + "]";
	}


	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		   File f = new File ("c://test2/file.txt");
		//   f.createNewFile();
		 
		   Console c = System.console();
		   c.read
//		  boolean b =  c.reader().read() != 'x';
//		   OutputStream oss;
//		   InputStream iss;
//		   Writer w;
//		   w.app
//		   Reader r;
//		   r.re
//		 c.writer() ;
//		   BufferedWriter bcc= new Buff;
//		   InputStream inp;
		try(ObjectOutputStream o = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(f)));
			
				){
			Zebra z = new Zebra();
			System.out.println(z.name);
			o.writeObject(z);
			   File g = new File ("c://test2/file.txt");
			try(ObjectInputStream oi = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(g)));){
			Object obj = oi.readObject();
			if (obj instanceof Zebra) {
			Zebra z2 = (Zebra) obj;
			
			System.out.println(z2);
			}}
		}
	}
	}
interface AAA{
	
}