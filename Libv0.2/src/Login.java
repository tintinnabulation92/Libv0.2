import java.io.Console;
import java.util.Scanner;

public class Login {

	private String login;
	private String password;
	Scanner inputLogin = new Scanner(System.in);
	Console cons = System.console();
	private String employeeLogin = "user";
	private String employeePass = "kernel21";
	private String userLogin = "reader";
	private String userPass = "cisco";
	
	public void loginSequence(){
		System.out.println("Letter case is important! Enter your credentials as it follows:");
		System.out.print("Enter your login");
		login = inputLogin.nextLine();
		System.out.print("Enter your password: ");
		password = inputLogin.nextLine();
		System.out.println("Ok, Login : " + login + " Pass: " + password);
		
	}

	
	public void UserVerification(){
		if(login.equals(employeeLogin) && password.equals(employeePass)){
			System.out.println("Verification complete. Logged as Administrator");
		}
		
		
		else if (login.equals(userLogin) && password.equals(userPass)){
			System.out.println("Verification complete. Logged as User.");
		}
		
		
		
		else{
			System.out.println("No such account in a system");
		}
		
	}
	
	
	
	
}
