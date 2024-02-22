package JavaPractical;
import java.util.*;
class Employee
{
	private int id;
	private int sal;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Company
{
	private Employee []emp;
	public void setEmployeeDetail(Employee ...emp)
	{
		this.emp=emp;
	}
	public void show()
	{
		System.out.println(" id\tsal\tname");
	for(int i=0;i<emp.length;i++)
	{
		System.out.println(emp[i].getId()+"\t"+emp[i].getSal()+"\t"+emp[i].getName());
		
	}
	}
}

public class CompanyApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the size");
			int size=sc.nextInt();
			Employee e[]=new Employee[size];
			for(int i=0;i<size;i++)
			{
				e[i]=new Employee();
				System.out.println("enter the id sal name");
				int id=sc.nextInt();
				int sal=sc.nextInt();
				String name=sc.next();
				e[i].setId(id);
				e[i].setSal(sal);
				e[i].setName(name);
			}
			Company c=new Company();
			c.setEmployeeDetail(e);
			c.show();
		}

	}

}
