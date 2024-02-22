package ExceptionHandApp;
import java.util.*;
public class ArithmaticExceptionApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the two value");
		a=sc.nextInt();
		b=sc.nextInt();
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println("logic 1");
	}

}
