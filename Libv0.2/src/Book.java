
public abstract class Book {
	private int date;
	private String ISBN;
	private String name;
	private String author;
	
	
	
	
	public Book(String name, String author, int date, String ISBN){
		this.name = name;
		this.author = author;
		this.ISBN = ISBN;
		this.date = date;
	}
	
	public int getDate(){
		return date;
	}
	
	public void setDate(int date){
		this.date =date;
	}
	
	public String getISBN(){
		return ISBN;
	}
	
	public void setISBN(String isbn){
		this.ISBN = isbn;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name =name;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	
	public abstract void LendBook();
	public abstract void ReturnBook();
	
	public void TestFunction(){
		System.out.println("test msg");
	}
}
