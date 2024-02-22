package GenericsApp;
import java.util.*;
class Test
{
	private int id;
	private String name;
	private float per;
	public Test(int id,String name,float per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
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
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
}
public class TestClassCastException {

	public static void main(String[] args) {
		ArrayList <Test> al=new ArrayList<Test>();
		Test t1=new Test(1,"Gaju",5.5f);
		Test t2=new Test(6,"Aaju",9.5f);
		Test t3=new Test(9,"Raju",6.5f);
		
		al.add(t1);
		al.add(t2);
		al.add(t3);
		for(Test t:al)
		{
			System.out.println(t.getName()+"\t"+t.getId()+"\t"+t.getPer());
		}

	}

}
