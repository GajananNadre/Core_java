package GenericsApp;
import java.util.*;
public class TestClassException {

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(100);
		al.add(500);
		int sum=0;
		for(Object obj:al)
		{
			sum =sum+(int)obj;
		}
		System.out.println(sum);
	}

}
