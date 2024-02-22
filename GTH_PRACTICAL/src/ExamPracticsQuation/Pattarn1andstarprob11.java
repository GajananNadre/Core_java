package ExamPracticsQuation;
import java.util.*;
public class Pattarn1andstarprob11 {

	public static void main(String[] args) {
		int i,j,flag=1;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=17;j++)
			{
				if(j>=10-i && j<=8+i && flag==1)
				{
					System.out.printf("%d",i);
					flag=0;
				}
				else
				{
					System.out.printf("*");
					flag=1;
				}
			}
			System.out.printf("\n");
		}

	}

}
