import java.awt.List;
import java.util.LinkedList;
import javax.swing.plaf.synth.SynthSeparatorUI;
import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Date currentDate = new java.util.Date(); //new Object - date
		System.out.print(currentDate);
		System.out.println(" Lib v0.2");
		Scanner sc1 = new Scanner(System.in);//object input
		Scanner sc2 = new Scanner(System.in); //if statements input
		
		Login newLogin = new Login();
		newLogin.loginSequence();
		newLogin.UserVerification();
		LinkedList<FantasyBook> listofBooks = new LinkedList<FantasyBook>();
		
		int localLogin = newLogin.getAccountID(); //1 - user; 2- admin;
		System.out.println("Account ID: " + localLogin);
		
		if (localLogin == 1){
			System.out.println("Select an action to do:");
			System.out.print("1: - Borrow a book/n 2: - Return a book");
		}
		
		else if (localLogin == 2){
			System.out.println("Select an action to do:");
			System.out.print("1: - Add a book to the system/n 2: - Remove a book from the system/n 3: - Show all the books");
			int getDecision = sc2.nextInt();
			if(getDecision == 1){
				System.out.println("Enter: Name, Author, isbn, year");
				FantasyBook fBook6 = new FantasyBook(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextInt());
				listofBooks.add(fBook6);
			}
			else if(getDecision == 2){
				//show all the books and select a book to get rid of
			}
			
			else if(getDecision == 3){
				//just loop through the listofBooks
			}
		}
		
		else {
			// Error, you have to be logged in
		}
		
		FantasyBook fBook1 = new FantasyBook("The Black Company", "Glen Cook", "12345", 1984);
		/*FantasyBook fBook2 = new FantasyBook("The Broken Empire Trilogy", "Mark Lawrence", 2011, "62345");
		FantasyBook fBook3 = new FantasyBook("The Chronicles of Narnia", "C.S. Lewis", 1950, "12545");
		FantasyBook fBook4 = new FantasyBook("The Chronicles of Thomas Covenant", "Stephen R. Donaldson", 1977, "15545");
		FantasyBook fBook5 = new FantasyBook("The Chronicles of Prydain", "Lloyd Alexander", 1964, "66345");*/
		
		
			
		
	
		listofBooks.add(fBook1);
		/*listofBooks.add(fBook2);
		listofBooks.add(fBook3);
		listofBooks.add(fBook4);
		listofBooks.add(fBook5);*/
		
		
			for (int x = 0; x<listofBooks.size(); x++){
			System.out.println(listofBooks.get(x).getName());
			System.out.println(listofBooks.get(x).getAuthor());
			System.out.println(listofBooks.get(x).getDate());
			System.out.println(listofBooks.get(x).getISBN());
			}//ends for loop
		
	}//ends main
	
	
}//ends class
