package ch8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class CreateFiles {
	public static void main(String[] args) {
		createFileAndDirectory();
		test();
//		checkDir();
//		bla();
	
	
	}

	private static void test() {
		System.out.println("hi");
		
	}

	private static void bla() {
//		System.out.println(f.canExecute());
//		System.out.println(f.exists());
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.getName());
//		System.out.println(f.isDirectory());
//		System.out.println(f.isFile());
//		System.out.println(f.length());
//		System.out.println(LocalDateTime.ofInstant(Instant.ofEpochMilli(f.lastModified()), ZoneId.of("+1")));
//		System.out.println(f.getParent());
		
	}

	private static void checkDir() {
		File d = new File("testDirectory");
		if(d.exists()) {
			for (File f: d.listFiles()) {
				System.out.println(f.getAbsolutePath());
			}
		}
		
	}

	private static void createFileAndDirectory() {
	//	File d = new File("testDirectory");
		File f = new File("thisIsATest.txt");
		try {
//			if (!d.exists()) {
//				d.mkdir();
//			}
			if (!f.exists()) {
			f.createNewFile();
			}
			System.out.println("f.exists()"+f.exists());
			
			File g = new File("whatevs.txt");
			if (!g.exists()) {
				f.renameTo(g);
				}

			
			System.out.println("f.exists()"+f.exists());
			System.out.println("f.exists()"+f.getAbsolutePath());
			System.out.println("g.exists()"+g.exists());
			System.out.println("g.exists()"+g.getAbsolutePath());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
