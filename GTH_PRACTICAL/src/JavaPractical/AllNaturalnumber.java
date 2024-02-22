package JavaPractical;
import java.lang.*;
class num extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=100;i++)
			{
				System.out.print(i+",");
				Thread.sleep(1000);
			}
			
		}
		catch(Exception ex)
		{
			System.out.print(ex);
		}
	}
}

public class AllNaturalnumber {

	public static void main(String[] args) {
		num n=new num();
		n.start();
       

	}

}
