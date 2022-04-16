package SantasWorkshop;

public class Factory extends SantaFactory {

	@Override
	public SantaProduct createProduct(String productName) {
		if(productName == "Bike") {
			return new Bike();
		}
		if(productName == "Doll") {
			return new Doll();
		}
		System.out.println("Unknown toy!");
		return null;
	}

}
