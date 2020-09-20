package GLI.TP1;

public interface ICamembertController {
public void setSelected(Boolean b);
public int getSelectedPie();
public void setSelectedPie(int p);
public Boolean isSelected();
public void deSelect();
public void selectPie(int i);
public void nextPie();
public void previousPie();
public ICamembertView getView();
public void setView(ICamembertView view);

}
