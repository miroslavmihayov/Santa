package SantasWorkshop;

public class SantasDwarf implements Dwarf {
	
	public String name;
	private Observable topic;

	public SantasDwarf(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.topic == null) {
			System.out.println("No command for toy!");
			return;
		}
		String lastTopic = this.topic.getUpdate();
		System.out.println(name+" : Order resieved - "+lastTopic);
	}

	@Override
	public void setTopic(Observable topic) {
		this.topic=topic;
		
	}
	

}
