package classAndMethods;

public class Product {

	String name;
	double price;
	double discount;
	
	double priceWithDiscount() {
		return price * (1 - discount);
	}
	
	double priceWithDiscount(double discountOfManager) {
		return price * (1 - discount + discountOfManager);
	}
	
}
