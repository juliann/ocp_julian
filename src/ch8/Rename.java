package ch8;

import java.io.File;
import java.util.Optional;


public class Rename {

	public static void main(String[] args) {
		File f = new File("D:\\torrent done\\Attack On Titan S04 1080p WEBRip 10 bits AAC x265-EMBER");
		
		System.out.println(f.exists());
		for (File g:f.listFiles()) {
//			String sub = g.getName().substring(0, 31);
//					System.out.println(sub);
//			String newString = g.getName().replace(" The Final Season - ","S04E");
//			String newString = g.getName().substring(0, 31)+".mkv";
//			File tochange = new File(f,newString);
//			System.out.println(tochange.getAbsolutePath());
//			System.out.println(g.getAbsolutePath());
//			g.renameTo(tochange);
			
		}
	}
}
