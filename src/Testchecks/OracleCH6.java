package Testchecks;

import java.io.File;
import java.io.IOException;

public class OracleCH6 {
public static void main(String[] args) {
	File f1 = new File("dir3");
	File f2 = new File(f1,"file3");
	f1.mkdir();
	try {
		f1.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
