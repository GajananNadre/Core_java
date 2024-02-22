package JavaPractical;
import java.util.*;
public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,count=1;
		int a[]=new int[5];
		System.out.println("eneter the elemenr in array");
        for(i=0;i<5;i++)
        {
        	a[i]=sc.nextInt();
        }
        int mid=(a.length)/2;
        for(i=0;i<a.length-1;i++)
        {
        	for(j=i+1;j<a.length;j++)
        	{
        		if(a[i]==a[j])
        		{
        			count++;
        		}
        	}
        }
        if(count>mid)
        {
        	System.out.printf("Majority element found : %d ",a[i]);
        }else
        {
        	System.out.println("No majority element found");
        }
	}

}
