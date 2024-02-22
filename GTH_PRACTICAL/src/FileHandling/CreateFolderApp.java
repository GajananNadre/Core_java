package FileHandling;
import java.io.*;
public class CreateFolderApp {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\Gajanan\\Desktop1");
		boolean b=f.mkdir();
		f.delete();
		System.out.println("deleted sucscsfully");
//		if(b)
//		{
//			System.out.println("folder create sucseccfully.............");
//		}
//		else
//		{
//			System.out.println("problem occur......");
//		}

	}

}
