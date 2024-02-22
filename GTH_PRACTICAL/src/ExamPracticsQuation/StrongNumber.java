package ExamPracticsQuation;
import java.util.*;
public class StrongNumber {
	public static void main(String[] args) {
		int last,number,fact,sum,i,original;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		original=number;
		sum=0;
		i=1;
		while(number>0)
		{
			last=number%10;
			fact=1;
			for(i=1;i<=last;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			number=number/10;
		}
		if(sum==original)
		{
			System.out.println("Number is strong  :" +original);
		}else
		{
			System.out.println("Number is  not strong  :" +original);
		}

	}

}
