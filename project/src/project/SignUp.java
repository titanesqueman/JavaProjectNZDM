/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author nicol
 */
public class SignUp extends JFrame {
    JFrame signUpFrame;
    final int WINDOW_WIDTH = 500;
    final int WINDOW_HEIGHT = 400;
    private JPanel panel;
    private JLabel message ;
    private JTextField nameField;
    private JButton okButton;
    private JRadioButton newcus;
    private JRadioButton returcus;
    //private JPanel panel;
    //constructor

    public SignUp() {
        signUpFrame = new JFrame();
        signUpFrame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Register");
        message = new JLabel();
        nameField = new JTextField(10);
        okButton = new JButton();
        signUpFrame.setDefaultCloseOperation(signUpFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        
        signUpFrame.add(panel);
        panel.setBackground(Color.lightGray);
        panel.setLayout(new BorderLayout(1,10));
        signUpFrame.setVisible(true);
    }

    private void buildPanel(){
       // Create a JPanel object and let the panel
      // field reference it.
      
      // Create the label, text field, and radio buttons.
      message = new JLabel("Enter your mail " +"");

      // Create a text field 10 characters wide.
      nameField = new JTextField(10);

      // Create a button with the caption "sign in".
      okButton = new JButton("sign In");

      // Add an action listener to the button.

      
      // Add the label, text field, and button
      // components to the panel.
      
      okButton.setBackground(Color.red);
      okButton.setForeground(Color.yellow);
      
      
      // Add action listeners to the radio buttons.
      
      panel = new JPanel();
      
      panel.add(message);
      panel.add(nameField);
      panel.add(okButton);
      
      
   }


}