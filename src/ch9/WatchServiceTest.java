package ch9;

import static java.nio.file.StandardWatchEventKinds.*;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchService;

public class WatchServiceTest {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		try {
			WatchService ws = FileSystems.getDefault().newWatchService();
			Path p1 = Paths.get("E:","gdocks","Downloads");
			p1.register(ws, ENTRY_DELETE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
