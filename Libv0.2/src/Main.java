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
		
		Login newLogin = new Login();
		newLogin.loginSequence();
		newLogin.UserVerification();
		
		int localLogin = newLogin.getAccountID();
		System.out.println("Account ID: " + localLogin);
		
		FantasyBook fBook1 = new FantasyBook("The Black Company", "Glen Cook", 1984, "12345");
		FantasyBook fBook2 = new FantasyBook("The Broken Empire Trilogy", "Mark Lawrence", 2011, "62345");
		FantasyBook fBook3 = new FantasyBook("The Chronicles of Narnia", "C.S. Lewis", 1950, "12545");
		FantasyBook fBook4 = new FantasyBook("The Chronicles of Thomas Covenant", "Stephen R. Donaldson", 1977, "15545");
		FantasyBook fBook5 = new FantasyBook("The Chronicles of Prydain", "Lloyd Alexander", 1964, "66345");
		LinkedList<FantasyBook> listofBooks = new LinkedList<FantasyBook>();	
		
	
		listofBooks.add(fBook1);
		listofBooks.add(fBook2);
		listofBooks.add(fBook3);
		listofBooks.add(fBook4);
		listofBooks.add(fBook5);
		
		
			//for (int x = 0; x<listofBooks.size(); x++){
			//System.out.println(listofBooks.get(x).getName());
			//System.out.println(listofBooks.get(x).getAuthor());
			//System.out.println(listofBooks.get(x).getDate());
			//System.out.println(listofBooks.get(x).getISBN());
		
	}//ends main
	
	
}//ends class
