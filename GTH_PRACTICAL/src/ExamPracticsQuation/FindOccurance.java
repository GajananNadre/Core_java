package ExamPracticsQuation;
import java.util.*;
public class FindOccurance {

	public static void main(String[] args) {
		int i,j,temp,count=1;
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element in array");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("sorted array is ");
		for(i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;
			}else
			{
				System.out.println("\n"+arr[i]+"------>"+count);
				count=1;
			}
		}
		System.out.println("\n" + arr[arr.length - 1] + "------>" + count);
	}

}
