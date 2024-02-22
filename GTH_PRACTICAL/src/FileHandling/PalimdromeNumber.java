package FileHandling;
import java.util.*;
public class PalimdromeNumber {

	public static void main(String[] args) {
		long number,rem,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextLong();
		long temp=number;
		while(number!=0)
		{
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		if(rev==temp)
		{
			System.out.println("Number is palimdrome");
		}else
		{
			System.out.println("Number is not Palimdrome");
		}
	}

}
