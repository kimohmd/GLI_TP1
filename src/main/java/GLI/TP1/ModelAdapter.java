package GLI.TP1;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ModelAdapter extends Observable{

	public ICamembertModel model;
	public List<Observer> observers;
	
	ModelAdapter (ICamembertModel m) {
		this.model = m;
	}

	public ICamembertModel getModel() {
		return model;
	}

	public void setModel(ICamembertModel model) {
		this.model = model;
	}
	
	public void addObserver(Observer o) {
		this.observers.add(o);
		
	}
	
	public void deleteObserver(Observer o) {
		this.observers.remove(o);
	}
	
	public void addItem(Item i ) {
		this.model.addItem(i);
		setChanged();
        notifyObservers(i);
	}
	
	public void removeItem(Item i ) {
		this.model.removeItem(i);
		setChanged();
        notifyObservers(i);
	}
}
