package FileHandling;
import java.util.*;
public class CharacterSymbol {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if((ch >='a' && ch <='z')||(ch >='A'&&ch <='Z'))
		{
			System.out.println("It is alphabet");
		}
		else if(ch >='0'&&ch <='9')
		{
			System.out.println("It is Number");
		}
		else
		{
			System.out.println("It is Special Symbol");
		}
		

	}

}
