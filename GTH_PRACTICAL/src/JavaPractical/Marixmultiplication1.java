package JavaPractical;
import java.util.*;
class Marixmul
{
	private int a[][],b[][];
	public void acceptTwoArray(int x[][],int y[][])
	{
		a=x;
		b=y;
	}
	public void ShowMatrixMultiplication()
	{	 int sum;
	     int c[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{   sum=0;
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					sum = sum + (a[i][k] * b[k][j]);
				}
				c[i][j]=sum;
			}
		}
		System.out.println("Multiplication of matrix is");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				System.out.printf("%d ",c[i][j]);		
			}
			System.out.printf("\n");
		}
	}
}

public class Marixmultiplication1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int i,j;
		System.out.println("enter element in first array");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();		
			}
		}
		System.out.println("enter element in second array");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();		
			}
		}
		Marixmul mm=new Marixmul();
		mm.acceptTwoArray(a, b);
		mm.ShowMatrixMultiplication();
		

	}

}
