package ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLTesting {
public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306/Test";
	System.out.println("hi");
	try(Connection conn = DriverManager.getConnection(url, "immodb", "Pa$$w0rd");
			 Statement stmt = conn.createStatement();){
		System.out.println(conn);
//		stmt.execute("insert into test1  values(2,'Hugo');");
		ResultSet rs = stmt.executeQuery("select * from test1");
		
		rs.next();
		rs.next();
		System.out.println(rs.getString(2));
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
}
