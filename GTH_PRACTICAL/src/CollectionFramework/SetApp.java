package CollectionFramework;
import java.util.*;
public class SetApp {

	public static void main(String[] args) {
		
//		HashSet hs=new HashSet();
//		LinkedHashSet hs=new LinkedHashSet();
		
		TreeSet hs=new TreeSet();
		hs.add(100);
		hs.add(200);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		
//		NavigableSet nav=hs.descendingSet();
		
		for(Object o:hs)
		{
			System.out.println(o);
		}

	}

}
