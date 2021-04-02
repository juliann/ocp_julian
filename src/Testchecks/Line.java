package Testchecks;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.util.Comparator;
import java.util.Optional;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Line implements AutoCloseable    {
	static BlockingDeque<Integer> queue = new LinkedBlockingDeque<>();
	   public static void main(String[] participants) throws IOException, URISyntaxException    {
		System.out.println(participants);
//		   FileSystem fileSystem = FileSystems.getFileSystem( 
//				   new URI("http://www.selikoff.net"));
//				Path path = fileSystem.getPath("duck.txt");
//		   System.out.println(path);
		   Console c = System.console();
			Optional<Integer> o = Stream.of(3).reduce((cc,b) -> cc+b);
		  System.out.println(o.get());
//		   Path q = p.toAbsolutePath();
		 
		Path qq = Paths.get("TESTORDNER/APFEL");
		System.out.println("abs"+qq.isAbsolute());
		System.out.println("files"+Files.exists(qq));
		System.out.println(qq.toAbsolutePath());
		Files.createDirectories(qq);
//		  System.out.println(p.getNameCount());
//		  System.out.println(p);

	File f = new File("c:\test123");
//	PrintWriter pp= new PrintWriter();
//	new URI()
		System.out.println("hi"+f.isFile());
//		   p.toabs
		   BasicFileAttributeView aaa;
		   DosFileAttributes d;
		   
//		   aaa.
//		   p.isAbsolute()
//		   BasicFileAttributeView b = Files.getFileAttributeView(p, DosFileAttributes.class );
		 //  b.is
		  
		   IntStream.iterate(1, i -> i+1).limit(5)
	         .parallel()
	       
	         .forEach(s -> {
				try {
					queue.offerLast(s,10000,TimeUnit.MILLISECONDS);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		   
		   IntStream.iterate(1, i -> 5).limit(10)
	         .parallel()
	         .forEach(s -> {
				try {
					queue.pollFirst(10,TimeUnit.SECONDS);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
	      System.out.print(queue.size());
	   }
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	}

