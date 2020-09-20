package GLI.TP1;

public class Item {

	private String title;
	private String desciption;
	private Double value;
	
	public Item(String t, String d, Double v) {
		
		this.title = t;
		this.desciption = d;
		this.value = v;
	}
	
	public String getTitle() {
		return title;
	}
	public void setIntitule(String intitule) {
		this.title = intitule;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}

}



