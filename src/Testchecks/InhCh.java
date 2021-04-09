package Testchecks;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.stream.IntStream;

public class InhCh {
	void t()throws IOException{}
	public static void main(String[] args) throws SQLException {
		C c = new C();
		IntStream.of(0);
//		 FileInputStream f = new FileInputStream(null);
//		InhCh inh = new I();
	I i = new I();
		i.t();
		
		ResultSet rs = null;
		ResultSetMetaData rsmd= null;
		rs.getMetaData();
		rsmd.getColumnClassName(1);
	}
	static class C{
		
	}
}
class I extends InhCh{
	void t() {
		
	}
}

