package JavaPractical;
import java.util.*;
class PrintMatrix
{
	private int a[][];
	public void acceptDArray(int x[][])
	{
		a=x;
	}
	public void showMatrix()
	{
		System.out.println("Matrix is ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.println();
		}
	}
}

public class PrintMatrixApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter the value in amtrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		PrintMatrix pm=new PrintMatrix();
		pm.acceptDArray(a);
		pm.showMatrix();
	}

}
