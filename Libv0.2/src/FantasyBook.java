

public class FantasyBook extends Book{

	
	
	public FantasyBook(String name, String author, int date, String ISBN){
		super(name, author, date, ISBN);
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
