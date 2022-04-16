package SantasWorkshop;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		SantaFactory Factory = new Factory();
		
		Toys toys = new Toys();
		
		MagicBoard board = new MagicBoard();
		
		Santa santa = new Santa();
		
		Dwarf dwarf1 = new SantasDwarf("Dwarf1");
		Dwarf dwarf2 = new SantasDwarf("Dwarf2");
		Dwarf dwarf3 = new SantasDwarf("Dwarf3");
		
		
		santa.subscribe(dwarf1);
		santa.subscribe(dwarf2);
		santa.subscribe(dwarf3);
		
		//Santa orders dolls
		String santaWish;
		santaWish="I want Doll!";
		santa.setTopic(santaWish);
		
		if(santaWish.equals("I want Doll!")) {
			for(int i=0;i<santa.dwarfs.size();i++) {
				System.out.println("");
				
				SantaProduct doll = Factory.produceProduct("Doll");
				Command dollCommand = new INeeDoll(toys);
				board.setCommand(dollCommand);
				board.writeOnBoard();
			}	
		}
		System.out.println("");
		
		//Santa orders bikes
		santaWish="I want Bike!";
		santa.setTopic(santaWish);
		
		if(santaWish.equals("I want Bike!")) {
			for(int i=0;i<santa.dwarfs.size();i++) {
				System.out.println("");
				SantaProduct bike = Factory.produceProduct("Bike");
				Command bikeCommand = new INeedBike(toys);
				board.setCommand(bikeCommand);
				board.writeOnBoard();
			}	
		}

	}

}
