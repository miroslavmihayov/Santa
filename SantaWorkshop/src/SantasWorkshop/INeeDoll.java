package SantasWorkshop;

public class INeeDoll implements Command {
	
	private Toys toys;

	public INeeDoll(Toys toys) {
		this.toys=toys;
	}

	@Override
	public void execute() {
		this.toys.dollType();

	}

}
