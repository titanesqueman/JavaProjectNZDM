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
public class LogIn extends JFrame {
    JFrame frame;
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 150;
    private JPanel panel;
    private JLabel message ;
    private JTextField nameField;
    private JButton okButton;
    private JRadioButton newcus;
    private JRadioButton returcus;
    //private JPanel panel;
    //constructor

    public LogIn() {
        frame = new JFrame();
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Log In");
        message = new JLabel();
        nameField = new JTextField(10);
        okButton = new JButton();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        buildPanel();
        
        frame.add(panel);
        panel.setBackground(Color.lightGray);
        frame.setVisible(true);
    }

    private void buildPanel(){
       // Create a JPanel object and let the panel
      // field reference it.
      
      // Create the label, text field, and radio buttons.
      message = new JLabel("Enter your mail " +"");

      // Create a text field 10 characters wide.
      nameField = new JTextField(10);

      // Create a button with the caption "sign in".
      okButton = new JButton("Sign In");

      // Add an action listener to the button.
      okButton.addActionListener(new OkButtonListener());

      
      // Add the label, text field, and button
      // components to the panel.
      
      okButton.setBackground(Color.red);
      okButton.setForeground(Color.yellow);
      
      
      newcus = new JRadioButton("New Customer");
      returcus = new JRadioButton("Returning Customer",true);
      
       // Group the radio buttons.
      ButtonGroup group = new ButtonGroup();
      group.add(newcus);
      group.add(returcus);
      // Add action listeners to the radio buttons.
      newcus.addActionListener(new RadioButtonListener());
      returcus.addActionListener(new RadioButtonListener());
      
      panel = new JPanel();
      panel.add(message);
      panel.add(nameField);
      panel.add(okButton);
      
      panel.add(newcus);
      panel.add(returcus);
      
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
         
         // closes the login menu
         frame.dispose();
         frame.setVisible(false);
         
         // Display the main menu
         if (okButton.getText() == "Sign In"){
            //Menu men = new Menu();
         }
         else if (okButton.getText() == "Sign Up"){
             SignUp register = new SignUp();
         }
      }
   }


private class RadioButtonListener implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
         // Determine which radio button was clicked.
         if (e.getSource() == newcus)
         {
            okButton.setText("Sign Up");
            okButton.setEnabled(true);
         }
         else if (e.getSource() == returcus)
         {
            // Convert to feet.
            okButton.setText("Sign In");
         }
         // Display the conversion.
      }
   }
}