package SantasWorkshop;

import java.util.ArrayList;
import java.util.List;

public class Santa implements Observable {
	
	public List<Dwarf> dwarfs;
	private String topic;

	public Santa() {
		this.dwarfs = new ArrayList<>();
	}

	public void subscribe(Dwarf dwarf) {
		this.dwarfs.add(dwarf);
		dwarf.setTopic(this);

	}

	@Override
	public void unsubscribe(Dwarf dwarf) {
		this.dwarfs.remove(dwarf);
		dwarf.setTopic(null);
	}

	@Override
	public void orderToDwarfs() {
		for(Dwarf dwarf: this.dwarfs) {
			dwarf.update();
		}

	}

	@Override
	public String getUpdate() {
		return this.topic;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		this.orderToDwarfs();
	}

}
