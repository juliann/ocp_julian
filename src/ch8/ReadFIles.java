package ch8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class ReadFIles {
	public static void main(String[] args) {
		//test1();
		test2();
	}

	private static void test2() {
		File f = new File("whatevs.txt");
		byte[] b = new byte[500];
		try(InputStream r = new FileInputStream(f)){		
			int i;
			while ((i=r.read())>0) {
				System.out.println(i);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void test1() {
		File f = new File("whatevs.txt");
		try(Reader r = new FileReader(f)){		
			int i = r.read();
			while (i!=-1) {
				System.out.println((char)i);
				i=r.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
