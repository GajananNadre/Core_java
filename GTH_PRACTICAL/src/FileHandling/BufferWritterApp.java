package FileHandling;
import java.util.*;
import java.io.*;

public class BufferWritterApp {

	public static void main(String[] args) throws IOException{
		FileWriter  fw=new FileWriter ("C:\\Users\\Gajanan\\Desktop\\practice1.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		Scanner sc=new Scanner (System.in);
		System.out.println("eneter data in file");
		String data=sc.nextLine();
		fw.write(data);
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("data sucssecfully added.....");
		
		

	}

}
