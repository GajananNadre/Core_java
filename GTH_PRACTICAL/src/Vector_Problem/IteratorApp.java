package Vector_Problem;
import java.util.*;
public class IteratorApp {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		
		Iterator i=v.iterator();
		int sum=0;
		while(i.hasNext())
		{
			Object obj=i.next();
			sum=sum+(Integer)obj;
		}
		System.out.println(sum);
	}

}
