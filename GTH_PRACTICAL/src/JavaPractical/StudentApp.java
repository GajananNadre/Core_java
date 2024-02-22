package JavaPractical;
import java.util.*;
class Student
{
	private int ptr[];
	private int per,i,sum=0;
	public void setSubMarks(int a[])
	{
		ptr=a;
		
	}
	public void CalculatePer()
	{
		for(i=0;i<ptr.length;i++)
		{
			sum=sum+ptr[i];
		}
		per=sum/6;
		System.out.println("percentage is : "+per);
		
	}
	public void CheckGrade()
	{
		if(per>75 && per<=100)
		{
			System.out.println("\n Distiction");
		}
		else if(per>60 && per<=75)
		{
			System.out.println("\n First Division");
		}
		else if(per>=50 && per<=60)
		{
			System.out.println("\n Second Division");
		}
		else if(per>40 && per<=50)
		{
			System.out.println("\n Third Division");
		}else
		{
			System.out.println("\n Failed");
		}
	}
	
}

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("enter the mark of student");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Student s=new Student();
		s.setSubMarks(a);
		s.CalculatePer();
		s.CheckGrade();
		

	}

}
