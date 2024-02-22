package JavaPractical;
class Player
{
	private int id;
	private String name;
	private int runs;
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
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
}
class team
{
	public void addPlayer(Player ...p)
	{
		System.out.println("PID\tPNAME\t\tPRUNS");
		for(int i=0;i<p.length;i++)
		{
			System.out.printf("%d\t%s\t%d\n",p[i].getId(),p[i].getName(),p[i].getRuns());
		}
	}
}

public class TeamApplication {

	public static void main(String[] args) {
		
		Player p1=new Player();
		p1.setId(1);
		p1.setName("Rohit Shrma");
		p1.setRuns(264);
		
		Player p2=new Player();
		p2.setId(2);
		p2.setName("King Kohli");
		p2.setRuns(183);
		
		Player p3=new Player();
		p3.setId(3);
		p3.setName("SuryaKumar ");
		p3.setRuns(83);
		
		 team r=new  team();
		 r.addPlayer(p1,p2,p3);

	}

}
