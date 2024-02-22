package JavaPractical;
import java.util.*;
class Delid
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

public class DeleteEmpId {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		Delid[] di=new Delid[size];
		for(int i=0;i<di.length;i++)
		{
			System.out.println("enter name id and salary");
			di[i]=new Delid();
			String name=sc.next();
			int id =sc.nextInt();
			int salary=sc.nextInt();
			di[i].setName(name);
			di[i].setId(id);
			di[i].setSalary(salary);
			
		}
		System.out.println("enter the index for delete");
		int idx=sc.nextInt();
		for (int i = 0; i < di.length; i++) {
			if(idx==di[i].getId()) {
				for (int j = i; j < di.length-1; j++) {
					di[j]=di[j+1];
				}
			}
		}
//		for(int i=index;i<size-1;i++)
//		{
//			di[i]=di[i+1];
//		}
		System.out.println("After Deleting id");
		System.out.println("Name\tid\tSalary");
		for(int i=0;i<di.length-1;i++)
		{
			System.out.println(di[i].getName()+"\t"+di[i].getId()+"\t"+di[i].getSalary());
		}
	}

}
