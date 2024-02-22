package JavaPractical;
import java.lang.*;
class Table1
{
	synchronized void setTable(int no)
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(no+" x "+i+" = "+i*no);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
class Two1 extends Thread
{
	Table1 table;
	void showTable(Table1 table)
	{
		this.table=table;
	}
	public void run()
	{
		table.setTable(2);
	}
}
class Three1 extends Thread
{
	Table1 table;
	void showTable(Table1 table)
	{
		this.table=table;
	}
	public void run()
	{
		table.setTable(3);
	}
}
public class Synchronization {

	public static void main(String[] args) {
		Table1 t1=new Table1();
		Two1 tw=new Two1();
		tw.showTable(t1);
		tw.start();
		Three1 t2=new Three1();
		t2.showTable(t1);
		t2.start();

	}

}
