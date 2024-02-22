package JavaPractical;
import java.util.*;

class seller
{
	private int sp,cp,profit,loss;
	public void acceptSellingCostPrice(int sp,int cp)
	{
		this.sp=sp;
		this.cp=cp;
		
	}
	public void showProfiLoss()
	{
		profit=sp-cp;
		loss=cp-sp;
		System.out.println("profit is  : "+profit);
		System.out.println("\n");
		System.out.println("loss is : "+loss);
	}
}
public class SellerApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the sp and cp");
		int sp=sc.nextInt();
		int cp=sc.nextInt();
		
		seller s=new seller();
		s.acceptSellingCostPrice(sp, cp);
		s.showProfiLoss();
	}

}
