package JavaPractical;
import java.util.*;
class Circle
{
	float radius;
	public void setRadius(float radius)
	{
		this.radius=radius;
	}
	public void showArea()
	{
		float carea=3.14f*radius*radius;
		System.out.println(carea);
	}
	
}

public class CircleArea {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Circle c=new Circle();
		c.setRadius(5.5f);
		c.showArea();

	}

}
