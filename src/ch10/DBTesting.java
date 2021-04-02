package ch10;

import java.sql.*;
import java.time.LocalDateTime;

public class DBTesting{
	public static void main(String[] args) {
//		setup();
//		test();
//		h2();
//		mysql();
		 
		try {
			c = Class.forName("java.lang.String");
			System.out.println(c);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
//		try {
//			Class c = Class.forName("com.mysql.jdbc.Driver");
//			ClassLoader cl = c.getClassLoader();
//			System.out.println(c);
//			System.out.println(cl);
//		}catch( ClassNotFoundException e) {
//			
//		}
	}

	private static void mysql() {
		String url = "jdbc:mysql://192.168.1.246:3308/Test";
		
				try(Connection conn = DriverManager.getConnection(url, "root", "Pa$$w0rd");
						 Statement stmt = conn.createStatement();){
//					stmt.execute("create table testerino (id int primary key, name varchar(255))");
			//		stmt.executeUpdate("insert into testerino(id) values(1)");
//					stmt.executeUpdate("insert into testerino values(2,'hallo')");
//					stmt.executeQuery("select * from testerino");
					ResultSet rs = stmt.executeQuery("select * from testerino");
					Class<?> forName = Class.forName("");
					ResultSetMetaData rsmd= rs.getMetaData();
					int count = rsmd.getColumnCount();
					stmt.
					System.out.println(count);
					for (int i=1;i<=count;i++) {
						System.out.println("hi");
						System.out.println(rsmd.getColumnClassName(i));
					}
	
					
//					while (rs.next()) {
//			
//						System.out.println(rs.getInt(1));
//						System.out.println(rs.getString(2));
//						
//					}
//					System.out.println(conn);
				} catch (SQLException  e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
	}

	private static void h2() {
		String url = "jdbc:h2~/test";
		
		try(Connection conn = DriverManager.getConnection("jdbc:h2:~/test;USER=sa;PASSWORD=");
			 Statement stmt = conn.createStatement();){
			
//			stmt.execute("create table testerino (id int primary key, name varchar(255))");
			stmt.executeUpdate("insert into testerino(id) values(1)");
//			stmt.executeQuery("select * from testerino");
			ResultSet rs = stmt.executeQuery("select * from testerino");
			while (rs.next()) {
				rs.abs
				System.out.println(rs.getInt(1));
				
			}
//			System.out.println(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
		}
		
	}

	private static void test() {
		String url = "jdbc:derby:zoo";
		
		try(Connection conn = DriverManager.getConnection(url);
			Statement stmt = conn.createStatement()
				)
				{
			//stmt.executeUpdate("create table shit(id integer primary key, name varchar(255))");
		//	stmt.executeUpdate("insert into shit values(1,'hallo')");
//			ResultSet rs = stmt.executeQuery("select * from shit");
//			while(rs.next()) {
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString(2));
//			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
		}
	}

	private static void setup() {
		String url = "jdbc:derby:zoo;create=true";
		
		try(Connection conn = DriverManager.getConnection(url);
			Statement stmt = conn.createStatement()){
			//stmt.executeUpdate("create table shit(id integer primary key, name varchar(255))");
//			stmt.executeUpdate("insert into shit values(1,'hallo')");
			 
			ResultSet rs = stmt.executeQuery("select * from shit");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
