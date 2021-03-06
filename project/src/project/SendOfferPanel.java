/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JOptionPane;
import static project.Tokeniser.Token.BUYER;

/**
 *
 * @author nicol
 */
public class SendOfferPanel extends javax.swing.JPanel {
    private Property property; 
    private Offer offer;
    /**
     * Creates new form SendOfferPanel
     */
    public SendOfferPanel(Property property, Offer offer) {
        this.property= property;
        this.offer = offer;
        initComponents();
        loadData();
    }
    
    public SendOfferPanel(Property property, Offer offer, boolean varDebile) {
        initComponents();
        this.property= property;
        this.offer = offer;
        if (varDebile){
            jLabel1.setVisible(false);
        }
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        initialPrice = new javax.swing.JLabel();
        priceOfOffer = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        areaLabel = new javax.swing.JLabel();
        acceptOffer = new javax.swing.JButton();
        declineOffer = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(197, 217, 217));
        setMaximumSize(new java.awt.Dimension(32767, 120));
        setPreferredSize(new java.awt.Dimension(708, 145));

        jLabel1.setText(" You have already sent an offer :   ");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        initialPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        initialPrice.setForeground(new java.awt.Color(204, 0, 51));
        initialPrice.setText("initial price :");

        priceOfOffer.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        priceOfOffer.setForeground(new java.awt.Color(255, 153, 0));
        priceOfOffer.setText("offerPrice");

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        titleLabel.setText("Title");

        areaLabel.setText("area");

        acceptOffer.setText("Accept Offer");
        acceptOffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptOfferActionPerformed(evt);
            }
        });

        declineOffer.setText("Decline Offer");
        declineOffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineOfferActionPerformed(evt);
            }
        });

        statusLabel.setText("Status :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(18, 18, 18)
                        .addComponent(statusLabel))
                    .addComponent(areaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(acceptOffer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(declineOffer)
                        .addGap(18, 18, 18)
                        .addComponent(initialPrice))
                    .addComponent(priceOfOffer, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(initialPrice)
                            .addComponent(titleLabel)
                            .addComponent(acceptOffer)
                            .addComponent(declineOffer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceOfOffer)
                    .addComponent(areaLabel))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(66, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void acceptOfferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptOfferActionPerformed
        // TODO add your handling code here:
        // accept offer
        int input = JOptionPane.showConfirmDialog(this, 
                "Accept this proposition : "+offer.getOfferPrice()+"???", "Confirmation dialogue", 
                JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (input == 0){
            // yes
            BDD.setStatusOffer(offer.getOfferId(),"ACCEPTED");
            MainWindow.changePanel(new BrowseMyOffer());
        }
    }//GEN-LAST:event_acceptOfferActionPerformed

    private void declineOfferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineOfferActionPerformed
        // TODO add your handling code here:
        // decline offer
        int input = JOptionPane.showConfirmDialog(this, 
                "Decline this proposition : "+offer.getOfferPrice()+"???", "Confirmation dialogue", 
                JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (input == 0){
            // yes
            BDD.setStatusOffer(offer.getOfferId(),"DECLINED");
            MainWindow.changePanel(new BrowseMyOffer());
        }
    }//GEN-LAST:event_declineOfferActionPerformed
    private void loadData(){
        if (MainWindow.getUser().getToken() == BUYER){
            acceptOffer.setVisible(false);
            declineOffer.setVisible(false);
        }
        initialPrice.setText("initial price : "+Integer.toString(property.getPrice())+" ???");
        areaLabel.setText(Double.toString(property.getArea())+" m??");
        priceOfOffer.setText(Integer.toString(offer.getOfferPrice())+" ");
        titleLabel.setText(property.getTitle());
        statusLabel.setText("Status : "+offer.getStatus());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptOffer;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JButton declineOffer;
    private javax.swing.JLabel initialPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel priceOfOffer;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
