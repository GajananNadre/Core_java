package JavaPractical;
import java.lang.*;
class D extends Thread
{
		public void run(){
	    for(char i='a';i<='z';i++) {
		System.out.print(i+",");
		    }
		  }
}
class E extends Thread
{
	public void run(){
		System.out.println();
	    for(char i='A';i<='Z';i++) {
		System.out.print(i+",");
		    }
		  }
}
public class AlphabetAtoZ {

	public static void main(String[] args) {
		D a=new D();
		a.run();
		E b=new E();
		b.run();
			
	}

}
