package File_Handling;
import java.io.*;
public class DriverRoots {

	public static void main(String[] args) {
		File f[]=File.listRoots();
		for(int i=0;i<f.length;i++)
		{
			long totalspace=f[i].getTotalSpace();
			long freespace=f[i].getFreeSpace();
			
			
			System.out.println(totalspace/1073741824+"\t"+freespace/1073741824);
		}
			

	}

}
