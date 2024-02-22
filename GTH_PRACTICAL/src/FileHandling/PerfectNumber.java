package FileHandling;
import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		long num,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextLong();
		
		for(i=1;i<=(num/2);i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("Number is perfect");
		}else
		{
			System.out.println("Number is not perfect");
		}

	}

}
