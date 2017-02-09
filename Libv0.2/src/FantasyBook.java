

public class FantasyBook extends Book{

	
	
	public FantasyBook(String name, String author, String ISBN, int date){
		super(name, author, ISBN, date);
		}
	
	
	@Override
	public void LendBook(){
		System.out.println("Book is lent");
	}
	
	@Override
	public void ReturnBook(){
		System.out.println("You have returned a book");
	}
	
	
	
	

}
