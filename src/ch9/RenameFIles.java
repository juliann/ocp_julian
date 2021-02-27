package ch9;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RenameFIles {

	public static void main(String[] args) {
		Path p = Paths.get("D:\\torrent done\\Suits.S01.1080p.BluRay.x264-UNVEiL[rartv]\\");
		try {
			DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(p);
			for(Path px : newDirectoryStream) {
				//System.out.println(px);
				if (px.getFileName().toString().startsWith("Suits")) {
					System.out.println(px);
					String path = px.getFileName().toString()+".mkv";
				//	System.out.println(path);
					Path ne = Paths.get(px.toString()+".mkv");
					System.out.println(ne);
					Files.move(px, ne);
					
					
//					String newS= "Suits S01E"+path.charAt(14)+path.charAt(15);
//					Path newPath = Paths.get("D:\\torrent done\\Suits.S01.1080p.BluRay.x264-UNVEiL[rartv]\\"+newS);
//					System.out.println(newS);
//					System.out.println(newPath);
//					Files.move(px, newPath);
//Path newP = Paths.get
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
