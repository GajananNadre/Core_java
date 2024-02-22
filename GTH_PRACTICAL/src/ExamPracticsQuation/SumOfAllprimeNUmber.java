package ExamPracticsQuation;
import java.util.*;
public class SumOfAllprimeNUmber {

	public static void main(String[] args) {
		int i,j,number,count,sum=0;
		System.out.println("Enter the number ");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		for(i=1;i<=number;i++)
		{
			count=1;
			for(j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					count=0;
					break;
				}
				sum=sum+i;
			}
			
			if(count==1)
			{
				System.out.println(i);
			}
		}
		System.out.println(sum);
	}

}
