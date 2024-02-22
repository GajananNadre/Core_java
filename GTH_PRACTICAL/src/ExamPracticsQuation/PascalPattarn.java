package ExamPracticsQuation;
import java.util.*;
public class PascalPattarn {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=7;i++)
		{	int k=1;
			for(j=1;j<=7;j++)
			{
				if(j<=i)
				{
					System.out.printf("%3d",k);
					k=k*(i-j)/j;
				}
			}
			System.out.println("\n");
		}

	}

}
