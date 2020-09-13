package GLI.TP1;

import java.util.*;

public class AdapterModel{
	private ArrayList<Observer> observerViews; 
	
	public void notifyObservers() {
		
		for (Observer observer: observerViews) {
			observer.notify();
		}
		
	}

}
