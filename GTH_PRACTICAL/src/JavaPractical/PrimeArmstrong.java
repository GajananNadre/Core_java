package JavaPractical;
import java.lang.*;
class C extends Thread
{
		public void run(){
	    for(int i=2;i<=100;i++) 
	    {
	    	int isPrime=1;
	    	for(int j=2;j<=(i/2);j++)
	    	{
	    		if(i%j==0)
	    		{
	    			isPrime=0;
	    			break;
	    		}
	    	}
	    	if(isPrime==1)
	    	{
	    		System.out.println(i);
	    	}
	    	
		 }
	}
}


public class PrimeArmstrong {

	public static void main(String[] args) {
		C a=new C();
		a.run();

	}

}
