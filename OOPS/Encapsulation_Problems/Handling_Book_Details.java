package Encapsulation_Problems;
public class Handling_Book_Details {
	String bookTitle;
	String bookAuthor;
	double price;
	Handling_Book_Details(String bookTitle,String bookAuthor,double price){
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.price=price;
	}
	public void displayBookDetails() {
		System.out.println("Title of the book: "+bookTitle);
		System.out.println("Author of the book: "+bookAuthor);
		System.out.println("Price of the book: "+price);
	}
	public static void main(String[] args) {
	Handling_Book_Details book1= new Handling_Book_Details("DAA", "Coreman", 500);
	Handling_Book_Details book2=new Handling_Book_Details("Wings Of Fire","Abdul kalam.A.P.J",  500);
	book1.displayBookDetails();
	book2.displayBookDetails();
	}
}

