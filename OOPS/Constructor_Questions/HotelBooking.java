package Constructor_Questions;

public class HotelBooking {
	 String guestName;
	    String roomType;
	    int nights;
	    public HotelBooking() {
	        this.guestName = "Guest";
	        this.roomType = "Standard";
	        this.nights = 1;
	    }
	    public HotelBooking(String guestName, String roomType, int nights) {
	        this.guestName = guestName;
	        this.roomType = roomType;
	        this.nights = nights;
	    }
	    public HotelBooking(HotelBooking other) {
	        this.guestName = other.guestName;
	        this.roomType = other.roomType;
	        this.nights = other.nights;
	    }
	    public void display() {
	        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
	    }

	    public static void main(String[] args) {
	        HotelBooking h1 = new HotelBooking();
	        HotelBooking h2 = new HotelBooking("Suraj", "Single Seater", 1);
	        HotelBooking h3 = new HotelBooking(h2);
	        h1.display();
	        h2.display();
	        h3.display();
	    }

}
