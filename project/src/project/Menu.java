/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author nicol
 */
public class Menu extends JFrame {
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 250;
    private JLabel message ;
    private JTextField nameField;
    private JButton okButton;
    //private JPanel panel;
    //constructor

    public Menu() {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Essai");
        message = new JLabel("what's your name ?");
        nameField = new JTextField(10);
        okButton = new JButton("ok");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = buildPanel();
        add(panel);
        panel.setBackground(Color.lightGray);
        setVisible(true);
    }

private JPanel buildPanel(){
      // Create a label to display instructions.
      message = new JLabel("Enter a name " +
                                "in letters");

      // Create a text field 10 characters wide.
      nameField = new JTextField(10);

      // Create a button with the caption "ok".
      okButton = new JButton("okkay");;

      // Add an action listener to the button.
      okButton.addActionListener(new OkButtonListener());

      // Create a JPanel object and let the panel
      // field reference it.
      JPanel panel = new JPanel();

      // Add the label, text field, and button
      // components to the panel.
      panel.add(message);
      panel.add(nameField);
      panel.add(okButton);
      okButton.setBackground(Color.red);
      okButton.setForeground(Color.yellow);
      
      
      ButtonGroup group = new ButtonGroup();
      JRadioButton radio1 = new JRadioButton("New Customer",true);
      JRadioButton radio2 = new JRadioButton("Returning Customer");
      group.add(radio1);
      group.add(radio2);
      
      panel.add(radio1);
      panel.add(radio2);
      
      return panel;
   }

private class OkButtonListener implements ActionListener
   {
      /**
         The actionPerformed method executes when the user
         clicks on the Calculate button.
         @param e The event object.
      */

      @Override
      public void actionPerformed(ActionEvent e)
      {
        
         String input;  // To hold the user's input
         
         input = nameField.getText();

         // Display the result.
         JOptionPane.showMessageDialog(null, "your name is"
                  +input);
      }
   }
}