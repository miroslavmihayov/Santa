package SantasWorkshop;

public abstract class SantaProduct {
	private String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public abstract void prepare();
}
