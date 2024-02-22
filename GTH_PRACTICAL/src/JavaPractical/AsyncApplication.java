package JavaPractical;

class Table
{
	 void showTable(int no)
	 {
		 try
		 {
			 for(int i=1;i<=10;i++)
			 {
				 System.out.println(i+" x "+no+" = "+ i*no);
				 Thread.sleep(1000);
			 }
			 
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex);
		 }
	 }
}
class Two extends Thread
{
	Table table;
	void setTable(Table table)
	{
		this.table=table;
		
	}
	public void run()
	{
		table.showTable(2);
	}
}
class Three extends Thread
{
	Table table;
	void setTable(Table table)
	{
		this.table=table;
		
	}
	public void run()
	{
		table.showTable(3);
	}
}

public class AsyncApplication {

	public static void main(String[] args) {
		Table y1=new Table();
		Two t=new Two();
		t.setTable(y1);
		t.start();
		Three th=new Three();
		th.setTable(y1);
		th.start();

	}

}
