package FileHandling;
import java.util.*;
public class PrintTable {

	public static void main(String[] args) {
		int num,i;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(num+" X "+i+" = "+(i*num));
		}
		sc.close();

	}

}
