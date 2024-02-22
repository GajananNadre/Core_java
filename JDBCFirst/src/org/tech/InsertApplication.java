package org.tech;
import java.sql.*;
import java.util.*;
public class InsertApplication {

	public static void main(String[] args)throws SQLException {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproblem","root","Gajanan@123");
		if(conn !=null)
		{
			System.out.println("Database connected succ......");
			Statement smt=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name id and salary");
			String name=sc.nextLine();
			int id=sc.nextInt();
			int salary=sc.nextInt();
			
			int value=smt.executeUpdate("insert into Sudya values('"+name+"',"+id+","+salary+")");
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
