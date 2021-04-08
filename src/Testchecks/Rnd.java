package Testchecks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Rnd implements AutoCloseable{
	
public static void main(String[] args) throws IOException {
	
	File f = new File("D:\\torrent done\\Ebook Series - Scifan - Ursula K. le Guin - Hainish Cycle - (07 Books)");
	for(File g: f.listFiles()) {
		System.out.println(g);
	}
	
	System.out.println();
	System.out.println();
	System.out.println();
	
	Path p = Paths.get("D:\\torrent done\\Ebook Series - Scifan - Ursula K. le Guin - Hainish Cycle - (07 Books)");
	Files.walk(p).forEach(System.out::println);

}

@Override
public void close() throws Exception {
	// TODO Auto-generated method stub
	
}
}
