package org.tech;
import java.sql.*;
import java.util.*;
public class DeleteApplication {

	public static void main(String[] args)throws SQLException {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproblem","root","Gajanan@123");
		if(conn !=null)
		{
			System.out.println("Database connected succ......");
			Statement smt=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id for delete");
			
			int id=sc.nextInt();
			
			
			int value=smt.executeUpdate("delete from Sudya where Id="+id);
			if(value>0)
			{
				System.out.println("insert succ...");
			}else
			{
				System.out.println("some problem occuer....");
			}
		}
		else
		{
			System.out.println("some problem ocacur");
		}

	}

}
