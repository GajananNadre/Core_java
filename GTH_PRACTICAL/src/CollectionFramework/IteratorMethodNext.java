package CollectionFramework;
import java.util.*;
public class IteratorMethodNext {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}
		

	}

}
