package File_Handling;
import java.io.*;
import java.util.*;
public class SaveFileData {

	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("F:\\project group 38\\ALL PDF\\Sam.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the data ");
		String Data=sc.nextLine();
		bw.write(Data);
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("data save succ...");
		

	}

}
