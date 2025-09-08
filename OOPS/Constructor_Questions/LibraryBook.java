package Constructor_Questions;

public class LibraryBook {
	  String title;
	    String author;
	    double price;
	    boolean available;

	    public LibraryBook(String title, String author, double price, boolean available) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.available = available;
	    }

	    public void borrowBook() {
	        if (available) {
	            available = false;
	            System.out.println("Book '" + title + "' borrowed successfully!");
	        } else {
	            System.out.println("Sorry, '" + title + "' is already borrowed.");
	        }
	    }

	    public static void main(String[] args) {
	        LibraryBook lb = new LibraryBook("DAA", "Ayush Pachauri", 600, true);
	        lb.borrowBook(); 
	        lb.borrowBook(); 
	    }

}
