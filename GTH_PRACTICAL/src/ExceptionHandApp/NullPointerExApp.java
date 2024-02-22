package ExceptionHandApp;

public class NullPointerExApp {
	static int a[];
	public static void main(String[] args) {
		
		try
		{
			a[0]=100;
			System.out.println(a[0]);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
