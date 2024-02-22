package JavaPractical;
import java.util.*;

public class SmallestMissingELement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element in array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			int diff=a[i+1]-a[i];
			if(diff>1)
			{
				System.out.printf("missing elemnt is :%d",a[i]+1);
				break;
				
			}
		}
	}

}
