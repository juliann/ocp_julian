package ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.stream.IntStream;

public class MySQLTesting {
public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306/Test";
	System.out.println("hi");
	try(Connection conn = DriverManager.getConnection(url, "immodb", "Pa$$w0rd");
			 Statement stmt = conn.createStatement();){
		System.out.println(conn);
		conn.setAutoCommit(false);
		Savepoint sp1 = conn.setSavepoint("1");
//		stmt.execute("insert into test1  values(2,'Hugo');");
		ResultSet rs = stmt.executeQuery("select * from test1");
		
		rs.next();
		rs.next();
		System.out.println(rs.getString(2));
		conn.commit();
		conn.rollback(sp1);
		IntStream.of(1).forEach(x -> String.valueOf(x));
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
}
