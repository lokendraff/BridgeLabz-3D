package Constructor_Questions;

public class Circle {
	 double radius;
	    public Circle() {
	        this(1.0); 
	    }
	    public Circle(double radius) {
	        this.radius = radius;
	    }
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
	    public static void main(String[] args) {
	        Circle c1 = new Circle();
	        Circle c2 = new Circle(5.0);
	        System.out.println("Circle area (default): " + c1.getArea());
	        System.out.println("Circle area (radius=5): " + c2.getArea());
	    }

}
