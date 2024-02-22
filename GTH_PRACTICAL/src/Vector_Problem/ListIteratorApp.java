package Vector_Problem;
import java.util.*;
public class ListIteratorApp {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		
		ListIterator li=v.listIterator(v.size());
		while(li.hasPrevious())
		{
			Object oj=li.previous();
			if((int)oj==300)
			{
				li.set(3000);
			}
			
		}
		System.out.println(v);
	}

}
