package File_Handling;
import java.io.*;
public class CreateNewFileApp {

	public static void main(String[] args)throws Exception {
		File f=new File("F:\\project group 38\\ALL PDF\\Gaju.txt");
		boolean b=f.createNewFile();
		if(b)
		{
			System.out.println("succ...");
		}
		else
		{
			System.out.println("some problem");
		}

	}

}
