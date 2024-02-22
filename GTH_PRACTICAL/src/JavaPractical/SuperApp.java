package JavaPractical;
import java.util.*;
class Chaining
{
	int num;
	Chaining()
	{
		System.out.println("i am parent cons");
	}
}
class child extends Chaining
{
	
	child(int x)
	{ super();
		System.out.println("i am child cons");
		
	}
}

public class SuperApp {

	public static void main(String[] args) {
		child ch=new child(100);

	}

}
