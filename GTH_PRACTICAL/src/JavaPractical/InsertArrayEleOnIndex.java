package JavaPractical;
import java.util.*;
class InsertArrEle
{
	private int c[];
	int i;
	public void setIntArray(int ch[])
	{
		c=ch;
	}
	public void InsertValueOnIndex(int value,int index)
	{   
		for(i=c.length-2;i>=index;i--)
		{
			c[i+1]=c[i];
		}
		c[index]=value;
		System.out.println("after the insert value at specified index");
		for(i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
}

public class InsertArrayEleOnIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		int i;
		System.out.println("enter the value in array");
		for(i=0;i<a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		int value,index;
		System.out.println("enter the value and index");
		value=sc.nextInt();
		index=sc.nextInt();
		
		InsertArrEle ia=new InsertArrEle();
		ia.setIntArray(a);
		ia.InsertValueOnIndex(value,index);
		

	}

}
