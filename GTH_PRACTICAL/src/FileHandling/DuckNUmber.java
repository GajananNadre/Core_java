package FileHandling;
import java.util.*;
public class DuckNUmber {

	public static void main(String[] args) {
		long num,rem;
		int flag=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextLong();
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			if(rem==0)
			{
				flag=0;
			}
			
		}
		if(flag==0)
		{
			System.out.println("Number is Duck");
		}else
		{
			System.out.println("Number is not Duck");
		}

	}

}
