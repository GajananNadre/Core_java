package CollectionFramework;
import java.util.*;
class Player implements Comparable
{
	private int id;
	private String name;
	private int run;
	public Player(int id,String name,int run)
	{
		this.id=id;
		this.name=name;
		this.run=run;
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
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public int compareTo(Object obj)
	{
		Player p=(Player)obj;
		if(this.id>p.id)
		{
			return 1;
		}
		else if(this.id < p.id)
		{
			return -1;
		}else
		{
			return 0;
		}
	}
	
}
public class ComparableCollectionPlayerSortRun {

	public static void main(String[] args) {
		Player p1=new Player(1,"Rohit",264);
		Player p2=new Player(2,"Virat",183);
		Player p3=new Player(3,"Gill",150);
		Player p4=new Player(4,"Dhoni",91);
		Player p5=new Player(5,"Sachin",100);
		
		ArrayList al=new ArrayList();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		
		System.out.println("Display Before Sorting");
		for(Object obj:al)
		{
			Player p=(Player)obj;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		}
		Collections.sort(al);
		System.out.println("Display After Sorting");
		for(Object obj:al)
		{
			Player p=(Player)obj;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		}
		

	}

}
