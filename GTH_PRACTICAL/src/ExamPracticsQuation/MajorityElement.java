package ExamPracticsQuation;
import java.util.*;
public class MajorityElement {

	public static void main(String[] args) {
		int i,j,flag=1,count;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element in array");
		int arr[]=new int[8];
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int mid=(arr.length)/2;
		for(i=0;i<arr.length;i++)
		{
			count=1;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>mid)
			{
				System.out.println("Majority Element Found  :"+arr[i]);
				flag=0;
				break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("No Majority Element Found");
		}
		
	}

}
