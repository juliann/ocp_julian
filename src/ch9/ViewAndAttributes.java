package ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.time.Instant;

public class ViewAndAttributes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		dosFile();
		dosView();
	}

	private static void dosView() {
		Path p = Paths.get("E:","gdocks","79413655.pdf");
//		Path pO = Paths.get("E:","test1");
//		Path p1 = Paths.get("E:","test1","info.txt");
		Files.wal
		try {
//			Files.deleteIfExists(p);
//			Files.createDirectory(p);
			BasicFileAttributeView dFA= Files.getFileAttributeView(p, BasicFileAttributeView.class);
			System.out.println("hi");
			System.out.println(dFA.readAttributes().fileKey());
			Files.walk(p, 1).forEach(System.out::println);
	}catch(IOException e) {
		e.printStackTrace();
	}
	}

	private static void dosFile() {
		Path p = Paths.get("E:","gdocks","79413655.pdf");
		DosFileAttributeView dfav = Files.getFileAttributeView(p, DosFileAttributeView.class);
		try {
			//Files.deleteIfExists(p);
			
			//Files.createDirectory(pO);
//			Files.createFile(p);
			
			DosFileAttributes dFA= Files.readAttributes(p, DosFileAttributes.class);
			System.out.println(dFA.isSystem());
			Instant i = Instant.now(null);
			Files.wa
			System.out.println(dFA.isDirectory());
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
