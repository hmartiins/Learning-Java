package classAndMethods;

public class Product {

	String name;
	double price;
	double discount;

	Product() {}

	Product(String initialName, double initialPrice, double initialDiscount) {
		name = initialName;
		price = initialPrice;
		discount = initialDiscount;
	}
	
	double priceWithDiscount() {
		return price * (1 - discount);
	}
	
	double priceWithDiscount(double discountOfManager) {
		return price * (1 - discount + discountOfManager);
	}
	
}
