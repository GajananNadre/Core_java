package JavaPractical;
import java.util.*;
public class FIndTheCeilAndFloar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		int a[]=new int[6];
		System.out.println("Enter the element in array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length-1;i++)
		{   
			int c=-1,f=-1;
			for(j=0;j<a.length;j++)
			{
				if(a[j]==i)
				{
					f=a[j];
					c=a[j];
				}else if(i<=a[j])
				{
					c=a[j];
					break;
				}else if(i>=a[j])
				{
					f=a[j];
				}
			}
			System.out.printf("number :%d ceiling :%d floar :%d\n",i,c,f);
		}
		

	}

}
