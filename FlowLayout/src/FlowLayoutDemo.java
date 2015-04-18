import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Elohe Yonas
 * CSC201
 *
 */

public class FlowLayoutDemo extends JFrame {
	/**
	 * initializing the variables for the Gui
	 */
private JButton button1, button2, button3, button4, button5, button6;
private JPanel panel1, panel2;
private JFrame frame1;

public FlowLayoutDemo(){
	/**
	 * creating the properties of class FlowLayoutDemo
	 */
	
	button1 = new JButton("1");
	button2 = new JButton("2");
	button3 = new JButton("3");
	button4 = new JButton("4");
	button5 = new JButton("5");
	button6 = new JButton("6");
	panel1 = new JPanel();
	panel2 = new JPanel();
	setLayout(new FlowLayout());
	/**
	 * add the panels onto the frame and add the buttons to the panels
	 */
 
	add(panel1);
	add(panel2);
	panel1.add(button1);
	panel1.add(button2);
	panel1.add(button3);
	panel2.add(button4);
	panel2.add(button5);
	panel2.add(button6);
	/**
	 * set the title
	 */
	setTitle("FlowLayoutDemo");
	
}

}
