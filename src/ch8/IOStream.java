package ch8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class IOStream {

	public static void main(String[] args) {
//		testS();
		copyS();
	}

	private static void copyS() {
		File oldF = new File("testDirectory","thisIsATest.txt");
		File newF = new File("testDirectory","thisIsACopy.txt");
		
		if(!newF.exists()) {
			try {
				newF.createNewFile();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try(InputStream is = new FileInputStream(oldF);
			OutputStream os = new FileOutputStream(newF);){
			FileInputStream fis;
			FileReader fr;
			fr.re
			is.sk
			int b;
			while((b=is.read())!=1) {
				os.write(b);
				FileNotFoundException
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void testS() {
		File f = new File("testDirectory","thisIsATest.txt");
		if(f.exists()) {
			System.out.println(f.canExecute());
			System.out.println(f.length());
			
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			
		
			while (br.read()!=-1) {
			System.out.println(br.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		}
		}
}
