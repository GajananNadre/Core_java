package org.tech;
import java.sql.*;
public class DriverApp {

	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver f=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(f);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractical","root","Gajanan@123");
		if(conn!=null) {
			System.out.println("Database conncected....");
			
		}else {
			System.out.println("not conncected..");
		}

	}

}
