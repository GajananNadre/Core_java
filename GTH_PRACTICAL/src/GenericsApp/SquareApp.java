package GenericsApp;
import java.util.*;
class Square implements Cloneable
{
	int no;
	void setvalue(int x)
	{
		no=x;
	}
	int getsquare()
	{
		return no*no;
	}
	public Square getInstance() throws CloneNotSupportedException{
		return(Square)this.clone();
	}
}
public class SquareApp {

	public static void main(String[] args) throws Exception {
		Square s1=new Square();
		s1.setvalue(10);
		Square s2=s1.getInstance();
		s2.setvalue(5);
		int result=s1.getsquare();
		System.out.println(result);
		
	}

}
