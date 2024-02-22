package JavaPractical;
class Product1
{
	private int id;
	private String name;
	private int qty;
	private int rate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
}
class CalculateBill
{
//	private Product1 []p;
//	private int totalbill=0;
	public void calBill(Product1 ...p)
	{  int totalbill[]=new int[p.length];
	   int TOTALBILL=0;
		System.out.printf("Product id\tProductName\tQty\tRate\tTotalbill\n");
		for(int i=0;i<p.length;i++)
		{   
			totalbill[i]=(p[i].getQty()*p[i].getRate());
			System.out.printf(" %d\t\t%s\t\t%d\t%d\t%d\n",p[i].getId(),p[i].getName(),p[i].getQty(),p[i].getRate(),totalbill[i]);
			TOTALBILL=TOTALBILL+totalbill[i];
		}
		System.out.println("\t\t\t\tTotal Bill Of Order :"+TOTALBILL);
	}
		
}

public class BillingApp {

	public static void main(String[] args) {
		Product1 po1=new Product1();
		po1.setId(1);
		po1.setName("Parle");
		po1.setQty(10);
		po1.setRate(5);
		
		Product1 po2=new Product1();
		po2.setId(2);
		po2.setName("Cadbury");
		po2.setQty(10);
		po2.setRate(10);
		
		Product1 po3=new Product1();
		po3.setId(3);
		po3.setName("Britan");
		po3.setQty(10);
		po3.setRate(10);
		
		CalculateBill cb=new CalculateBill();
		cb.calBill(po1,po2,po3);
		

	}

}
