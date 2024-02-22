package Vector_Problem;
import java.util.*;
public class GCD_problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int i=1,gcd=0;
		while(i<num1 && i<num2)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
			}
			i++;
		}
		System.out.println("GCD is :"+gcd);

	}

}
