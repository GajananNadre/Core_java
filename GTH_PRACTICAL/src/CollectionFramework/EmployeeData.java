package CollectionFramework;
import java.util.*;
class Employee
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	private int sal;
	public Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
}
public class EmployeeData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp1=new Employee(1,"gajanan",1000);
		Employee emp2=new Employee(2,"sudya",2000);
		Employee emp3=new Employee(3,"amol",3000);
		Employee emp4=new Employee(4,"mahesh",8000);
		Employee emp5=new Employee(5,"harsh",5000);

		ArrayList al=new ArrayList();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);
		

		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			Employee e=(Employee)obj;
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
		}


	}

}
