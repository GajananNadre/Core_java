package ExamPracticsQuation;
import java.util.*;
public class TransposeMatrix {

	public static void main(String[] args) {
		int i,j;
		int arr[][]=new int [2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element in array");
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr.length;j++){
			arr[i][j]=sc.nextInt();
		     }
		}
		System.out.println("Display Matrix Before Transpose");
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr.length;j++){
				System.out.printf("%d\t",arr[i][j]);
		     }
			System.out.printf("\n");
		}
		System.out.println("Display matrix after the transpose");
		for(j=0;j<arr.length;j++)
		{
			for(i=0;i<arr.length;i++)
			{
				System.out.printf("%d\t",arr[i][j]);
			}
			System.out.printf("\n");
		}

	}

}
