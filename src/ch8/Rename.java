package ch8;

import java.io.File;
import java.util.Optional;


public class Rename {

	public static void main(String[] args) {
		File f = new File("\\\\TOWER\\TV Shows\\Youtube\\Java OCP");
		
		System.out.println(f.exists());
		for (File g:f.listFiles()) {
			
			String newString = g.getName().replace("Lesson ", "S01E");
			File tochange = new File(f,newString);
			System.out.println(tochange.getAbsolutePath());
			System.out.println(g.getAbsolutePath());
			g.renameTo(tochange);
			
		}
	}
}
