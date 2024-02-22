package Vector_Problem;
import java.util.*;
class employ{
	private int id;
	private String name;
	private int salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
public class createpojoclassandfetchdata {

	public static void main(String[] args) {
		employ e1=new employ();
		e1.setId(1);
		e1.setName("Gajanan");
		e1.setSalary(10000);
		
		employ e2=new employ();
		e2.setId(2);
		e2.setName("Sudya");
		e2.setSalary(20000);
		
		employ e3=new employ();
		e3.setId(3);
		e3.setName("anush");
		e3.setSalary(30000);
		
		employ e4=new employ();
		e4.setId(4);
		e4.setName("anuj");
		e4.setSalary(40000);
		
		employ e5=new employ();
		e5.setId(5);
		e5.setName("harsh");
		e5.setSalary(50000);
		
		Vector v=new Vector();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		v.add(e4);
		v.add(e5);
		
		Iterator i=v.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			employ e=(employ)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
		}
		
	}

}
