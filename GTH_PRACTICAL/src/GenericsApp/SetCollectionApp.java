package GenericsApp;
import java.util.*;
class Employeee
{
	private int id;
	private String name;
	public Employeee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
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
	public boolean equals(Object o)
	{
		Employeee e=(Employeee)o;
		if(this.id==e.id && this.name==e.name)
		{
			return true;
		}else
		{
			return false;
		}
	}
	public int hashCode()
	{
		return id*100;
	}
	
}
public class SetCollectionApp {

	public static void main(String[] args) {
		LinkedHashSet<Employeee> hs=new LinkedHashSet<>();
		Employeee e1=new Employeee(1,"gajanan");
		Employeee e2=new Employeee(1,"sudya");
		Employeee e3=new Employeee(1,"harsh");
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		
		for(Employeee e:hs)
		{
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+System.identityHashCode(e));
			System.out.println(e.hashCode());
		}
	}

}
