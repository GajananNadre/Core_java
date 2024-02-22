package JavaPractical;
import java.util.*;
public class Occurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter the element in array");
        for(int i=0;i<a.length;i++)
        {
        	a[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<a.length;i++)
        {
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[i]>a[j])
        		{
        			int temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;
        		}
        	}
        }
        
        int count=1,i;
        System.out.println("After the Sorting");
        for(i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+"\t");
        }
        System.out.println();
        for(i=0;i<a.length-1;i++)
        {
        		if(a[i]==a[i+1])
        		{
        			count++;
        		}
        		else
        		{
        			System.out.println(a[i]+"------>"+count);
        			count=1;
        		}
        }
        System.out.println(a[i]+"------>"+count);
        
	}

}
