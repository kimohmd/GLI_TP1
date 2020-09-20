package GLI.TP1;

import java.util.ArrayList;

public class CamembertModel implements ICamembertModel{

	private String title;
	private String unit;
	
	private ArrayList<Item> items;
	
	public CamembertModel (String t, String u) {
		this.title = t;
		this.unit = u;
		this.items = new ArrayList<Item>();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		items = items;
	}
	
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void addItem(Item i) {
	this.items.add(i);	
	}
	
	public void removeItem(Item i) {
		this.items.remove(i);	
		}
	
	public int size() {
	return this.items.size();
	}
	
	public Double total() {
		Double t=0.0;
		for(Item i : items) {
			t+=i.getValue();
		}
		return t;
		
	}
	
	public Double getValues(int i) {
		return this.items.get(i).getValue();
	}
	
	
	public String getTitle(int i) {
		return  this.items.get(i).getTitle();
	}
	
	public String getDescription(int i) {
		return  this.items.get(i).getDesciption();
	}
	
	
	
}
