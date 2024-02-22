package ExceptionHandApp;
import java.util.*;
class VoterException extends ArithmeticException{
	public String getVoterError() {
		return "invalid voter because below 20";
	}
}
class votingMachine
{
	void verifyVoter(int age)
	{
		if(age<20)
		{
			VoterException ve=new VoterException();
			throw ve;
		}else
		{
			System.out.println("valid voter");
		}
	}
}
public class UserDefineExApp {

	public static void main(String[] args) {
		try
		{
			votingMachine vm=new votingMachine();
			vm.verifyVoter(17);
		}
		catch(VoterException ve)
		{
			System.out.println(ve);
		}

	}

}
