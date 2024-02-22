package CollectionFramework;
import java.util.*;
class link
{
	private int id;
	private String name;
	private int price;
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
	public link(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList lst=new LinkedList();
		link l1=new link(1,"gaju",10000);
		link l2=new link(2,"raju",20000);
		link l3=new link(3,"aaju",30000);
		link l4=new link(4,"sanju",40000);
		link l5=new link(5,"manju",50000);
		
		lst.add(l1);
		lst.add(l2);
		lst.add(l3);
		lst.add(l4);
		lst.add(l5);
		
		for(Object o:lst)
		{
			link l=(link)o;
			System.out.println(l.getId()+"\t"+l.getName()+"\t"+l.getPrice());
		}
		System.out.println("enter id for search");
		Scanner sc=new Scanner(System.in);
		int lid=sc.nextInt();
		boolean b=false;
		for(Object o:lst)
		{
			link l=(link)o;
			if(l.getId()==lid)
			{
				b=true;
				break;
			}
		}
		if(b)
		{
			System.out.println("id found succ..");
		}
		else
		{
			System.out.println("not found");
		}
	}

}
