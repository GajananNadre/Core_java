package JavaPractical;
import java.util.*;

class Rectangle
{
	int len,wid;
	public void setLength(int len,int wid)
	{
		this.len=len;
		this.wid=wid;
	}
	public void showArea()
	{
		int rarea=len*wid;
		System.out.println(rarea);
	}
}

public class RectangleArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the length and width");
		int len=sc.nextInt();
		int wid=sc.nextInt();
		
		Rectangle r=new Rectangle();
		r.setLength(len, wid);
		r.showArea();
		
				
		

	}

}
