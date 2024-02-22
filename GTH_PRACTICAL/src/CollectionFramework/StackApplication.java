package CollectionFramework;
import java.util.*;

public class StackApplication {

	public static void main(String[] args) {
		Stack s=new Stack();
		int choice,value;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1.PUSh");
			System.out.println("2.POP");
			System.out.println("3.Display");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter data in stack");
				value=sc.nextInt();
				s.push(value);
				break;
			case 2:
				boolean b=s.isEmpty();
				if(b)
				{
					System.out.println("stack is empty");
				}else
				{
					Object obj=s.pop();
					System.out.println("Deleted value "+obj);
				}
				break;
			case 3:
				ListIterator lst=s.listIterator(s.size());
				while(lst.hasPrevious())
				{
					Object obj=lst.previous();
					System.out.println(obj);
				}
					
				break;
			}
		}while(true);
		
	}

}
