package org.tech;
import java.sql.*;
import java.util.*;
public class LoginVarificationApp {

	public static void main(String[] args)throws Exception {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproblem","root","Gajanan@123");
		if(conn !=null)
		{
			System.out.println("database connected Succ...");
			Statement stmt=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name and contact");
			String Name=sc.next();
			String Contact=sc.next();
			ResultSet rs=stmt.executeQuery("select *from employ where Ename='"+Name+"'and Econtact='"+Contact+"'");
			if(rs.next())
			{
				System.out.println("login succ....");
			}
			else
			{
				System.out.println("login failed.........");
			}
		}
		else
		{
			System.out.println("Some problem occur........");
		}

	}

}
