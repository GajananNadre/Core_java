package JavaPractical;
import java.util.*;
class Employeee
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
}

public class EmployeeApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employeee emp[]=new Employeee[3];
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employeee();
			System.out.println("enter the id and name");
			int id=sc.nextInt();
			String name=sc.next();
			emp[i].setId(id);
			emp[i].setName(name);
		}
		System.out.println("display the name and id");
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i].getId()+"\n"+emp[i].getName());
		}

	}

}
