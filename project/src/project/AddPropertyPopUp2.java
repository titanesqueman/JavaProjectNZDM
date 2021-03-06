/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class AddPropertyPopUp2 extends javax.swing.JFrame {
    private Property propertyCreated = new Property();
    private String price;
    private String area;
    Property selectedProp;
    private int edit = 0;
    /**
     * Creates new form addPropertyPopUp
     */
    public AddPropertyPopUp2() {
        initComponents();
        getRootPane().setDefaultButton(confirmButton);
    }
    public AddPropertyPopUp2(Property selectedProp) {
        initComponents();
        getRootPane().setDefaultButton(confirmButton);
        this.selectedProp = selectedProp;
        titleText.setText(selectedProp.title);
        areaText.setText(Double.toString(selectedProp.area));
        addressText.setText(selectedProp.address);
        priceText.setText(Integer.toString(selectedProp.price));
        descriptionText.setText(selectedProp.description);
        edit=1;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        titleText = new javax.swing.JTextField();
        areaLabel = new javax.swing.JLabel();
        areaText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        metersqLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        priceText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionText = new javax.swing.JTextPane();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        allEntriesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setText("Title:");

        titleText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleTextMouseClicked(evt);
            }
        });

        areaLabel.setText("Area:");

        areaText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaTextMouseClicked(evt);
            }
        });

        addressText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressTextMouseClicked(evt);
            }
        });

        addressLabel.setText("Postal code + City:");

        priceLabel.setText("Price:");

        metersqLabel.setText("m??");

        descriptionLabel.setText("Description :");

        priceText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priceTextMouseClicked(evt);
            }
        });

        descriptionText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descriptionTextMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(descriptionText);

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        allEntriesLabel.setForeground(new java.awt.Color(255, 0, 0));
        allEntriesLabel.setText("Please fill all entries.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(allEntriesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleLabel)
                                    .addComponent(areaLabel)
                                    .addComponent(priceLabel)
                                    .addComponent(addressLabel)
                                    .addComponent(descriptionLabel))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleText)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(priceText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(areaText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(metersqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1))))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaLabel)
                    .addComponent(areaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(metersqLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(descriptionLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(allEntriesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        
        price = priceText.getText();
        area = areaText.getText();
        propertyCreated.setTitle(titleText.getText());
        propertyCreated.setAddress(addressText.getText());
        propertyCreated.setDescription(descriptionText.getText());
        
        if (entriesAreDefault()){
            allEntriesLabel.setVisible(true);
            confirmButton.setEnabled(false);
        }
        else{
                propertyCreated.setArea(Double.parseDouble(area));
                propertyCreated.setPrice(Integer.parseInt(price));
                if(edit==0){
                    BDD.addProperty(MainWindow.getUser().getUserId(),propertyCreated.title,
                        propertyCreated.area, propertyCreated.address, propertyCreated.price, propertyCreated.description);

                    String message = "Thank you for your adding "+propertyCreated.title+"!";
                    JOptionPane.showMessageDialog(null, message);
                }
                else{
                    propertyCreated.setPropertyId(selectedProp.getPropertyId());
                    BDD.updateProperty(selectedProp.propertyId,propertyCreated.title,
                        propertyCreated.area, propertyCreated.address, propertyCreated.price, propertyCreated.description);

                    String message = "You have edited "+propertyCreated.title+" successfully.";
                    JOptionPane.showMessageDialog(null, message);
                    
                }
                //MainWindow.changePanel(new MenuPanel(MainWindow.getUser()));.
                dispose();
                
                MainWindow.changePanel(new PropertyPanel(propertyCreated));
                
        }
        
        
    }//GEN-LAST:event_confirmButtonActionPerformed

    private boolean entriesAreDefault(){
        if (propertyCreated.address.equals("")|| price.equals("")|| propertyCreated.title.equals("")|| 
                titleText.getText().equals("")||  area.equals("")|| propertyCreated.description.equals("")){
            return true;
        }
        return false;
    }
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void titleTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleTextMouseClicked
        allEntriesLabel.setVisible(false);
        confirmButton.setEnabled(true);
    }//GEN-LAST:event_titleTextMouseClicked

    private void areaTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaTextMouseClicked
        allEntriesLabel.setVisible(false);
        confirmButton.setEnabled(true);
    }//GEN-LAST:event_areaTextMouseClicked

    private void addressTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressTextMouseClicked
        allEntriesLabel.setVisible(false);
        confirmButton.setEnabled(true);
    }//GEN-LAST:event_addressTextMouseClicked

    private void priceTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceTextMouseClicked
        allEntriesLabel.setVisible(false);
        confirmButton.setEnabled(true);
    }//GEN-LAST:event_priceTextMouseClicked

    private void descriptionTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descriptionTextMouseClicked
        allEntriesLabel.setVisible(false);
        confirmButton.setEnabled(true);
    }//GEN-LAST:event_descriptionTextMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(AddPropertyPopUp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPropertyPopUp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPropertyPopUp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPropertyPopUp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPropertyPopUp2().setVisible(true);
                allEntriesLabel.setVisible(false);
            }
        });
        
    }
    public static void main(Property selectedProp) {
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
            java.util.logging.Logger.getLogger(AddPropertyPopUp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPropertyPopUp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPropertyPopUp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPropertyPopUp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new AddPropertyPopUp2(selectedProp).setVisible(true);
            allEntriesLabel.setVisible(false);
            }
        });
        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private static javax.swing.JLabel allEntriesLabel;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JTextField areaText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextPane descriptionText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel metersqLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceText;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleText;
    // End of variables declaration//GEN-END:variables
}
