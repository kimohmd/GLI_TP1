package GLI.TP1;

public class CamembertController implements ICamembertController{

	public Boolean selected=false;
	public int selectedPie;
	public ICamembertView view;
	
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
		return this.selected==true;
	}

	public void deSelect() {
		this.selected= false;
		
	}

	public void selectPie(int i) {
		this.selected = true;
		this.setSelectedPie(i);
		
	}

	public void nextPie() {
		this.selected = true;
		if(this.getSelectedPie() + 1 < this.view.getModel().size()) {
		this.setSelectedPie(this.getSelectedPie() +1);
		}
		
		
	}

	public void previousPie() {
		this.selected = true;
		if(this.getSelectedPie() - 1 >= 0) {
		this.setSelectedPie(this.getSelectedPie() -1);
		
		}
	}

	public ICamembertView getView() {
		return view;
	}

	public void setView(ICamembertView view) {
		this.view = view;
	}

}
