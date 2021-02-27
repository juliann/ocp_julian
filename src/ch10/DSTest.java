package ch10;

import java.sql.*;

import javax.sql.*;

public class DSTest {
	
	public static void main(String[] args) {
		
		testDataSource("mysql");
			}

	private static void testDataSource(String dbType) {
		DataSource ds = null;
		
			ds = MyDataSourceFactory.getMySQLDataSource();
		
		
	
		try (
				Connection con = ds.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select  id, name from test1");){
	
			while(rs.next()){
				System.out.println("ID="+rs.getInt("id")+", Name="+rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
