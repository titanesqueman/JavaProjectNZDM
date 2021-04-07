/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JToolBar.Separator;

/**
 *https://perso.limsi.fr/vernier/BiSlider/
 * https://perso.limsi.fr/vernier/BiSlider/docs/
 * comparable to http://vernier.frederic.free.fr/BiSlider/stageFV-BISLIDER.html
 * @author Drazic
 */
public class BrowsePropertiesPanel extends JPanel {
    private int minPrice = 0;
    private int maxPrice = 9999999;
    private int minArea = 0;
    private int maxArea = 99999999;
    private String orderBy = "ASC";
    private String sortBy = "price";
    final private Color myPropertiesColor = new Color(183, 142, 142, 45);

    /**
     * Creates new form BrowseProperties
     */
    public BrowsePropertiesPanel() {
        initComponents();
        
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
       
        loadAllProperties();
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
        priceMaxLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        priceMinLabel = new javax.swing.JLabel();
        rangeSlider1 = new com.jidesoft.swing.RangeSlider();
        areaMinLabel = new javax.swing.JLabel();
        rangeSlider2 = new com.jidesoft.swing.RangeSlider();
        areaMaxLabel = new javax.swing.JLabel();
        areaLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        orderCombo = new javax.swing.JComboBox<>();
        sortLabel = new javax.swing.JLabel();
        sortCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        container = new javax.swing.JPanel();
        backButton21 = new project.BackButton2();

        setBackground(new java.awt.Color(245, 219, 205));

        jLabel1.setText("Browse Properties");

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 0, 102)));

        priceMaxLabel.setText("2,000,000 €");

        priceLabel.setText("Price");

        priceMinLabel.setText("0 €");

        rangeSlider1.setMajorTickSpacing(25000);
        rangeSlider1.setMaximum(2000000);
        rangeSlider1.setSnapToTicks(true);
        rangeSlider1.setExtent(2500000);
        rangeSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rangeSlider1StateChanged(evt);
            }
        });
        rangeSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rangeSlider1MouseReleased(evt);
            }
        });

        areaMinLabel.setText("0 m²");

        rangeSlider2.setMajorTickSpacing(10);
        rangeSlider2.setMaximum(500);
        rangeSlider2.setSnapToTicks(true);
        rangeSlider2.setLowValue(0);
        rangeSlider2.setName(""); // NOI18N
        rangeSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rangeSlider2StateChanged(evt);
            }
        });
        rangeSlider2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rangeSlider2MouseReleased(evt);
            }
        });

        areaMaxLabel.setText("500 m²");

        areaLabel.setText("Area");

        jLabel2.setText("Order");

        orderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));
        orderCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderComboActionPerformed(evt);
            }
        });

        sortLabel.setText("Sort by");

        sortCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Price", "Area" }));
        sortCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(priceMinLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(priceMaxLabel))
                    .addComponent(rangeSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(areaMinLabel)
                        .addGap(230, 230, 230)
                        .addComponent(areaMaxLabel))
                    .addComponent(rangeSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(priceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(areaLabel)
                .addGap(111, 111, 111))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(sortLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sortCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areaLabel)
                    .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rangeSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areaMinLabel)
                            .addComponent(areaMaxLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rangeSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceMaxLabel)
                            .addComponent(priceMinLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(orderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sortLabel)
                                .addComponent(sortCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rangeSlider2.getAccessibleContext().setAccessibleName("");

        container.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 0, 51)));
        container.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        container.setMaximumSize(new java.awt.Dimension(300, 300));
        container.setLayout(new javax.swing.BoxLayout(container, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(container);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rangeSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rangeSlider2StateChanged
        minArea = rangeSlider2.getLowValue();
        maxArea = rangeSlider2.getHighValue();
        
        String min_txt = Integer.toString(minArea);
        String max_txt = Integer.toString(maxArea);
        areaMinLabel.setText(min_txt+" m²");
        areaMaxLabel.setText(max_txt+" m²");
    }//GEN-LAST:event_rangeSlider2StateChanged

    private void rangeSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rangeSlider1StateChanged
        Locale locale  = new Locale("en", "UK");
        String pattern = "###,###,###";

        DecimalFormat decimalFormat = (DecimalFormat)
        NumberFormat.getNumberInstance(locale);
        decimalFormat.applyPattern(pattern);
        
        minPrice = rangeSlider1.getLowValue();
        maxPrice = rangeSlider1.getHighValue();
        
        String formatmax = decimalFormat.format(maxPrice);
        String formatmin = decimalFormat.format(minPrice);
        priceMinLabel.setText(formatmin+" €");
        priceMaxLabel.setText(formatmax+" €");
    }//GEN-LAST:event_rangeSlider1StateChanged

    private void rangeSlider2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rangeSlider2MouseReleased
        // TODO add your handling code here:
        loadPropertiesFilter();
    }//GEN-LAST:event_rangeSlider2MouseReleased

    private void rangeSlider1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rangeSlider1MouseReleased
        // TODO add your handling code here:
        loadPropertiesFilter();
    }//GEN-LAST:event_rangeSlider1MouseReleased

    private void orderComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderComboActionPerformed
        // TODO add your handling code here:
        int selected = orderCombo.getSelectedIndex();
        if (selected == 1){
            orderBy = "DESC";
        }else{
            orderBy = "ASC";
        }
        
        loadPropertiesFilter();
    }//GEN-LAST:event_orderComboActionPerformed

    private void sortComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortComboActionPerformed
        // TODO add your handling code here:
        int selected = orderCombo.getSelectedIndex();
        if (selected == 1){
            sortBy = "area";
        }else{
            sortBy = "price";
        }
        
        loadPropertiesFilter();
    }//GEN-LAST:event_sortComboActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaLabel;
    private javax.swing.JLabel areaMaxLabel;
    private javax.swing.JLabel areaMinLabel;
    private project.BackButton2 backButton21;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> orderCombo;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel priceMaxLabel;
    private javax.swing.JLabel priceMinLabel;
    private com.jidesoft.swing.RangeSlider rangeSlider1;
    private com.jidesoft.swing.RangeSlider rangeSlider2;
    private javax.swing.JComboBox<String> sortCombo;
    private javax.swing.JLabel sortLabel;
    // End of variables declaration//GEN-END:variables
    
    private void loadAllProperties() {
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "SELECT * FROM property"
                    + "     WHERE isSell = false";
            
            st = MainWindow.getUser().getCon().prepareStatement(query);
            
            rs = st.executeQuery();
            
            while(rs.next()){
                
                Property p = Property.getPropertyFromRS(rs);
                
                if (p != null){
                    PropertyScroolPaneElement2 newpPropertyScroolPaneElement = new PropertyScroolPaneElement2(p);
                    container.add(newpPropertyScroolPaneElement);
                    if (BDD.isMyProperty(MainWindow.getUser().userId, p.propertyId)){
                        newpPropertyScroolPaneElement.setBackground(myPropertiesColor);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadPropertiesFilter(){
        
        container.removeAll();
        // refresh
        container.revalidate();
        container.repaint();
        try {
            ResultSet rs = BDD.propertiesFilter(minPrice, maxPrice, minArea, maxArea, sortBy, orderBy);
            
            if (rs == null) return;
            
            while(rs.next()){
                Property p = Property.getPropertyFromRS(rs);
                
                if (p != null){
                    PropertyScroolPaneElement2 newpPropertyScroolPaneElement = new PropertyScroolPaneElement2(p);
                    container.add(newpPropertyScroolPaneElement);
                    if (BDD.isMyProperty(MainWindow.getUser().userId, p.propertyId)){
                        newpPropertyScroolPaneElement.setBackground(myPropertiesColor);
                    }
                }
                // refresh
                container.revalidate();
                container.repaint();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BrowsePropertiesPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
