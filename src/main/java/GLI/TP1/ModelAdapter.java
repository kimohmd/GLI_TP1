package GLI.TP1;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ModelAdapter extends Observable{

	public ICamembertModel model;
	public List<Observer> observers = new ArrayList<Observer>();
	
	ModelAdapter (ICamembertModel m) {
		this.model = m;
	}

	public ICamembertModel getModel() {
		return model;
	}

	public void setModel(ICamembertModel model) {
		this.model = model;
	}
	
	@SuppressWarnings("deprecation")
	public void addObserver(Observer o) {
		this.observers.add(o);
		
	}
	
	@SuppressWarnings("deprecation")
	public void deleteObserver(Observer o) {
		this.observers.remove(o);
	}
	
	@SuppressWarnings("deprecation")
	public void addItem(Item i ) {
		this.model.addItem(i);
		setChanged();
        notifyObservers(i);
	}
	
	@SuppressWarnings("deprecation")
	public void removeItem(Item i ) {
		this.model.removeItem(i);
		setChanged();
        notifyObservers(i);
	}
}
