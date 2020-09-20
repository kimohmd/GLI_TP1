package GLI.TP1;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Observer;

import javax.swing.JComponent;

public interface ICamembertView extends MouseListener,
MouseMotionListener, Observer{
	public void setController(ICamembertController c);
	public ICamembertModel getModel();
}
