package ch9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;

import com.sun.jndi.toolkit.url.Uri;

public class PathStuff {

	public static void main(String[] args) {
//		rnd();
//		systemDiff();
//		url();
//		test();
	//	produceNestedPaths(Paths.get("testerino"),3);
//		BasicFileAttributes
		
		
		try {
			URL website = new URL("https://webgalleries.reipka.de/UKKV/source/rpkdeu5_032_066.htm");
			
			Path p=	Paths.get(website.toURI());
			Files.lines(p).forEach(System.out::println);;
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		Path p1 = Paths.get("E:","gdocks","Downloads","Git-2.30.1-64-bit.exe");
		Path p2 = Paths.get("apfel");
		
		System.out.println("execute?:"+Files.isExecutable(p1));
		System.out.println(p1.toString());
		System.out.println(p1.getName(1));
		System.out.println(p1.getName(1).toString());
		System.out.println(p2.toString());
		System.out.println(p1.getRoot());
//		SortedMap<String, Charset> availableCharsets = Charset.availableCharsets();
//		
//		for(Entry<String, Charset> e:availableCharsets.entrySet()) {
//			System.out.println(e.getKey() + " " + e.getValue());
//		}
//		Path p = Paths.get("E:","gdocks","Downloads","Märchencollection 98 20201221.txt");
//		try {
//			InputStream is = new FileInputStream(p.toString());
//			byte[]a = new byte[1024];int i;
//		
//			while ((i = is.read(a))!=-1) {
//				System.out.println(i);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//}
	}

	private static void test() {
		Path p = Paths.get("hi");
		Path pc = Paths.get(p.toString()+"\\neu");
	
		try {
			System.out.println(Files.createDirectories(pc));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

private static void produceNestedPaths( Path path, int counter ) {		
		
		if( counter == 1) {
			System.out.println("hi");
			try {
				Path lastPath = Paths.get(path + FileSystems.getDefault().getSeparator().toString() + counter );
				System.out.println(lastPath.toAbsolutePath());
				Files.createDirectories( lastPath );
			
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}else {
			produceNestedPaths( Paths.get(  path.toString() +  FileSystems.getDefault().getSeparator()+ counter  ) , --counter  );
		}
	}
	
	private static void url() {
		File f;
		Path copy = Paths.get("files/copy.htm");
	
		try {
			//url = Paths.get(new URI("http://www.reddit.com"));
	
			URL website = new URL("https://webgalleries.reipka.de/UKKV/source/rpkdeu5_032_066.htm");
		
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
//		System.out.println(pA.getr);
		Path p1 = Paths.get("pandas/cuddly.png");
		Path p2 = Paths.get(p1+""+
		p1);
		Path p3 = Paths.get("/home/pandas/cuddly.png"); //???
	
		try {

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
		System.out.println(p.normalize());
		System.out.println(p.getNameCount());
		System.out.println(p.toString());
		System.out.println(FileSystems.getDefault());
		System.out.println(p.getParent());
		System.out.println(p.toAbsolutePath());
//		try {
//			Files.
//			Files.cre
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
		
	}
