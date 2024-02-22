package ExamPracticsQuation;
import java.util.*;
public class CellingFloor {

	public static void main(String[] args) {
		int i,j,cell,floor;
		int arr[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element in array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			cell=-1;
			floor=-1;
			for(j=0;j<arr.length;j++)
			{
				if(arr[j]==i)
				{
					floor=arr[j];
					cell=arr[j];
					break;
				}else if(i<=arr[j])
				{
					cell=arr[j];
					break;
				}else if(i>=arr[j])
				{
					floor=arr[j];
				}
			}
			System.out.printf("Number :%d celling :%d floor :%d\n",i,cell,floor);
		}
	}

}
