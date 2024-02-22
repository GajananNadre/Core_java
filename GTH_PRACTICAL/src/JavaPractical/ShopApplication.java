package JavaPractical;
import java.util.*;
class Product
{
	private int id;
	private String name;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int price;
}
class Shop
{
	private Product []p;
	public void setdetail(Product ...p)
	{
		this.p=p;
	}
	void show()
	{
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].getId()+"\n"+p[i].getName()+"\n"+p[i].getPrice());
		}
	}
}

public class ShopApplication {

	public static void main(String[] args) {
		System.out.println("display");
		Product po1=new Product();
		po1.setId(1);
		po1.setName("gajanan");
		po1.setPrice(1000);
		
		Product po2=new Product();
		po2.setId(2);
		po2.setName("sudya");
		po2.setPrice(5000);
		
		Product po3=new Product();
		po3.setId(3);
		po3.setName("gfn");
		po3.setPrice(10000);
		
		Shop s=new Shop();
		s.setdetail(po1,po2,po3);
		s.show();

	}

}
