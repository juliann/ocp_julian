package ch8;

import java.io.File;
import java.util.Optional;


public class Rename {

	public static void main(String[] args) {
		File f = new File("D:\\torrent done\\Ao No Exorcist (Blue Exorcist) [Dual][1080][x265] [2011 Spring]\\Ao no Exorcist Kyoto Fujouou Hen [anidb2-12240] [Dual][1080][x265] [2017 Winter]");
		
		System.out.println(f.exists());
		for (File g:f.listFiles()) {
//			String sub = g.getName().substring(0, 31);
//					System.out.println(sub);
			String newString = g.getName().substring(0, 31)+".mkv";
			File tochange = new File(f,newString);
			System.out.println(tochange.getAbsolutePath());
			System.out.println(g.getAbsolutePath());
			g.renameTo(tochange);
			
		}
	}
}
