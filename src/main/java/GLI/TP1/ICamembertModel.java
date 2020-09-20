package GLI.TP1;

import java.util.ArrayList;

public interface ICamembertModel {
public int size();
public Double total();
public Double getValues(int i);
public String getTitle();
public void setTitle(String title);
public String getTitle(int i);
public String getDescription(int i);
public String getUnit();
public void addItem(Item i);
public ArrayList<Item> getItems();
public void removeItem(Item i);
}
