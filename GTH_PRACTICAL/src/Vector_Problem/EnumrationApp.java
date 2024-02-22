package Vector_Problem;
import java.util.*;
public class EnumrationApp {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		
		Enumeration enm=v.elements();
		while(enm.hasMoreElements()) {
			Object obj=enm.nextElement();
			System.out.println(obj);
			
			}

	}

}
