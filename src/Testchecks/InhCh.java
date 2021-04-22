package Testchecks;

import java.io.Console;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.TreeSet;
import java.util.stream.IntStream;


public class InhCh {
	int in = 10;
	void t()throws IOException{}
	public static void main(String[] args) throws SQLException {
//		C c = new C();
		IntStream.of(0);
//		 FileInputStream f = new FileInputStream(null);
//		InhCh inh = new I();
			
		ResultSet rs = null;
		ResultSetMetaData rsmd= null;
		rs.getMetaData();
		rsmd.getColumnClassName(1);
		
		 TreeSet<Integer> s = new TreeSet<Integer>();     
		 TreeSet<Integer> subs = new TreeSet<Integer>();    
		 for(int i = 324; i<=328; i++)        
		 {             s.add(i);         }       
		 subs =  (TreeSet<Integer>) s.subSet(326, true, 328, true );     
		 subs.add(329);     
		 System.out.println(s+" "+subs);
		Console c;
		
	}
	enum APFEL{}
	 class C{
		 
		class D{
			
			class E{
				void doSTH() {
				int j = in;
			}}
		}
		void dos() {
			System.out.println(InhCh.this.in);
		}
	}
}
class I extends InhCh{
	void t()  {
		Console c;
	
		
	}
	public static enum Grade{ A, B , C, D, F}   
}

