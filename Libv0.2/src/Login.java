import java.util.Scanner;

public class Login {

	private String login;
	private String password;
	Scanner inputVal = new Scanner(System.in);
	
	public void loginSequence(){
		System.out.println("Enter your credentials as it follows:");
		System.out.println("login");
		System.out.println("password");
		
		//System.out.println("your login: \n");
		login = inputVal.nextLine();
		//System.out.println(" ");
		//System.out.println("your password: \n");
		password = inputVal.nextLine();
		
		
		
		
		System.out.println("Ok, Login : " + login + "Pass: " + password);
	}

	
	
	
	
	
	
}
