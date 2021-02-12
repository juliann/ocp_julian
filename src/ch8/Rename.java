package ch8;

import java.io.File;


public class Rename {

	public static void main(String[] args) {
		File f = new File("\\\\TOWER\\TV Shows\\FHD TV Shows\\Justice League\\Season 5");
		
		System.out.println(f.exists());
		for (File g:f.listFiles()) {
			
			String newString = g.getName().replace("S03", "S05");
			File tochange = new File(f,newString);
			System.out.println(tochange.getAbsolutePath());
			System.out.println(g.getAbsolutePath());
			g.renameTo(tochange);
			
		}
	}
}
