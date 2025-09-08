package Encapsulation_Problems;
public class Mobile_Phone_Details {
	String brand;
	String model;
	double price;
	Mobile_Phone_Details(String brand,String model,double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public void diplayMobile() {
		System.out.println("Brand of mobile: "+brand);
		System.out.println("Model of mobile: "+model);
		System.out.println("Price of mobile: "+price);
		System.out.println("------------------------------");
	}
	public static void main(String[] args) {
	Mobile_Phone_Details mobile1=new Mobile_Phone_Details("VIVO","VIVO V29" , 15999);
	Mobile_Phone_Details mobile2=new Mobile_Phone_Details("ONE PLUS","ONE PLUS nord4",39999);
	Mobile_Phone_Details mobile3=new Mobile_Phone_Details("APPLE","iphone pro16",79999);
	mobile1.diplayMobile();
	mobile2.diplayMobile();
	mobile3.diplayMobile();
	}
}

