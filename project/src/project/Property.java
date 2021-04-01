/*
 * To change this license header, choose License Headers in Project Property.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nicol
 * @author drazic
 */
public class Property {
    protected int propertyId;
    protected String address;
    protected String title;
    protected double area;
    protected String features;
    protected int price;

    public Property(int propertyId, String title, String address, double area, String features, int price) {
        this.propertyId = propertyId;
        this.title = title;
        this.address = address;
        this.area = area;
        this.features = features;
        this.price = price;
    }
    
    static Property getPropertyFromRS(ResultSet rs) {
        try {
            return new Property(rs.getInt("propertyId"),rs.getString("title"),rs.getString("address"),rs.getDouble("area"),null,rs.getInt("price"));
        } catch (SQLException ex) {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public String getAddress() {
        return address;
    }

    public String getTitle() {
        return title;
    }

    public double getArea() {
        return area;
    }

    public String getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }
    
    
}
