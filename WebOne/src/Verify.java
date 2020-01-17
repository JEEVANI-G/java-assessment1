import java.io.File;
import java.util.Scanner;

public class Verify 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	String answer;
		String username;
		String pwd;
		File file = new File("C:Users.admin.Desktop.WebOne");
		System.out.println("Enter username and pwd");
	username=sc.next();
	pwd=sc.next();
	System.out.println("do u want to continue");
	answer=sc.next();
	if(answer.equals("yes"))
	{String[] fileNames = file.list();

File[]   files = file.listFiles();
	}
	else return;
}


		
	}
