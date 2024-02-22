package JavaPractical;
import java.util.*;
class Studen
{
	private int id;
	private String name;
	
	protected int totalfees,disFees,actualPaidFees;
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
	public int getTotalfees() {
		return totalfees;
	}
	public void setTotalfees(int totalfees) {
		this.totalfees = totalfees;
	}

}
class DiscountFees
{
	private  Studen s;

	public void setStudent( Studen student)
	{
		s=student;
		
	}
	public void checkDiscountEligibility(int per)
	{   
		if(per>=60)
		{
			s.disFees=(int)(0.3*s.totalfees);
			s.actualPaidFees=s.totalfees-s.disFees;
		}
	}
	public void show()
	{
		System.out.printf("Name is :%s\nid is :%d\nTotalFees is : %d\nDiscountFees is : %d\nActualPaidFees is : %d",s.getName(),s.getId(),s.totalfees,s.disFees,s.actualPaidFees);
	}
}

public class StudentDiscountApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id name per totalfees disfees actalpaidfees");
		
		int id=sc.nextInt();
		String name=sc.next();
		int totalfees=sc.nextInt();

		
		Studen s1=new Studen();
		s1.setId(id);
		s1.setName(name);
		s1.setTotalfees(totalfees);

		
		DiscountFees df=new DiscountFees();
		df.setStudent(s1);
		df.checkDiscountEligibility(60);
		df.show();
		

	}

}
