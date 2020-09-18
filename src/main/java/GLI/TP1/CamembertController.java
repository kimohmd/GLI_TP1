package GLI.TP1;

public class CamembertController implements ICamembertController{

	public Boolean selected;
	public int selectedPie;
	
	public int getSelectedPie() {
		return selectedPie;
	}

	public void setSelectedPie(int selectedPie) {
		this.selectedPie = selectedPie;
	}

	public Boolean getSelected() {
		return selected;
	}

	public void setSelected(Boolean b) {
		this.selected = b;
		
	}
	
	public Boolean isSelected() {
		return this.selected;
	}

	public void deSelect() {
		this.selected= false;
		
	}

	public void selectPie(int i) {
		this.setSelectedPie(i);
		
	}

	public int nextPie() {
		return this.getSelectedPie() +1;
		
	}

	public int previousPie() {
		return this.getSelectedPie() -1;

	}

}
