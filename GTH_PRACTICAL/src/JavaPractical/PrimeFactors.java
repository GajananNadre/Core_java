package JavaPractical;
import java.util.*;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two value");
		int num=sc.nextInt();
		int i,j,count;
		for(i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				count=1;
				for(j=2;j<(i/2);j++)
				{
					if(i%j==0)
					{
					  count=0;
					  break;
					}
				}
				if(count==1)
				{
					System.out.println("prime factor is :"+i);
				}
			}
		}
		

	}

}
