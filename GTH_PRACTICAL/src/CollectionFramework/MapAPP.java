package CollectionFramework;
import java.util.*;
public class MapAPP {

	public static void main(String[] args) {
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(1, "gajubhai");
		lhm.put(2, 10);
		lhm.put(3, "sudya");
		
		Object obj=lhm.get(3);
		System.out.println(obj);

	}

}
