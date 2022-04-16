package SantasWorkshop;

public abstract class SantaFactory {
	
	public abstract SantaProduct createProduct(String productName);
	
	public SantaProduct produceProduct(String productName) {
		SantaProduct product = createProduct(productName);
		product.prepare();
		return product;
	}
	

}
