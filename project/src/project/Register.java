package project;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import static project.LogIn2.errorMessage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicol
 */

public class Register extends javax.swing.JFrame {
    protected static String email = "";
    protected static String pswrd = "";
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String tokenId;
    private int gender=0;
    /**
     * Creates new form LogIn2
     */
    public Register() {
        initComponents();
        setGhostTexts();
        //confirmButtonEnabled();
        if (!email.equals("")){
            mailTextField.setText(email);
            PwrdText.setText(pswrd);
            mailTextField.setForeground(Color.black);
            PwrdText.setForeground(Color.black);
        }
        
    }
    /*private void confirmButtonEnabled(){
        if(mailTextField.getForeground().equals(Color.LIGHT_GRAY)){
            confirmButton.setEnabled(false);
            //confirmButton.getFont().equals(Color.BLACK);
        }
        else {
        confirmButton.setEnabled(true);
        }
    }*/
    private void setGhostTexts(){
        new GhostText(mailTextField, "example@mail.com ");
        new GhostText(PwrdText, "password123 ");
        new GhostText(confirmPwrdText, "password123");
        new GhostText(phoneText, "07 81 04 48 69  ");
        new GhostText(firstNameText, "James  ");
        new GhostText(lastNameText, "Smith  ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        mailLabel = new javax.swing.JLabel();
        mailTextField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        confPasswordLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        PwrdText = new javax.swing.JPasswordField();
        confirmPwrdText = new javax.swing.JPasswordField();
        phoneText = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        radioOther = new javax.swing.JRadioButton();
        confirmButton = new javax.swing.JButton();
        functionLabel = new javax.swing.JLabel();
        functionComboBox = new javax.swing.JComboBox<>();
        allEntriesLabel = new javax.swing.JLabel();
        passwordMatchLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mailLabel.setText("Email adress:");

        mailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTextFieldActionPerformed(evt);
            }
        });

        firstNameLabel.setText("First name:");

        firstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextActionPerformed(evt);
            }
        });

        lastNameLabel.setText("Last name:");

        passwordLabel.setText("Password:");

        confPasswordLabel.setText("Confirm Password:");

        phoneLabel.setText("Phone Number:");

        PwrdText.setToolTipText("");

        confirmPwrdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPwrdTextActionPerformed(evt);
            }
        });

        phoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextActionPerformed(evt);
            }
        });

        genderLabel.setText("Gender:");

        genderGroup.add(radioMale);
        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });

        genderGroup.add(radioFemale);
        radioFemale.setText("Female");
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });

        genderGroup.add(radioOther);
        radioOther.setText("Other");
        radioOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOtherActionPerformed(evt);
            }
        });

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        functionLabel.setText("Function:");

        functionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your function...", "BUYER", "SELLER" }));
        functionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                functionComboBoxActionPerformed(evt);
            }
        });

        allEntriesLabel.setForeground(new java.awt.Color(255, 0, 0));
        allEntriesLabel.setText("Please fill all entries.");

        passwordMatchLabel.setForeground(new java.awt.Color(255, 0, 0));
        passwordMatchLabel.setText("Passwords must match");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(allEntriesLabel)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(confPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(firstNameLabel)
                                .addComponent(lastNameLabel)
                                .addComponent(passwordLabel)
                                .addComponent(mailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(genderLabel)
                            .addComponent(functionLabel)
                            .addComponent(phoneLabel))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(functionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(passwordMatchLabel))
                                    .addComponent(mailTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(lastNameText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PwrdText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirmPwrdText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(radioMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radioFemale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioOther)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(39, 39, 39))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailLabel)
                    .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(PwrdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confPasswordLabel)
                    .addComponent(confirmPwrdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(radioMale)
                    .addComponent(radioFemale)
                    .addComponent(radioOther))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(functionLabel)
                    .addComponent(functionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordMatchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(allEntriesLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTextFieldActionPerformed
        // TODO add your handling code here:
       email = mailTextField.getText();
    }//GEN-LAST:event_mailTextFieldActionPerformed

    private void phoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextActionPerformed
        phonenumber=phoneText.getText();
    }//GEN-LAST:event_phoneTextActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        gender = 1;
    }//GEN-LAST:event_radioMaleActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        gender = 2;
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void confirmPwrdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPwrdTextActionPerformed
        
    }//GEN-LAST:event_confirmPwrdTextActionPerformed

    private void radioOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOtherActionPerformed
        gender = 3;
    }//GEN-LAST:event_radioOtherActionPerformed

    private void firstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextActionPerformed
    }//GEN-LAST:event_firstNameTextActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        firstname = firstNameText.getText();
        lastname = lastNameText.getText();
        email = mailTextField.getText();
        phonenumber=phoneText.getText();
        pswrd = new String(PwrdText.getPassword());
        tokenId = (String)functionComboBox.getSelectedItem();
        String confirm_pswrd = new String(confirmPwrdText.getPassword());
        if (entriesAreDefault()){
            allEntriesLabel.setVisible(true);
        }
        else{
            allEntriesLabel.setVisible(false);
        }
        if ((!pswrd.equals(confirm_pswrd))&&(!confirm_pswrd.equals("password123"))){
            passwordMatchLabel.setVisible(true);
            //confirmPwrdText.setBorder(BorderFactory.createLineBorder(Color.red));
        }
        else{
            passwordMatchLabel.setVisible(false);
            //confirmPwrdText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
            
        }
        if(!(passwordMatchLabel.isVisible()||allEntriesLabel.isVisible())){
            BDD.register(tokenId, firstname, lastname, phonenumber, email, pswrd, gender);
            User user = BDD.login(email, pswrd);
            if (user == null){
            // erreur de connexion
                System.out.println("ERROR");
                //errorMessage.setVisible(true);
            }else{
                // connexion success
                dispose();
                setVisible(false);
                MainWindow.main(user);
            }
        }
        
    }//GEN-LAST:event_confirmButtonActionPerformed
    private boolean entriesAreDefault(){
        if (firstname.equals("James  ")||lastname.equals("Smith  ")||phonenumber.equals("07 81 04 48 69  ")
                ||pswrd.equals("password123 ")||email.equals("example@mail.com")||gender==0 ||tokenId.equals("Select your fonction...")){
            return true;
        }
        return false;
    }
    private void functionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_functionComboBoxActionPerformed
        if (functionComboBox.getSelectedIndex()!=0){
            tokenId = (String)functionComboBox.getSelectedItem();
        }
    }//GEN-LAST:event_functionComboBoxActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
        setVisible(false);
        LogIn2.main(null);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                if (args == null){
                    new Register().setVisible(true);
                    allEntriesLabel.setVisible(false);
                    passwordMatchLabel.setVisible(false);
                }
                else{
                    pswrd = args[0];
                    email = args[1];
                    new Register().setVisible(true);
                    allEntriesLabel.setVisible(false);
                    passwordMatchLabel.setVisible(false);
                }
                
            }
        });
    }
    
    

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PwrdText;
    private static javax.swing.JLabel allEntriesLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel confPasswordLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPasswordField confirmPwrdText;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JComboBox<String> functionComboBox;
    private javax.swing.JLabel functionLabel;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JTextField mailTextField;
    private javax.swing.JLabel passwordLabel;
    private static javax.swing.JLabel passwordMatchLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioOther;
    // End of variables declaration//GEN-END:variables

    public static class GhostText implements FocusListener, DocumentListener, PropertyChangeListener {
        private final JTextField textfield;
        private boolean isEmpty;
        private Color ghostColor;
        private Color foregroundColor;
        private final String ghostText;

        protected GhostText(final JTextField textfield, String ghostText) {
            super();
            this.textfield = textfield;
            this.ghostText = ghostText;
            this.ghostColor = Color.LIGHT_GRAY;
            textfield.addFocusListener(this);
            registerListeners();
            updateState();
            if (!this.textfield.hasFocus()) {
                focusLost(null);
            }
        }

        public void delete() {
            unregisterListeners();
            textfield.removeFocusListener(this);
        }

        private void registerListeners() {
            textfield.getDocument().addDocumentListener(this);
            textfield.addPropertyChangeListener("foreground", this);
        }

        private void unregisterListeners() {
            textfield.getDocument().removeDocumentListener(this);
            textfield.removePropertyChangeListener("foreground", this);
        }

        public Color getGhostColor() {
            return ghostColor;
        }

        public void setGhostColor(Color ghostColor) {
            this.ghostColor = ghostColor;
        }

        private void updateState() {
            isEmpty = textfield.getText().length() == 0;
            foregroundColor = textfield.getForeground();
        }

        @Override
        public void focusGained(FocusEvent e) {
            if (isEmpty) {
                unregisterListeners();
                try {
                    textfield.setText("");
                    textfield.setForeground(foregroundColor);
                } finally {
                    registerListeners();
                }
            }

        }

        @Override
        public void focusLost(FocusEvent e) {
            if (isEmpty) {
                unregisterListeners();
                try {
                    textfield.setText(ghostText);
                    textfield.setForeground(ghostColor);
                } finally {
                    registerListeners();
                }
            }
        }

        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            updateState();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateState();
        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            updateState();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateState();
        }
        
    }
}
