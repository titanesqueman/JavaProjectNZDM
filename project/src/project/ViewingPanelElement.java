/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Drazic
 */
public class ViewingPanelElement extends javax.swing.JPanel {
    int day;
    int month;
    int year;
    int hour;
    int price;
    String title;
    double area;
    /**
     * Creates new form ViewingPanelElement
     */
    public ViewingPanelElement(int year, int month, int day, int hour, int price, String title, double area) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.area = area;
        this.title = title;
        this.price = price;
        initComponents();
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

        hourLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        areaLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(32767, 50));

        hourLabel.setText("hourStart");

        titleLabel.setText("Title");

        areaLabel.setText("area");

        priceLabel.setText("price");

        dateLabel.setText("date :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(areaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(priceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hourLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(dateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourLabel)
                    .addComponent(areaLabel)
                    .addComponent(priceLabel))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel hourLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    private void loaddata() {
        String date = String.format("date : %02d/%02d/%02d",day,month,year);
        dateLabel.setText(date);
        hourLabel.setText(Integer.toString(hour)+"h-"+Integer.toString(hour+1)+"h");
        
        Locale locale  = new Locale("en", "UK");
        String pattern = "###,###,###";

        DecimalFormat decimalFormat = (DecimalFormat)
        NumberFormat.getNumberInstance(locale);
        decimalFormat.applyPattern(pattern);
        
        String priceTemp = decimalFormat.format(price);
        priceLabel.setText(priceTemp+"€");
        areaLabel.setText("area : "+area+" m²");
        titleLabel.setText(title);
        
        System.out.println(title);
    }
}
