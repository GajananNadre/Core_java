package JavaPractical;
import java.util.*;
public class FindPairWithGivensum {

	public static void main(String[] args) {
		int i,j,flag=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the element in aaray");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the sum");
		int sum=sc.nextInt();
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.printf("the sum of pair is %d and %d ", i,j);
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				break;
			}
		}
	}
}


