package GLI.TP1;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App 
{
    	public static void main(String[] a) {
    		JFrame window = new JFrame();
    		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		window.setBounds(30, 30, 400, 400);
    		window.setMinimumSize(new Dimension(750, 600));
    		// Create an instance of the model
             ICamembertModel model= new CamembertModel("Budget","€");
            
            // Maybe put some data in the model
    		int oldFirst = 0;
    		int oldLast = 0;

    		// Create the controller and the view and link all together
    		ICamembertController controller = new CamembertController();
    		ModelAdapter mAdapter = new ModelAdapter(model);
    		mAdapter.addItem(new Item("loyer","loyer mensuel", 450.0));
    		mAdapter.addItem(new Item("cinéma","un peu de chill", 16.0));
    		mAdapter.addItem(new Item("mobile","vive SFR", 11.99));
    		mAdapter.addItem(new Item("transport","achète-toi une voiture", 26.99));
    		
    		ICamembertView view  = new CamembertView(mAdapter);
    		view.setController(controller);
    		controller.setView(view);
    		
    		// display layout
    		GridLayout layout = new GridLayout(1, 2);

    		window.getContentPane().add((Component) controller.getView());
    		
    		window.setLayout(layout);
    		window.pack();
    		
    		window.setVisible(true);
    		// window.pack();
    	
    }
}
