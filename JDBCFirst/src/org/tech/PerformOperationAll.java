package org.tech;
import java.sql.*;
import java.util.*;
public class PerformOperationAll {

	public static void main(String[] args) throws SQLException{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproblem","root","Gajanan@123");
		if(conn !=null)
		{
			System.out.println("connected succ.......");
			Statement stmt=conn.createStatement();
			System.out.println("enter the id name email salary and conatact");
			Scanner sc=new Scanner(System.in);
			int id=sc.nextInt();
			String name=sc.next();
			String email=sc.next();
			int salary=sc.nextInt();
			String contact=sc.next();

//					
//			int value=stmt.executeUpdate("insert into employ values("+id+",'"+name+"','"+email+"',"+salary+",'"+contact+"')");
//			int value=stmt.executeUpdate("update employ set Ename='"+name+"',Eemail='"+email+"',Esal="+salary+",Econtact='"+contact+"' where Eid="+id);
			int value=stmt.executeUpdate("delete from employ where Eid="+id);
			if(value > 0)
			{
//				System.out.println("data insert succ....");
//				System.out.println("update data succ.....");
				System.out.println("delete data succ.....");
			}
			else
			{
				System.out.println("Some problrm occur..........");
			}
			
		}
		else
		{
			System.out.println("some problem occur....");
		}

	}

}
