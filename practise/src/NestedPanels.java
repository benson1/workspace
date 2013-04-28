
// ************************************************************
// NestedPanels.java Author: Lewis/Loftus
//
// Demonstrates a basic component hierarchy.
// ************************************************************
import java.awt.*;
import javax.swing.*;

public class NestedPanels
{

// --------------------------------------------------------
// Presents two colored panels nested within a third.
// --------------------------------------------------------
public static <B> void main (String[] args)
{

JFrame frame = new JFrame ("Nested Panels");
frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

// Set up first subpanel
JPanel subPanel1 = new JPanel(); subPanel1.setPreferredSize (new Dimension(100, 75)); subPanel1.setBackground (Color.green);
JLabel label1 = new JLabel ("One");
subPanel1.add (label1);

// Set up second subpanel
JPanel subPanel2 = new JPanel();
subPanel2.setPreferredSize (new Dimension(100, 75));
subPanel2.setBackground (Color.red);
JLabel label2 = new JLabel ("Two");
subPanel2.add (label2);

//Set up third subpanel
JPanel subPanel3 = new JPanel();
subPanel3.setPreferredSize (new Dimension(100, 75));
subPanel3.setBackground (Color.yellow);
JLabel label3 = new JLabel ("Three");
subPanel3.add (label3);

//Set up fourth subpanel
JPanel subPanel4 = new JPanel();
subPanel4.setPreferredSize (new Dimension(100, 75));
subPanel4.setBackground (Color.white);
JLabel label4 = new JLabel ("Four");
subPanel4.add (label4);

//Set up fifth subpanel
JPanel subPanel5 = new JPanel();
subPanel5.setPreferredSize (new Dimension(100, 75));
subPanel5.setBackground (Color.black);
JLabel label5 = new JLabel ("Fifth");
subPanel5.add (label5);

//Set up sixth subpanel
JPanel subPanel6 = new JPanel();
subPanel6.setPreferredSize (new Dimension(100, 75));
subPanel6.setBackground (Color.cyan);
JLabel label6 = new JLabel ("sixth");
subPanel6.add (label6);

//Set up seventh subpanel
JPanel subPanel7 = new JPanel();
subPanel7.setPreferredSize (new Dimension(100, 75));
subPanel7.setBackground (Color.orange);
JLabel label7 = new JLabel ("seventh");
subPanel7.add (label7);

//Set up eighth subpanel
JPanel subPanel8 = new JPanel();
subPanel8.setPreferredSize (new Dimension(100, 75));
subPanel8.setBackground (Color.pink);
JLabel label8 = new JLabel ("eighth");
subPanel8.add (label8);

// Set up primary panel
JPanel primary = new JPanel();
primary.setBackground (Color.blue);
primary.add (subPanel1);
primary.add (subPanel2);
primary.add (subPanel3);
primary.add (subPanel4);
primary.add (subPanel5);
primary.add (subPanel6);
primary.add (subPanel7);
primary.add (subPanel8);

frame.getContentPane().add(primary); frame. pack () ; frame.setVisible(true);
}
}
