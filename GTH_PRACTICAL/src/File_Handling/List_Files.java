package File_Handling;
import java.io.*;
public class List_Files {

	public static void main(String[] args) {
		File f=new File("F:\\project group 38");
		File f1[]=f.listFiles();
		for(int i=0;i<f1.length;i++)
		{
			System.out.println(f1[i]);
		}

	}

}
