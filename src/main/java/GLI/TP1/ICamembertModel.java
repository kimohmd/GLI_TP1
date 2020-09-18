package GLI.TP1;

public interface ICamembertModel {
public int size();
public Double total();
public Double getValues(int i);
public String getTitle();
public String getTitle(int i);
public String getDescription(int i);
public String getUnit();
public void addItem(Item i);
public void removeItem(Item i);
}
