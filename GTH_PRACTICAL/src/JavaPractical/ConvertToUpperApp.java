package JavaPractical;
import java.util.*;
class ConvertToUpper
{
	private char c[];
	
	public void setCharArray(char c[])
	{
		this.c=c;
	}
	public void convertToUpperCase()
	{
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a'|| c[i]<='z')
			{
			    c[i]=(char)(c[i]-32);	
			}
			System.out.println(c[i]);
		}
		
	}
}

public final class ConvertToUpperApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c[]=new char[3];
		System.out.println("enter the character in array");
	   for(int i=0;i<c.length;i++)
	   {
		   c[i]=sc.next().charAt(0);
	   }
		ConvertToUpper cu=new ConvertToUpper();
		cu.setCharArray(c);
		cu.convertToUpperCase();
		sc.close();
	}

}
