package ExceptionHandApp;
import java.util.*;
public class ArrayIndexOutOfBoxExAp {

	public static void main(String[] args) {
		try
		{
			int arr[]=new int[] {10,20};
			System.out.println(arr[2]);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
