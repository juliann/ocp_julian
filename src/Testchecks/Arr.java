package Testchecks;

import java.util.ListResourceBundle;

public class Arr extends ListResourceBundle{
@Override
protected Object[][] getContents() {
	// TODO Auto-generated method stub
	return null;
}

public static void main(String[] args) {
	String[][] s = new String[10][10] ;
	s[0][0] = "hi";
	s[1][0] = "hallo";
	s[1][0] = "bye";
	s[1][1] = "tschüss";

	for(String[] i :s) {
		for (String st :i) {
			System.out.println(st);
		}
	}
}
}
