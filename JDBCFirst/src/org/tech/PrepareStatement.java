package org.tech;
import java.sql.*;
import java.util.*;
public class PrepareStatement {

	public static void main(String[] args) throws Exception {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproblem","root","Gajanan@123");
		if(conn !=null)
		{
			System.out.println("Database connected succ....");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id Name and salary");
			int id=sc.nextInt();
			String name=sc.next();
			int salary=sc.nextInt();
			PreparedStatement pstmt=conn.prepareStatement("insert into Sudya values(?,?,?)");
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			pstmt.setInt(3, salary);
			int value=pstmt.executeUpdate();
			if(value > 0)
			{
				System.out.println("insert succ.....");
			}
			else
			{
				System.out.println("Some problem occur........");
			}
		}
		else
		{
			System.out.println("Some problem occur......");
		}
	}

}
