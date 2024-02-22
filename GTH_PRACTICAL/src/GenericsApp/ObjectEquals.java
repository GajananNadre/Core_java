package GenericsApp;
import java.util.*;
class Tests
{
	int no;
	Tests(int x){
		no=x;
	}
	public boolean equals(Object o)
	{
		Tests t=(Tests)o;
		if(this.no==t.no)
		{
			return true;
		}else
		{
			return false;
		}
	}
	public int hashCode()
	{
		return no*1000;
	}
}
public class ObjectEquals {

	public static void main(String[] args) {
		Tests t1=new Tests(100);
		Tests t2=new Tests(100);
		System.out.println(System.identityHashCode(t1));
		System.out.println(System.identityHashCode(t2));
		if(t1.equals(t2))
		{
			
			System.out.println("object are equal");
			System.out.println(t1.hashCode());
			System.out.println(t2.hashCode());
		}else
		{
			System.out.println("object are not equal");
		}

	}

}
