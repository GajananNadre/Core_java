package ExamPracticsQuation;
import java.util.*;

public class PattarnDiamondProb12 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=7;i++)
		{
			for(j=1;j<=7;j++)
			{	int count=1;
				if(j==5-i || j==3+i && i<=4)
				{
					System.out.printf("*");
				}
				
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}

	}

}
