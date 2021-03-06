package classAndMethods;

public class ProductTest {

	public static void main(String[] args) {
		// instantiating using type inference
		// instantiating the class passing parameters to the constructor
		var p1 = new Product("Notebook", 3500.99, 0.50);
		
		// instantiating using the reserved word of the class
		Product p2 = new Product();
		
		p2.name = "Keyboard 60%";
		p2.price = 699.99;
		p2.discount = 0.25;

		double finalPriceP1 = p1.priceWithDiscount();
		double finalPriceP2 = p2.priceWithDiscount(0.2);

		System.out.printf("Pre?o total dos produtos: R$%.2f", (finalPriceP1 + finalPriceP2));
	}
	
}
