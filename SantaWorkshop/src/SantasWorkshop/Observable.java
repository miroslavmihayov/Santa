package SantasWorkshop;

public interface Observable {
	
	void subscribe(Dwarf dwarf);
	void unsubscribe(Dwarf dwarf);
	
	void orderToDwarfs();
	String getUpdate();

}
