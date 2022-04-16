package SantasWorkshop;

public class Toys {
	private boolean toyType;
	
	public void dollType() {
		System.out.println("Doll delivered!");
		this.toyType = true;
	}
	
	public void bikeType() {
		System.out.println("Bike delivered!");
		this.toyType = false;
	}
}
