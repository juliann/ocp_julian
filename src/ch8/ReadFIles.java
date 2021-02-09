package ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFIles {
	public static void main(String[] args) {
		File f = new File("whatevs.txt");
		try(Reader r = new FileReader(f)){
			char c = 0;
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
