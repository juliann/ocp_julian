package ch9;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathStuff {

	public static void main(String[] args) {
//		rnd();
//		systemDiff();
		url();
}

	private static void url() {
		Path copy = Paths.get("files/copy.txt");
		try {
			//url = Paths.get(new URI("http://www.reddit.com"));
	
			URL website = new URL("https://www.website.com/robots.txt");
			try (InputStream in = website.openStream()) {
			    Files.copy(in, copy, StandardCopyOption.REPLACE_EXISTING);
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void systemDiff() {
		Path p = Paths.get("files/");
		Path pA = Paths.get(p.toString(), "pandas");
		System.out.println(pA.toAbsolutePath());
		Path p1 = Paths.get("pandas/cuddly.png");
		Path p2 = Paths.get("c:\\pandas/cuddly.png");
		Path p3 = Paths.get("/home/pandas/cuddly.png"); //???
		
		try {
//			Files.createDirectory(p);
			System.out.println(p1.toAbsolutePath());
			System.out.println(p2.toAbsolutePath());
			System.out.println(p3.toAbsolutePath());
//			Files.createFile(p1);
//			Files.createFile(p2);
//			Files.createFile(p3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static void rnd() {
		Path p = Paths.get("1.txt");
		System.out.println(p.getNameCount());
		System.out.println(p.toString());
		System.out.println(p.getParent());
		System.out.println(p.toAbsolutePath());
		try {
			Files.createFile(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
