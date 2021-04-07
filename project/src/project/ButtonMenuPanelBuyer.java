/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import static project.Tokeniser.Token.*;

/**
 *
 * @author Drazic
 */
public class ButtonMenuPanelBuyer extends javax.swing.JPanel {

    /**
     * Creates new form MenuPanel
     */
    public ButtonMenuPanelBuyer() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        browsePropertiesButton = new javax.swing.JButton();
        browseFavButton = new javax.swing.JButton();
        signoutButton = new javax.swing.JButton();
        browseMyViewing = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(2, 2));

        browsePropertiesButton.setText("Browse properties");
        browsePropertiesButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        browsePropertiesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsePropertiesButtonActionPerformed(evt);
            }
        });
        add(browsePropertiesButton);

        browseFavButton.setText("Browse Fav");
        browseFavButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        browseFavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseFavButtonActionPerformed(evt);
            }
        });
        add(browseFavButton);

        signoutButton.setText("Sign out");
        signoutButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        signoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutButtonActionPerformed(evt);
            }
        });
        add(signoutButton);

        browseMyViewing.setText("Browse my viewing");
        browseMyViewing.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        browseMyViewing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseMyViewingActionPerformed(evt);
            }
        });
        add(browseMyViewing);
    }// </editor-fold>//GEN-END:initComponents

    private void browsePropertiesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsePropertiesButtonActionPerformed
        // TODO add your handling code here:
        MainWindow.changePanel(new BrowsePropertiesPanel());
    }//GEN-LAST:event_browsePropertiesButtonActionPerformed

    private void browseFavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseFavButtonActionPerformed
        // TODO add your handling code here:
        MainWindow.changePanel(new BrowseFavPropertiesPanel());
    }//GEN-LAST:event_browseFavButtonActionPerformed

    private void signoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutButtonActionPerformed
        MainWindow.closeWindow();
        LogIn2.main(null);

    }//GEN-LAST:event_signoutButtonActionPerformed

    private void browseMyViewingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseMyViewingActionPerformed
        // TODO add your handling code here:
        MainWindow.changePanel(new ViewingPanel());
    }//GEN-LAST:event_browseMyViewingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseFavButton;
    private javax.swing.JButton browseMyViewing;
    public javax.swing.JButton browsePropertiesButton;
    private javax.swing.JButton signoutButton;
    // End of variables declaration//GEN-END:variables


}
