package JavaPractical;
import java.util.*;
class Employee11
{
	String name;
	int id;
	int basicSal;
	int Progress;
	double totalsal;
	double incrementalsal;
	
	public void setPersonalInfo(String name,int id,int basicSal)
	{
		this.name=name;
		this.id=id;
		this.basicSal=basicSal;
	}
	public void setProgress(int Progress)
	{
		totalsal=basicSal+(basicSal*30)/100;
		if(Progress>=60)
		{
			incrementalsal=totalsal-basicSal;
		}
		
	}
	public void show()
	{
		System.out.println("Name:"+name+"\n"+"Id :"+id+"\n"+"Basic salary :"+basicSal+"\n"+"IncrementalSalary :"+incrementalsal+"\n"+"Total Salary :"+totalsal);
		
	}
}

public class Employee1 {

	public static void main(String[] args) {
		int id,basicSal,progress;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name id basic salary and progress");
		name=sc.next();
		id=sc.nextInt();
		basicSal=sc.nextInt();
		progress=sc.nextInt();
		
		Employee11 emp=new Employee11();
		emp.setPersonalInfo(name, id, basicSal);
		emp.setProgress(progress);
		emp.show();
		sc.close();
	}
}
