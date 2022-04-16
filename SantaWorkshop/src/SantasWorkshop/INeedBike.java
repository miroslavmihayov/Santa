package SantasWorkshop;

public class INeedBike implements Command {
	
	private Toys toys;

	public INeedBike(Toys toys) {
		this.toys=toys;
	}

	@Override
	public void execute() {
		this.toys.bikeType();

	}

}
