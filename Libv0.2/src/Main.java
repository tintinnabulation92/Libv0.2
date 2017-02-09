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
		Scanner sc3 = new Scanner(System.in); //book removal
		StringBuilder builder = new StringBuilder();
		StringBuilder builder2 = new StringBuilder();
		
		Login newLogin = new Login();
		newLogin.loginSequence();
		newLogin.UserVerification();
		LinkedList<FantasyBook> listofBooks = new LinkedList<FantasyBook>(); //list of available books
		LinkedList<FantasyBook> listofBorrowedBooks = new LinkedList<FantasyBook>();
		FantasyBook fBook2 = new FantasyBook("The Broken Empire Trilogy", "Mark Lawrence", "62345", 2011);
		FantasyBook fBook3 = new FantasyBook("SuperBook", "Mark Lawrence", "62345", 2011);
		FantasyBook fBook4 = new FantasyBook("The Chronicles of Narnia", "C.S. Lewis", "12545", 1950);
		FantasyBook fBook5 = new FantasyBook("The Chronicles of Thomas Covenant", "Stephen R. Donaldson", "15545", 1977);
		FantasyBook fBook6 = new FantasyBook("The Chronicles of Prydain", "Lloyd Alexander", "66345", 1964);
		listofBooks.add(fBook2);
		listofBooks.add(fBook3);
		listofBooks.add(fBook4);
		listofBooks.add(fBook5);
		listofBooks.add(fBook6);
		
		int localLogin = newLogin.getAccountID(); //1 - user; 2- admin; 0 - notlogged in
		System.out.println("Account ID: " + localLogin);
		
	while(true) {
		if (localLogin == 1){ //user login
			System.out.println("Select an action to do:");
			System.out.print("1: - Borrow a book/n 2: - Return a book");
			//missing implementation - borrowing and returning the books
			int choice = sc3.nextInt();
			if(choice == 1)
				fBook2.LendBook();
			else if(choice ==2)
				fBook2.ReturnBook();
				
			
		}
		
		else if (localLogin == 2){//admin login
			System.out.println("Select an action to do:");
			System.out.print("1: - Add a book to the system/n 2: - Remove a book from the system/n 3: - Show all the books");
			System.out.println(" 4: - Exit");
			int getDecision = sc2.nextInt();
			if(getDecision == 1){
				System.out.println("Enter: Name, Author, isbn, year");
				FantasyBook fBook7 = new FantasyBook(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextInt());
				listofBooks.add(fBook7);
			}
			else if(getDecision == 2){
				//show all the books and select a book to get rid of
				for(int indexer = 0; indexer<listofBooks.size(); indexer++){
					System.out.println("Book number :" + indexer); //indexer or list iterator?
					//System.out.print(builder.append(listofBooks.get(indexer).getName()).append("  -- ").append(listofBooks.get(indexer).getAuthor()));
					System.out.println(listofBooks.get(indexer).getAuthor());
					System.out.println(listofBooks.get(indexer).getName());
					//System.out.print(builder2.append(" ISBN: ").append(listofBooks.get(indexer).getISBN()).append(" year: ").append(listofBooks.get(indexer).getDate()));
				}//for ends here
					System.out.println("Type the number to remove a book");
					int node = sc3.nextInt();
					listofBooks.remove(node);
					System.out.println("Checking whether this works");
					
					for(int indexer = 0; indexer<listofBooks.size(); indexer++){
						System.out.println("Book number :" + indexer); //indexer or list iterator?
						System.out.println(listofBooks.get(indexer).getAuthor());
						System.out.println(listofBooks.get(indexer).getName());
					}// the methods works currently
				
			}
			
			else if(getDecision == 3){
				//show all the books
				for(int indexer = 0; indexer<listofBooks.size(); indexer++){
					System.out.println("Book number :" + listofBooks.iterator());
					System.out.print(builder.append(listofBooks.get(indexer).getName()).append("  -- ").append(listofBooks.get(indexer).getAuthor()));
					System.out.print(builder2.append(" ISBN: ").append(listofBooks.get(indexer).getISBN()).append(" year: ").append(listofBooks.get(indexer).getDate()));
				}
			}
		}
		
		else {
			System.out.println("Error, you have to be logged in");
			break;
		}
		
	}//end of while 	
		//FantasyBook fBook1 = new FantasyBook("The Black Company", "Glen Cook", "12345", 1984);
		//listofBooks.add(fBook1);
					
		
	}//ends main
	
	
}//ends class
