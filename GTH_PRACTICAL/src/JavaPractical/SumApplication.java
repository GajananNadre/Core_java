package JavaPractical;
class Sum
{
	
	public void calSum(int ...x)
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		System.out.println("sum of all elemnt is : "+sum);
	}
	
}

public class SumApplication {

	public static void main(String[] args) {
		Sum s=new Sum();
		s.calSum(10,20,30,40,50,60);
		

	}

}
