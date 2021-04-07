/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Font;
import static project.Tokeniser.Token.BUYER;
import static project.Tokeniser.Token.EMPLOYEE;
import static project.Tokeniser.Token.SELLER;

/**
 *
 * @author Drazic
 */
public class PropertyPanel extends javax.swing.JPanel {
    Property property;
    private int month=0;
    private int day=0;
    private int year=0;
    private int hour=0;
   
    /**
     * Creates new form propertyPanel
     */
    public PropertyPanel() {
        initComponents();
        
    }
    
    public PropertyPanel(Property property) {
        this.property = property;
        initComponents();
        if (MainWindow.getUser().token==BUYER){
            jPanel1.add(new BookViewingPanel(property));
            desciptionText.setText(property.description);
            desciptionText.setLineWrap(true);
            desciptionText.setWrapStyleWord(true);
        }
        
        loaddata();
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
        addressLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        areaLabel = new javax.swing.JLabel();
        backButton1 = new project.BackButton2();
        favCheckBox = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desciptionText = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        setSellButton = new javax.swing.JButton();

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titleLabel.setText("titleLabel");

        addressLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        addressLabel.setText("address");

        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceLabel.setText("price");

        areaLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        areaLabel.setText("area");

        favCheckBox.setText("add to Favorites");
        favCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favCheckBoxActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 0));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        desciptionText.setEditable(false);
        desciptionText.setBackground(new java.awt.Color(240, 240, 240));
        desciptionText.setColumns(20);
        desciptionText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        desciptionText.setRows(5);
        jScrollPane1.setViewportView(desciptionText);

        jButton1.setText("Back to properties");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setSellButton.setText("set Selled");
        setSellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setSellButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(backButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(priceLabel)
                            .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(areaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(favCheckBox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(setSellButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addComponent(backButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaLabel)
                    .addComponent(favCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(setSellButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void favCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favCheckBoxActionPerformed
        // TODO add your handling code here:
        if (favCheckBox.isSelected()){
            BDD.setFav(property.propertyId, MainWindow.getUser().userId);
        }else{
            BDD.deleteFav(property.propertyId, MainWindow.getUser().userId);
        }
    }//GEN-LAST:event_favCheckBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainWindow.changePanel(new BrowsePropertiesPanel());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setSellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setSellButtonActionPerformed
        // TODO add your handling code here:
        DeleteFramePopUp.main(property);
    }//GEN-LAST:event_setSellButtonActionPerformed
    
    private void loaddata() {
        
        if (MainWindow.getUser().token == SELLER || MainWindow.getUser().token == EMPLOYEE){
            favCheckBox.setVisible(false);
        }else{
            if (BDD.isFav(property.getPropertyId(), MainWindow.getUser().getUserId())){
            favCheckBox.setSelected(true);
            }else{
                favCheckBox.setSelected(false);
            }
        }
        
        setSellButton.setVisible(false);
        if (MainWindow.getUser().getToken() == EMPLOYEE || BDD.canSetSellProperty(MainWindow.getUser().getUserId(), property.getPropertyId())){
            setSellButton.setVisible(true);
        }
        
        titleLabel.setText(property.getTitle());
        addressLabel.setText(property.getAddress());
        areaLabel.setText("Area : "+property.getArea()+"m²");
        priceLabel.setText("Price : "+property.getPrice()+"€");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel areaLabel;
    private project.BackButton2 backButton1;
    private javax.swing.JTextArea desciptionText;
    private javax.swing.JCheckBox favCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton setSellButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
