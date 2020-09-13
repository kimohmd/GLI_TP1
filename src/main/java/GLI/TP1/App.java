package GLI.TP1;

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
    		
    		// Create an instance of the model
            // Model model;
            
            // Maybe put some data in the model
    		int oldFirst = 0;
    		int oldLast = 0;

    		// Create the controller and the view and link all together
    				
    		
    		// display layout
    		GridLayout layout = new GridLayout(1, 2);

    		window.getContentPane().add(controller.getView());
    		
    		window.setLayout(layout);
    		window.pack();
    		window.setVisible(true);
    		// window.pack();
    	
    }
}
