package JavaPractical;
import java.util.*;
public class CeilingOfNUm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[8];
		System.out.println("Enter the element in array");
		for(int i=0;i<8;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Ceiling search value");
		int value=sc.nextInt();
		for(int i=0;i<8;i++)
		{
			if(value<=a[i])
			{
				System.out.printf("The ceiling of %d is :%d",value,a[i]);
				break;
			}
		}

	}

}
