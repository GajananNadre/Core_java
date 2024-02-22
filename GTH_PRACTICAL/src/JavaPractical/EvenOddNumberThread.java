package JavaPractical;
import java.lang.*;
class A extends Thread
{
		public void run(){
	    for(int i=2;i<=100;i++) 
	    {
	    	if(i%2==0)
	    	{
	    		System.out.print(i+",");
	    	}
		
		    }
		  }
}
class B extends Thread
{
	public void run(){
		System.out.println();
	    for(int i=1;i<=100;i++) {
		 if(i%2==1)
		 {
			 System.out.print(i+",");
		 }
		    }
		  }
}
public class EvenOddNumberThread {

	public static void main(String[] args) {
		A a=new A();
		a.run();
		B b=new B();
		b.run();
				

	}

}
