package JavaPractical;
import java.util.*;
class mployee
{
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

public class EmployeeShow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		mployee[] e=new mployee[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter name id and salary");
			e[i]=new mployee();
			String name=sc.next();
			int id =sc.nextInt();
			int salary=sc.nextInt();
			e[i].setName(name);
			e[i].setId(id);
			e[i].setSalary(salary);
			
		}
		System.out.println("Name\tid\tSalary");
		for(int i=0;i<size;i++)
		{
			System.out.println(e[i].getName()+"\t"+e[i].getId()+"\t"+e[i].getSalary());
		}

	}

}
