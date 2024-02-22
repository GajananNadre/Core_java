package JavaPractical;
import java.lang.*;
class MyThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(i);
				sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
class MyThread1 extends Thread
{
	public void run()
	{
	try
	{
		for(int i=0;i<=50;i++)
		{
			System.out.println(i);
			sleep(1000);
		}
		
	}
	catch(Exception ex)
	{
		System.out.println(ex);
	}
	}
}

public class MyThreadApplication {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		MyThread1 t1=new MyThread1();
		t1.start();
	}
	

}
