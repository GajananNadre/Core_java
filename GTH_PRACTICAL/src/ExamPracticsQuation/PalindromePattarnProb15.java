package ExamPracticsQuation;
import java.util.*;
public class PalindromePattarnProb15 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{	int count=1;
			for(j=1;j<=9;j++)
			{
				if(j>=6-i && j<=4+i)
				{
					System.out.printf("%d",count);
					if(j<5)
					{
						count++;
					}else
					{
						--count;
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.printf("\n");
		}

	}

}
