package ch8;

import java.io.File;
import java.util.Optional;


public class Rename {

	public static void main(String[] args) {
		File f = new File("D:\\torrent done\\Shingeki no Kyojin The Final Season");
		
		System.out.println(f.exists());
		for (File g:f.listFiles()) {
			System.out.println(g);
//			String sub = g.getName().substring(0, 31);
//					System.out.println(sub);
			String newString = g.getName().replace("[Cleo]Shingeki_no_Kyojin_The_Final_Season_-_"," Attack on Titan S04E");
			System.out.println(newString);
			String fixed = newString.replace("_(Dual Audio_10bit_1080p_x265)", "");
			System.out.println(fixed);
//			String newString = g.getName().substring(0, 31)+".mkv";
			File tochange = new File(f,fixed);
//			System.out.println(tochange.getAbsolutePath());
//			System.out.println(g.getAbsolutePath());
			g.renameTo(tochange);
			
		}
	}
}
