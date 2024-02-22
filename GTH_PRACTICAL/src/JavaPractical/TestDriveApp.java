package JavaPractical;

import java.io.File;

public class TestDriveApp {

	public static void main(String[] args) {
		File f[]=File.listRoots();
		for(int i=0;i<f.length;i++)
		{
//			long totalspace=f[i].getTotalSpace();
//			long totalfreespace=f[i].getFreeSpace();
			System.out.println(f[i].getTotalSpace()+f[i].getFreeSpace());
		}

	}

}
