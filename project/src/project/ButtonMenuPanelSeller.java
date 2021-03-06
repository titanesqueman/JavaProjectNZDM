/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Drazic
 */
public class ButtonMenuPanelSeller extends javax.swing.JPanel {

    /**
     * Creates new form MenuPanel
     */
    public ButtonMenuPanelSeller() {
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
        addPropertyButton = new javax.swing.JButton();
        signoutButton = new javax.swing.JButton();
        browseMyViewing = new javax.swing.JButton();
        browseMyViewing1 = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(3, 0));

        browsePropertiesButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        browsePropertiesButton.setText("Browse properties");
        browsePropertiesButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        browsePropertiesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsePropertiesButtonActionPerformed(evt);
            }
        });
        add(browsePropertiesButton);

        addPropertyButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addPropertyButton.setText("Add Property");
        addPropertyButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        addPropertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPropertyButtonActionPerformed(evt);
            }
        });
        add(addPropertyButton);

        signoutButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signoutButton.setText("Sign out");
        signoutButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        signoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutButtonActionPerformed(evt);
            }
        });
        add(signoutButton);

        browseMyViewing.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        browseMyViewing.setText("Browse my viewing");
        browseMyViewing.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        browseMyViewing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseMyViewingActionPerformed(evt);
            }
        });
        add(browseMyViewing);

        browseMyViewing1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        browseMyViewing1.setText("Browse my offer");
        browseMyViewing1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        browseMyViewing1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseMyViewing1ActionPerformed(evt);
            }
        });
        add(browseMyViewing1);
    }// </editor-fold>//GEN-END:initComponents

    private void browsePropertiesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsePropertiesButtonActionPerformed
        // TODO add your handling code here:
        MainWindow.changePanel(new BrowsePropertiesPanel());
    }//GEN-LAST:event_browsePropertiesButtonActionPerformed

    private void signoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutButtonActionPerformed
        MainWindow.frameMain.dispose();
        MainWindow.frameMain.setVisible(false);
        LogIn2.main(null);

    }//GEN-LAST:event_signoutButtonActionPerformed

    private void addPropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPropertyButtonActionPerformed
        // TODO add your handling code here:
        AddPropertyPopUp2.main();
    }//GEN-LAST:event_addPropertyButtonActionPerformed

    private void browseMyViewingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseMyViewingActionPerformed
        // TODO add your handling code here:
        MainWindow.changePanel(new ViewingPanel());
    }//GEN-LAST:event_browseMyViewingActionPerformed

    private void browseMyViewing1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseMyViewing1ActionPerformed
        // TODO add your handling code here:
        MainWindow.changePanel(new BrowseMyOffer());
    }//GEN-LAST:event_browseMyViewing1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPropertyButton;
    private javax.swing.JButton browseMyViewing;
    private javax.swing.JButton browseMyViewing1;
    public javax.swing.JButton browsePropertiesButton;
    private javax.swing.JButton signoutButton;
    // End of variables declaration//GEN-END:variables
}
