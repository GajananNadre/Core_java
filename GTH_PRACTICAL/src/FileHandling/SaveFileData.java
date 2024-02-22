package FileHandling;
import java.util.*;
import java.io.*;

public class SaveFileData {

	public static void main(String[] args) throws IOException{
		FileWriter fm =new FileWriter("C:\\Users\\Gajanan\\Desktop\\practice1.txt",true);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the data in strin");
		String data=sc.nextLine();
		fm.write(data);
		fm.close();
       System.out.println("data save sucssec..");
	}

}
