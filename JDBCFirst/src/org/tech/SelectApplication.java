package org.tech;
import java.sql.*;
import java.util.*;
public class SelectApplication {

	public static void main(String[] args) throws SQLException{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproblem","root","Gajanan@123");
		if(conn !=null)
		{
			System.out.println("database connected succ....");
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select *from employ");
			System.out.printf("id\tName\tEmail\t\tSlary\tContact\n");
			while(rs.next())
			{
				int id=rs.getInt("Eid");
				String Name=rs.getString("Ename");
				String Email=rs.getString("Eemail");
				int sal=rs.getInt("Esal");
				String phone=rs.getString("Econtact");
				
				System.out.println(id+"\t"+Name+"\t"+Email+"\t"+sal+"\t"+phone);
				
			}
		}
		else
		{
			System.out.println("some problem occur........");
		}

	}

}
