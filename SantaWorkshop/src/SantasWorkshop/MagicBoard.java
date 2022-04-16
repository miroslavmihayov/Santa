package SantasWorkshop;

public class MagicBoard {
	
	private Command command;
	
	public Command getCommand() {
		return command;
	}
	
	public void setCommand(Command command) {
		this.command=command;
	}
	
	public void writeOnBoard() {
		if(this.command==null) {
			System.out.println("No toy order!");
			return;
		}
		this.command.execute();
	}
}
