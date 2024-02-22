package CollectionFramework;

public class DifferentData {

	public static void main(String[] args) {
		Object obj[]=new Object[5];
		obj[0]='S';
		obj[1]=100;
		obj[2]=false;
		obj[3]=1.23f;
		obj[4]=new java.util.Date();
		for(Object o:obj)
		System.out.println(o);

	}

}
