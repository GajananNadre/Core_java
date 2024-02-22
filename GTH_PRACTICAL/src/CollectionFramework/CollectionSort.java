package CollectionFramework;
import java.util.*;
public class CollectionSort {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(500);
		al.add(400);
		al.add(300);
		al.add(100);
		al.add(500);
		al.add(200);
		al.add(11);
		System.out.println("before sorting ");
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		Collections.sort(al);
		System.out.println("after the sort ");
		for(Object obj:al)
		{
			System.out.println(obj);
		}
	}

}
